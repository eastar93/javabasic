package kr.co.ictedu.user.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ictedu.user.model.UsersDAO;
import kr.co.ictedu.user.model.UsersVO;

public class UserJoinService implements IUserService {

	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
			
			String userId = request.getParameter("userId");
			String userPw = request.getParameter("userPw");
			String userName = request.getParameter("userName");
			String userEmail = request.getParameter("userEmail");
			System.out.println(userId);
						
			UsersVO user = new UsersVO(userId, userPw, userName, userEmail);
				
			UsersDAO dao = UsersDAO.getInstance();
			
			int resultcode = dao.joinUsers(user);
			System.out.println(resultcode);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}