package kr.co.ictedu.user.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.user.model.UsersDAO;
import kr.co.ictedu.user.model.UsersVO;

public class UserDeleteService implements IUserService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = null;
		session = request.getSession();
		
		String uid = (String)session.getAttribute("i_s");
		String upw = (String)session.getAttribute("p_s");
		String dpw = request.getParameter("dpw");
		
		UsersDAO dao = UsersDAO.getInstance();
		UsersVO user = new UsersVO();
		user.setUpw(upw);
		user.setUid(uid);
		
		dao.usersDelete(user, dpw);

		
	}
	
	

}
