package string01;

import java.util.Scanner;

public class String05 {
	//.length()와 charAt()을 활용해 입력된 전체 문자열을
	//한 글자씩을 한줄 씩 출력하는 로직을 작성해보세요.
	//문자열은 Scanner로 입력받습니다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문장을 입력해주세요.");
		String s = sc.next();
		
		for(int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}
}
