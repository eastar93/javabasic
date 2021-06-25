package Continue;
import java.util.Scanner;

public class Continue02 {
	
	public static void main(String[] args) {
		
		/*
		 * 1부터 n까지 총 합을 구하되 홀수끼리만 더한 총합을 구하는 구문을 작성해주세요.
		 * continue문을 반드시 사용하는 로직을 작성해주세요.
		 * n은 스캐너로 입력받습니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("목표 숫자 : ");
		int FNum = sc.nextInt(); //FNum이라는 수를 입력받는다
		int total = 0; //total을 0으로 초기화
		
		for(int i=1; i<=FNum; i++) //i=1부터 입력받은 숫자까지 i값을 증가시킨다.
		{
			if(i%2==0) //i값을 2로 나눈 나머지가 0이되면
			{			
				continue; //continue를 만나서 다시 for(i)문으로 돌아가서 i값을 1증가한다.
			}
			total+=i; //i값이 2로 나눈 나머지 값이 0이 아닌 경우 total값에 더해서 저장해준다.
			System.out.printf("현재 1부터 %d까지 더했습니다.%n",i); 
			System.out.printf("총합은 %d입니다.%n",total);
		}
		sc.close();

// ------while문-----------
//		int total = 0;
//		int count = 0;
//		
//		while(count<FNum)
//		{
//			count+=1;
//			if(count%2==0)
//			{
//				continue;
//			}
//			total += count;
//			System.out.printf("현재 1부터 %d까지 더했습니다.%n",count); 
//			System.out.printf("총합은 %d입니다.%n",total);
//		}
	}
}
