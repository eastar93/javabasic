package For;

public class For04 {
	
	public static void main(String[] args) {
		/*
		 * 중첩 반복문은 반복문을 반복시키는 구문입니다.
		 * 실행 횟수는 바깥쪽 반복문 횟수 * 안쪽 반복문 횟수입니다.
		 * 실질적으로 쓸 일이 가장 많은 구문이므로 반드시 확실하게 익히고 넘어가야 합니다. 
		 */
		
		for(int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.println(i*j);
			}
		}		
	}

}
