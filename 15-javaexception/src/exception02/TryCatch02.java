package exception02;

import java.util.Scanner;

public class TryCatch02 {
	
	public static void main(String[] args) {
		//아까 exception1패키지 내부의 여러 예외 유형 중
		//하나를 골라서 예외가 발생할 수 있는 코드를 작성해 주세요.
		//발생할 예외에 대한 처리는 try~catch 블록을 활용합니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 몇번째 숫자를 볼지 입력해주세요 : ");
		int n = sc.nextInt();
		int[] arr = new int[5];
		for(int a : arr) {
			
			arr[0] = 7;
			arr[1] = 27;
			arr[2] = 36;
			arr[3] = 18;
			arr[4] = 49;
		}
		try  {
			//예외가 발생할 구문을 적는 블록. try블록은
			//반드시 하단에 catch블록이 추가로 작성되어야 한다.
			System.out.printf("배열의 %d번째 숫자는 %d입니다.%n", n, arr[n]);
		} catch(Exception e) {
			System.out.printf("배열의 %d번째 숫자는 존재 하지 않습니다.%n", n);
			//catch블록에는 (Exception e)가 기본으로 들어간다.
			//추후 특정한 종류의 예외만 처리하고 싶을때 다른 자료형을
			//적어주면 된다.
		} finally {
			//모든 실행구문이 끝나고 실행할 코드는
			//finally 블럭 내부에 작성합니다.
			System.out.println("배열의 숫자 조사 끝!");			
		}		
	}
}
