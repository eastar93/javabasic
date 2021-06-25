package For;
import java.util.Scanner;

public class For02 {
	
	public static void main(String[] args) {
		
		/*
		 * Hello Java!를 입력한 횟수만큼 출력하는 구문을 작성해보세요.
		 * 입력은 Scanner로 받습니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("횟수 입력 : ");
		int a = sc.nextInt();
		
		for(int i = 1; i <= a; i++)
		{
			System.out.println("Hello Java!" + i);
		}
		sc.close();
	}

}
