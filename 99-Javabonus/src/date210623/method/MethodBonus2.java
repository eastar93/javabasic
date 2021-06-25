package date210623.method;

public class MethodBonus2 {
	
	//void가 아닌 리턴 자료형을 가지는 메서드도
	//return구문 실행시 종료 됩니다.
	public static int getInt() 
	{
		System.out.println("인트 발송 전");
		if(3 < 5) {
			//(3 < 5)값이 참이기 때문에 값이 1이기 때문에 return1을  만나서 "인트 발송 전"을출력하고 끝난다.
			//(3 > 5)값이 참이기 때문에 값이 0이기 때문에 return0을 만나서 이전에 출력되는 "인트 발송 전"과 "인트 발송 후"를 출력하고 끝난다.
			return 1;
		}
		System.out.println("인트 발송 후");
		return 0;
	}
	
	public static void main(String[] args) {
		//리턴된 숫자를 출력하는 첫번째 방법
		int result = getInt();
		
		System.out.println(result);
		//리턴된 숫자를 출력하는 두번째 방법
		System.out.println(getInt());
		
	}

}
