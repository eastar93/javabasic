package kr.co.ictedu.user.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.user.model.UsersDAO;
import kr.co.ictedu.user.model.UsersVO;

// 인터페이스 구현해주세요
public class UserLoginService implements IUserService{

	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");

			// 폼에서 날린 데이터 받아주세요.
			String userId = request.getParameter("userId");
			String userPw = request.getParameter("userPw");
			
			// 세션 쓰는법
			HttpSession session = null;
			session = request.getSession();
			
			// VO 생성 및 데이터 입력
			UsersVO user = new UsersVO();
			user.setUid(userId);
			user.setUpw(userPw);
			
			// 그거 넣어서 dao호출해주세요.
			UsersDAO dao = UsersDAO.getInstance();
			
			int resultCode = dao.usersLogin(user);
			
			if(resultCode == 1) {
				
				// 통과시 세션발급을 해주세요
				session.setAttribute("i_s", userId);
				session.setAttribute("p_s", userPw);

			} else if(resultCode == 0) {
				session.setAttribute("login", "fail");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
