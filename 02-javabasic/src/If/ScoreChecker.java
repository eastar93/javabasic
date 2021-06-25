package If;
import java.util.Scanner;

public class ScoreChecker {
	
	public static void main(String[] args) {
		/*
		 * 성적 판독기를 만들어보겠습니다.
		 * if ~ else if ~ else구문을 사용해 만들어주세요.
		 * 성적 기준은 95점 이상 A+, 90점 이상 A0, 85이상 B+
		 * 80이상 B0, 75이상 C+, 70이상 C0, 65이상 D+,
		 * 60점 이상 D0, 60미만 F로 프린트 구문으로 콘솔에 출력해주세요
		 * 스캐너로 int score 변수에 성적을 입력받습니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		if(score == 100)
		{
			System.out.println("만점입니다.");
		}
		else if(score >= 95)
		{
			System.out.println("A+");
		}
		else if(score >= 90)
		{
			System.out.println("A0");
		}
		else if(score >= 85)
		{
			System.out.println("B+");
		}
		else if(score >= 80)
		{
			System.out.println("B0");
		}
		else if(score >= 75)
		{
			System.out.println("C+");
		}
		else if(score >= 70)
		{
			System.out.println("C0");
		}
		else if(score >= 65)
		{
			System.out.println("D+");
		}
		else if(score >= 60)
		{
			System.out.println("D0");
		}
		else
		{
			System.out.println("F");
		}
		sc.close();		
	}

}
