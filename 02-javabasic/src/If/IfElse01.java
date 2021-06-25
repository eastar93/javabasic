package If;

public class IfElse01 {

	public static void main(String[] args) {
		/*
		 * If~else구문은 참일때 실행 할 구문과 거짓일때 실행 할 구문을 함께 작성합니다.
		 * If~else구문은 한 구문으로 간주되어 연산횟수를 절약합니다.
		 * else문은 if문 없이 단독으로 쓰일 수 없다.
		 * else문은 조건식을 작성 할 필요가 없다.
		 */
		
		int a = 14;
		
		if(a == 15)
		{
			System.out.println("15입니다.");
		}
		else
		{
			System.out.println("15가 아닙니다.");
		}		
	}
}
