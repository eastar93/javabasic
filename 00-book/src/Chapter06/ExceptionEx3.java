package Chapter06;

import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.Scanner;

class ExceptionEx3 {
	
	public static void main(String[] args) {
		
		int var = 50;
		try {
			
			System.out.print("정수 입력 : ");
			int data = new Scanner(System.in).nextInt();
			
			out.println(var/data);
//		} catch(Exception e) {
//			out.println("Exception~~!");		
		} catch(InputMismatchException ne) {
			out.println("숫자가 아닙니다.");
		} catch(ArithmeticException ae) {
			out.println("0으로 나눌순 없죠?");
		}
		out.println("프로그램 종료!");
	}
}
