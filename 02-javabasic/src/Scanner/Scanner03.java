package Scanner;
import java.util.Scanner;

public class Scanner03 {
	
	public static void main(String[] args) {
		/*
		 * 환율 계산기를 만들어 보겠습니다.
		 * 네이버에 검색해서 원하는 국가 화폐의 환율을 rate변수에 저장해주세요.
		 * 스캐너를 이용해 won변수에 원화 금액을 입력해주세요.
		 * 원화와 환율을 이용해서
		 * 원화 XXXX원을 환전시 XXXX(화폐)입니다.로 결과물을 출력해주세요
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원화 금액 : ");
		int won = sc.nextInt();
		
		double rate = 917.52;
		
		System.out.printf("캐나다 달러 환율은 1달러에  %.2f 원입니다.\n",rate);
		System.out.printf("입력하신 원하는  %d 원을 달러로 환전시  %d달러입니다.%n",won, Math.round(won/rate)); //Math.round(실수값):입력된 실수값을 반올림 시켜준다.
		System.out.printf("입력하신 원하는  %d 원을 달러로 환전시  %.0f달러입니다.",won, won/rate); //%.xf : 실수 뒤에 자리수가 x값 만큼 올라가서 표현된다.
		sc.close();
	}

}
