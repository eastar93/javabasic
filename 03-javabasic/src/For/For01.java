package For;

public class For01 {

	public static void main(String[] args) {
		
		/*
		 * for문은 while문과 다르게 몇 바퀴 돌지 정해진 상황에서 사용하는 반복문이다.
		 * 문법은
		 * for(시작 변수; 종료조건; 증감식)
		 * 	  {
		 * 	       실행구문;
		 * 	  }
		 * 위와 같이 이루어져 있다.
		 */
		
		for(int i = 0; i < 2; i++) 
		{
			System.out.println("for를 이용한 반복문." + i);
		}
		
	}
}
