package kr.co.ictedu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.board.service.BoardDeleteService;
import kr.co.ictedu.board.service.BoardDetailService;
import kr.co.ictedu.board.service.BoardListService;
import kr.co.ictedu.board.service.BoardPagingService;
import kr.co.ictedu.board.service.BoardUpdateService;
import kr.co.ictedu.board.service.BoardUpdateServiceOk;
import kr.co.ictedu.board.service.BoardWriteService;
import kr.co.ictedu.board.service.IBoardService;
import kr.co.ictedu.user.service.IUserService;
import kr.co.ictedu.user.service.UserDeleteService;
import kr.co.ictedu.user.service.UserJoinService;
import kr.co.ictedu.user.service.UserLoginService;
import kr.co.ictedu.user.service.UserLogoutService;
import kr.co.ictedu.user.service.UserUpdateService;

/**
 * Servlet implementation class PatternServlet
 */
// *.do로 잡힌 패턴은 .do로 끝나는 접속주소를 모드 잡아옵니다.
// 확장자 패턴은 /를 빼고 작성합니다.
@WebServlet("*.do")
public class PatternServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatternServlet() {
        super();
        System.out.println("확장자 패턴 생성");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("확장자 패턴 서버 연결");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("확장자 패턴 소멸");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doRequest(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doRequest(request, response);
	}

	// 만약 요청 메서드(get, post) 상관 없이 처리하게 만들고 싶다면
	// 메서드 하나를 더 만들어서 요청한다.
	protected void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 서비스 호출을 위해 모든 서비스 자료형을 받을 수 있는
		// 인터페이스를 생성합니다.
		IBoardService bsv = null;
		IUserService usv = null;
		
		
		// 해당 로직을 실행한 뒤에 넘어갈 .jsp 파일 명칭/경로 지정
		String ui = null;
		
		// 세션 쓰는법
		HttpSession session = null;
		session = request.getSession();
	
		// 콘솔이 아닌 사용자가 확인할 수 있도록 .jsp화면에
		// 변수에 담긴 자료를 찍는 out.print(); 사용을 위한
		// 사전 준비
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		// jsp페이지가 html형식으로 이뤄져 있음을 알려주는 코드
		response.setContentType("text/html; charset=UTF-8"); 
		
		// doGet에 있던 모든 코드를 가져옵니다.
		// 확장자 패턴에서 확장자를 포함한 주소값을 가져오기 위해서
		// 아래 코드를 사용합니다.
		String uri = request.getRequestURI();
		System.out.println("URI패턴 : " + uri);
		
		PrintWriter out = response.getWriter();
		
		if(uri.equals("/MyFirstWeb/join.do")) {
			System.out.println(request);
			usv = new UserJoinService();
			usv.execute(request, response);
			ui = "/users/user_login.jsp";
			
		} else if(uri.equals("/MyFirstWeb/login.do")) {
			usv = new UserLoginService();
			usv.execute(request, response);
			// 세션에서 로그인 여부 확인
			String result = (String)session.getAttribute("login");
			if(result != null && result.equals("fail")) {
				session.invalidate();
				ui = "/users/user_login.jsp";
			} else {
				ui = "/boardselect.do";				
			}
		} else if(uri.equals("/MyFirstWeb/userupdate.do")) {
			usv = new UserUpdateService();
			usv.execute(request, response);
			ui = "/users/user_login.jsp";
		} else if(uri.equals("/MyFirstWeb/userlogout.do")) {
			usv = new UserLogoutService();
			usv.execute(request, response);
			ui = "/users/user_login.jsp";
		} else if(uri.equals("/MyFirstWeb/userdelete.do")) {
			usv = new UserDeleteService();
			usv.execute(request, response);
			ui = "/users/user_login.jsp";		
		// PatternServlet2의 패턴을 .do로 고쳐서 여기 옮겨주세요.
		} else if(uri.equals("/MyFirstWeb/boardwrite.do")) {
			// 글쓰기에 필요한 로직을 호출하도록 서비스를 생성합니다.
			bsv = new BoardWriteService();
			// BoardWriteService의 execute를 호출하면
			// 복잡한 서비스 로직을 이 파일에는 한 줄만 기입해서 처리합니다.
			bsv.execute(request, response);
			// 경로 저장시 / 는 WebContent폴더가 기본으로 잡혀있습니다.
			ui = "/boardselect.do";
			// 경로 저장 후에는 페이지 강제이동(forward)를 수행합니다.
			
		} else if(uri.equals("/MyFirstWeb/boardupdate.do")) {
			bsv = new BoardUpdateService();
			bsv.execute(request, response);
			ui = "/board/board_update.jsp";
		} else if(uri.equals("/MyFirstWeb/boardupdateok.do")) {
			// 1. 서비스 객체 생성
			bsv = new BoardUpdateServiceOk();
			// 2. 서비스 메서드 실행
			bsv.execute(request, response);
			// 3. 수정한 다음은 디테일로 보내기
			// 내가 수정한 글 번호 받아오기
			String strbid = request.getParameter("bid");
			ui = "/boarddetail.do?bid=" + strbid;
			
		} else if(uri.equals("/MyFirstWeb/boarddelete.do")) {
			bsv = new BoardDeleteService();
			bsv.execute(request, response);
			ui = "/boardselect.do";			
		} else if(uri.equals("/MyFirstWeb/boardselect.do")) {
			// 글 조회창 로직을 실행하도록 내부 코드를 작성해주세요.
			// bsv = new BoardListService();
			// bsv.execute(request, response);
			// ui = "/board/board_list.jsp";
			
			// 위의 일반 전체게시물 가져오기를 페이징 가져오기로 대처해주세요.
			bsv = new BoardPagingService();
			bsv.execute(request, response);
			ui = "/board/board_list.jsp";
			
		} else if(uri.equals("/MyFirstWeb/boarddetail.do")) {
			bsv = new BoardDetailService();
			bsv.execute(request, response);
			ui = "/board/board_detail.jsp";
			
		} else {
			out.println("잘못된 패턴입니다.");
		}
		
		// 포워드 로직은 조건문이 모두 작동한 뒤에 실행합니다.
		// RequestDispatcher를 사용해 포워딩을 하면
		// request, response및 자료를 jsp페이지에 전달할 수 있습니다.
		// 모델2 방식은 스크립트릿을 쓰지 않기 때문에
		// 컨트롤러단에서 출력에 필요한 데이터를 받아놨다
		// 포워드로 .jsp에 전달합니다.
		RequestDispatcher dp = 
				request.getRequestDispatcher(ui);
		dp.forward(request, response);
	}
}
