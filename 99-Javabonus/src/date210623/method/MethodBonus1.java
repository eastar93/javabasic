package date210623.method;

public class MethodBonus1 {
	
	//return구문은 실행 즉시 메서드를 종료 시킵니다.
	//단, 자바에서는 return 아래쪽에 코드를 적는것만으로도
	//컴파일러가 문법 오류로 간주합니다.
	//return은 method에서 사용하는 break문 같은 것이다.
	
	public static void returnTest() {
		System.out.println("리턴구문 위쪽");
		if(2>0) {
			//단, 조건문 내부의 return문 아래에는 추가 코드를 작성 할 수 없다.
			//이 경우 break문처럼 즉시 메서드를 종료시킨다.
			return;
		}
		System.out.println("리턴구문 아래쪽");
	}
	
	public static void main(String[] args) {
		
		returnTest();
		
	}

}
