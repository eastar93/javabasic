package Break;

public class Break02 {
	
	public static void main(String[] args) {
		
		/*
		 * 중첩 반복문 사용시 전체 다 종료가 아닌 내부 반복문만 종료하는 예시
		 * 구구단 출력, 단 n*5까지만 출력하는 예시
		 */
		
		for(int i = 2; i <= 9; i++) //i는 2부터 9이하일때까지 증가
		{
			System.out.printf("%d단 출력%n",i); //i단 출력을 출력한다.
			for(int j = 1; j <= 9; j++) //j는 1부터 9이하 일때까지 j를 증가.
			{
				if(j > 5) //j값이 증가하는 동안 j가 5를 넘었을 경우 *6이상은 직접 알아보기를 출력
				{
					System.out.println("*6이상은 직접 알아보기");
					break; //j값이 5를 넘어서서 출력문을 출력하고 가까운 반복문인 for문(j)를 끝내고 아래 출력문을 출력하고 for문(i)로 올라간다.
				}
				System.out.printf("%d*%d=%d%n",i,j,i*j); //i값 * j값 = i*j값을 출력한다.
			}
			System.out.println("-------------------");
		}
	}

}