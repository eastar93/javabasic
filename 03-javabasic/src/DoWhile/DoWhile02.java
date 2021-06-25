package DoWhile;
import java.util.Scanner;

public class DoWhile02 {
	
	public static void main(String[] args) {
		/*
		 * 여러분들이 배달 어플을 만들었습니다.
		 * 이 어플은 주문금액을 입력받습니다.
		 * 주문금액이 15000미만이면 프로그램이 멈춥니다.
		 * 주문금액은 Scanner를 이용해 order변수에 직접 입력받습니다.
		 * 단, do while로 작성해 첫 주문금액이 15000미만이어도 "배달을 완료했습니다."라고 출력 한 뒤
		 * 다시 주문 금액을 입력받는 로직을 반복문 내부에 작성해주세요 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("배달금액을 입력해주세요.");
		int order = sc.nextInt();
		
		do 
		{
			System.out.println("주문금액은 " + order + "원입니다."); 
			System.out.println("배달을 완료했습니다.");
			System.out.println("다음 배달금액을 입력해주세요");
			order = sc.nextInt(); //order에서 입력받는 값을 초기화해서 재입력 받는다.
			//출력문 3개를 출력하고 order값을 재입력 받는다.
		}
		while(order>=15000); //order값이 15000원 이상이면 do문을 반복으로 돈다.		
		System.out.println("금액이 모자라 배달 서비스가 종료되었습니다."); //order값이 15000미만이면 출력하고 종료된다.
		sc.close();
	}
}
