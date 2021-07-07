package bonus;
import java.util.Scanner;

public class Bonus4 {
	
	//이중 반복문을 이용해
	//n을 입력받았을때 4~n까지의 범위에서
	//소수만 출력해주는 코드를 작성해주세요.

	//*소수 = 1과 자기 자신으로만 나눌 수 있는 숫자
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 까지의 숫자 중 소수만 탐색하시겠습니까?");
		int Num = sc.nextInt(); //숫자하나를 입력받고
		boolean isOK; //참거짓 논리값 isOK를 선언하고
		for(int i=4; i<Num; i++) { //i는 4부터 입력 받은 값까지 증가시킨다.
			isOK = false; //isOK라는 논리값을 거짓으로 선언하고
			for(int j=2; j<i; j++) { //j=2부터 i-1까지 i를 증가시킨다.
				if(i % j == 0) { 
					isOK = true; //i값을 j로 나눈값이 0일 경우 isOK값을 참으로 바꿔서 for문을 빠져나오고/i값을 j의 마지막 값까지 나눈 값이 0이 아닌경우 isOK는 위에서 선언한 false 값으로 빠져나온다.
				}
				if((i-1 == j) && !isOK) { //i-1값과 j값을 비교한 논리값과 isOK가 빠져나온값을 부정시켜서 두 값을 비교 한 값이 참이면 아래 출력문을 실행한다.
					System.out.println(i + "은 소수입니다.");	
				}
			}			
		}
		sc.close();
	}
}