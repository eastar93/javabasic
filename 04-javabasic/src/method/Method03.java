package Method;

public class Method03 {
	
	public static void plus(int a, int b) { //아래에서 호출 받고 int a에 3/int b에 5를 받는다.
	//void - 반환타입 / plus - 변수 이름 / int a , int b - 매개 변수
		
		/*
		 * 내부 실행문에서 두개 이상의 변수를 요구한다면
		 * 두개 이상의 매개 변수를 선언 할 수 있습니다.
		 * 이 경우 상대적인 위치에 맞춰서 전달됩니다.
		 */
		
		System.out.println(a + b); //a+b값을 호출받은 값을 넣어서 두 값을 더하고 출력하고 반환하지 않는다.

	}
	
	public static void main(String[] args) { //main 메서드 생성
		plus(3, 5); //plus라는 변수 호출하고 3, 5값을 같이 보냄
	}

}
