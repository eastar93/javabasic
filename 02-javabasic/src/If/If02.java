package If;
import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		/*
		 * 주어진 변수 a에 스캐너로 정수값을 입력받게 만들어주세요.
		 * 입력받은 정수가 0이상이면 "0보다 크거나 같습니다"를 출력
		 * 그렇지 않다면 "0보다 작습니다"를 콘솔에 출력하는 코드를
		 * if문 2개를 이용해 구현해 주세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		
		if(a>0)
		{
			System.out.printf("입력한 수는 %d입니다%n",a);
			System.out.println("입력된  수는 0보다 큽니다.");
		}
		if(a==0)
		{
			System.out.printf("입력한 수는 %d입니다%n",a);
			System.out.println("입력된  수는 0입니다.");
		}
		if(a<0)
		{
			System.out.printf("입력한 수는 %d입니다%n",a);
			System.out.println("입력된 수는 0보다 작습니다.");
		}
		
		sc.close();
	}
}
