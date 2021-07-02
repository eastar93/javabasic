package Continue;

public class Continue01 {
	
	public static void main(String[] args) {
		
		/*
		 * continue문은 스킵기능을 생각하면 된다.
		 * 돌던 바퀴를 즉시 종료하고, 다음 바퀴를 이어서 실행한다.
		 * 전체 반복문을 종료시키는 break와 헷갈리지 않도록 주의
		 */
		
		for(int i=1; i<10; i++) //i는 1부터 10미만일때까지 증가
		{	
			if(i==6 || i==8) //i가 6또는 8과 같은지 비교하고 같으면 "출력되지 않은 숫자입니다."를 출력
			{
				System.out.println("출력되지 않는 숫자입니다.");
				continue; //if문의 i가 6또는 8과 같은지 비교대상에서 같은 경우에 continue와 만나서 다음 블럭은 무시하고 처음 for문(i)로 돌아가서 i를 증가시켜준다
			}
			System.out.printf("이번 숫자는 %d입니다.%n",i); //if문이 충족되지 않으면 이번숫자는 i입니다.를 출력
		}
		
	}

}
