package Binary;

public class Binary01 {
	
	public static void main(String[] args) {
		/*
		 * 이항 연산자는 양 변에 피연산자를 하나씩 취한다.
		 * 산술연산자는 우리가 잘 알고 있는 사칙연산등을 활용하기 위한 연산자이며
		 * 연산 우선 순위도 그대로 계승한다.
		 * 단, %연산자의 우선순위는 *, /와 동일하다.
		 * + -> - -> *
		 */
		
		System.out.println(3 + 5);
		System.out.println(17 - 21);
		System.out.println(2 * 3);
		// /는 왼쪽 수를 오른쪽 수로 나눠 몫을 구합니다.
		// (정수 / 정수  = 정수)
		System.out.println(7 / 2);
		// %는 정수 최대 몫을 구하고 남은 값을 출력합니다.
		System.out.println(10 % 4);
		//연산 우선순위는 그대로 존재합니다.
		System.out.println(10 + 6 / 4);
		
		
	}

}
