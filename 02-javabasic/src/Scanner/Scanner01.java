package scanner;
import java.util.Scanner;

public class Scanner01 {
	
	public static void main(String[] args) {
		/*
		 * 코드 실행 중 사용자의 입력을 받는 경우 스캐너 기능을 사용
		 * Scanner 부분에 마음을 갖다대고 import를 해주시면 됩니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//정수 하나를 입력받음
		int a = sc.nextInt();
		
		//입력받은 정수를 출력
		System.out.println(a);
		
		sc.close();
	}

}
