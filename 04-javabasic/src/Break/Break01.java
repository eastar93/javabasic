package Break;

public class Break01 {
	
	public static void main(String[] args) {
		
		/*
		 * break문은 반복문 내부에서 실행될 경우 즉시 반복문을 종료시킨다.
		 * break문은 중첩반복문에서 사용시 전체 반복문을 종료시키지 않고 
		 * break문이 속해있는 영역까지만 종료시킨다. 
		 */
		
		int a = 1; //a=1로 초기화
		int[] arr = {9, 8, 7, 6, 1, 2, 3, 4 ,5}; //{9, 8, 7, 6, 1, 2, 3, 4, 5}값을 갖는 arr라는 배열을 만들고 
		
		for(int num: arr) //arr에 num배열의 값을 한개씩 넣어준다 
		{
			if(a==num) //a값과 arr에서 받아온 num값을 같은지 비교
			{
				System.out.println("1이 나와서 종료합니다."); //a값과 num값이 같을경우 출력하고 break로 종료
				break;
			}
			System.out.printf("이번숫자는 %d.%n",num); //a값과 num값이 다른경우 출력하고 다시 (int num:arr)로 돌아가서 num값을 arr에서 하나 받아온다.
		}
	}

}