package System01;

import java.util.Scanner;

public class TimeCheck02 {
	
	public static void main(String[] args) {
		//tryCatch구문의 소요시간을 구해주세요
		//여러분들이 직접 원하는 종류의 예외를 발생시켜주세요.
		
		long start = System.currentTimeMillis();
		System.out.println(start);
		long all = 0;
		
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
		
		for(int i = 0; i < 2000000000; i++) {
			all += 1;
		}
		
		//끝나는 시점
		long end = System.currentTimeMillis();
		System.out.println(end);
		//소요시간 측정
		System.out.println(end-start);
	}	
}

