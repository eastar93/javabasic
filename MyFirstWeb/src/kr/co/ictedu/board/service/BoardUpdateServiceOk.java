package kr.co.ictedu.board.service;

import java.sql.Timestamp;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardVO;

// IBoardService 구현하기
public class BoardUpdateServiceOk implements IBoardService{

	// 오버라이딩된 메서드 내부 작성하기.
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = null;
		session = request.getSession();
		String idSession = (String)session.getAttribute("i_s");
		
			if(idSession == null) {
				try {
					// 서비스 내부에서 포워딩을 시키면
					// 리다이렉트가 아니기 때문에 실행됨.
					String ui = "/users/user_login.jsp";
					RequestDispatcher dp = 
							request.getRequestDispatcher(ui);
					dp.forward(request, response);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}	
			// 1. 파라미터 6개 받아오기
			String strbid = request.getParameter("bid");
			int bid = Integer.parseInt(strbid);
			String bname = request.getParameter("bname");
			String btitle = request.getParameter("btitle");
			String bcontent = request.getParameter("bcontent");
			// str타입으로 들어온 Date를 Timestamp로 바꾸기
			String strbdate = request.getParameter("bdate");
			Timestamp bdate = Timestamp.valueOf(strbdate);
			
			String strbhit = request.getParameter("bhit");
			int bhit = Integer.parseInt(strbhit);
			
			// 2. VO생성해서 세터로 저장하기
			BoardVO board = new BoardVO();
			board.setBid(bid);
			board.setBname(bname);
			board.setBtitle(btitle);
			board.setBcontent(bcontent);
			board.setBdate(bdate);
			board.setBhit(bhit);

			
			// 3. DAO 생성 및 update로직 호출(update로직은 직접작성해주세요.)
			BoardDAO dao = BoardDAO.getInstance();
			dao.UpdateBoard(board);
	}	
}
