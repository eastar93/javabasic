package String01;

import java.util.Scanner;

public class String03 {
	
	public static void main(String[] args) {
		//Scanner를 통해서 전체 문장을 입력받으세요.
		//다음으로 문장내에서 찾고 싶은 단어를 입력받으세요.
		//문장 내에 있는 단어들의 인덱스 번호와, 몇 개가 검출되었는지
		//출력해주는 코드를 작성해보세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("전체 문장을 입력해주세요.");
		String all = sc.nextLine();
		
		System.out.println("문장 내에서 카운트할 단어를 입력해주세요.");
		String voca = sc.nextLine();
		
		//갯수 카운팅
		int count = 0;
		//반복문 추가 실행 여부
		Boolean bool = true;
		//마지막으로 발견된 지점
		int fidx = -1;
		
		while(bool)
		{
				count++;
				int result = all.indexOf(voca);
				System.out.printf("%d번에서 %d번째 %s가 검출되었습니다.%n",all.indexOf(voca), count, voca);
				System.out.printf("%s가 총 출현한 횟수는 %s회입니다.%n", voca, count);
				bool = false;			
		}		
	}
}
