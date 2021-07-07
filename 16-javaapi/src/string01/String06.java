package string01;

public class String06 {
	
	public static void main(String[] args) {
		//substring()은 인덱스 기준으로 앞 문자열을 삭제합니다.
		//인덱스 번호를 두 개 주면 처음 인덱스 번호 ~ 두번째 인덱스 번호 사이만 남겨줍니다.
		
		String str = "자바자바JSPJSP스프링스프링";
		String result = str.substring(5);
		//5번 자리를 시작점으로 잡고 나머지 0번자리부터 4번자리에 있는 문자를 삭제한다.
		System.out.println(result);
		
		result = str.substring(10, 15);
		//10번부터 15번사이(10~14)에 있는 문자열만 쓰고 나머지 배치되어있는 문자를 삭제한다.
		System.out.println(result);
	}

}
