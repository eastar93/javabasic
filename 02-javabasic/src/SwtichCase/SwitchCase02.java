package SwtichCase;
import java.util.Scanner;

public class SwitchCase02 {

	public static void main(String[] args) {
		/*
		 * Math.random(); 을 이용해 난수를 하나 발급받을 수 있고
		 * 난수의 범위는 0초과 1미만입니다.
		 * 뒤에 숫자를 곱하면 원하는 범위의 정수를 얻을 수 있다.
		 */
		
//		double number = Math.random()*10;
		
//		int intNum = (int)(Math.random()*10);
//		System.out.println(intNum);
		
		/*
		 * Switch ~ Case문을 이용해서
		 * 식당 이름을 출력하는 프로그램을 만들어보세요(최소6개)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int Num = (int)(Math.random()*7);
		switch(Num)
		{
			case 1: 
			{
				System.out.println("일미식당");
				break;
			}
			case 2:
			{
				System.out.println("코리아식당");
				break;
			}
			case 3:
			{
				System.out.println("장독대식당");
				break;
			}
			case 4:
			{
				System.out.println("싸다김밥");
				break;
			}
			case 5:
			{
				System.out.println("제치식당");
				break;
			}
			case 6:
			{
				System.out.println("미로식당");
				break;
			}
			default:
			{
				System.out.println("직접 찾아서 먹으렴");
				break;
			}
		}
		sc.close();
	}
}
