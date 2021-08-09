package kr.co.ictedu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
			out.println("회원가입 요청 확인");
		} else if(uri.equals("/MyFirstWeb/login.do")) {
			out.println("로그인 요청 확인");
		} else if(uri.equals("/MyFirstWeb/lupdate.do")) {
			out.println("회원 정보 수정 요청 확인");
		} else if(uri.equals("/MyFirstWeb/ldelete.do")) {
			out.println("회원 탈퇴 요청 확인");
		
		// PatternServlet2의 패턴을 .do로 고쳐서 여기 옮겨주세요.
		} else if(uri.equals("/MyFirstWeb/write.do")) {
			out.println("글쓰기 창으로 이동합니다.");
		} else if(uri.equals("/MyFirstWeb/wupdate.do")) {
			out.println("글 수정 창으로 이동합니다.");
		} else if(uri.equals("/MyFirstWeb/wdelete.do")) {
			out.println("글 삭제 창으로 이동합니다.");
		} else if(uri.equals("/MyFirstWeb/select.do")) {
			out.println("글 조회 창으로 이동합니다.");
		} else {
			out.println("잘못된 패턴입니다.");
		}
	}
}
