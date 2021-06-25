package For;
import java.util.Scanner;

public class For06 {
	
	public static void main(String[] args) {
		/*
		 * Scanner로 정수를 입력받게 해 주세요.
		 * 입력받은 정수의 제곱 형태의 정사각형이 찍히도록 
		 * 중첩 반복문을 작성해주세요.
		 * 3입력시
		 * ***
		 * ***
		 * ***과 같이 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");	
		int star = sc.nextInt();
		for(int i = 1; i<=star; i++)
		{
			for(int j= 1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
