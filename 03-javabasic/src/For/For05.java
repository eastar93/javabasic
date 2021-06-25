package For;

public class For05 {
	
	public static void main(String[] args) {
		
		/*
		 * 2~9단 까지 구구단을 출력하는 코드를 작성해주세요.
		 * 중첩 반복문을 써 주시면 됩니다.
		 */
		
		for(int i = 1; i <= 9; i++)
		{
			for(int j = 2; j <= 9; j++)
			{
				System.out.printf("%dx%d=%-3d",j,i,i*j);
			}
			System.out.println();
		}
	}
}
