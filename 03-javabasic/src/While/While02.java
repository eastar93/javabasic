package While;
import java.util.Scanner;

public class While02 {
	
	public static void main(String[] args) {
		
		/*
		 * 스캐너를 이용해서 String num 변수에 "문자열 형태인 숫자"를 입력받게 해 주세요.
		 * 이 문자자료 num을 int loop 변수에 정수로 변환해 저장하세요.
		 * loop 변수에 입력된 정수 횟수만큼 "반복문을 실행합니다 (횟수)"라는 문장이 콘솔에 출력되도록 while문을 작성해주세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 형태인 숫자 입력 : ");
		
		String num = sc.next();
		//num이라는 문자열을 받는다.
		int count = Integer.parseInt(num);
		//num이라는 값을 Integer.parseInt를 통해 숫자로 변환해서 count값에 넣는다.
		int loop = 0;
		//loop값을 0으로 초기화
		while(count>loop) //count값과 loop값을 비교
		{
			loop += 1; //loop값을 1증가시킨다.
			System.out.println(loop + "번 반복문을 실행합니다.");
		}
		sc.close();
	}
}
