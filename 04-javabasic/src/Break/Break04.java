package Break;

import java.util.Scanner;

public class Break04 {
	
	public static void main(String[] args) {
		
		/*
		 * Scanner로 정수를 입력받으세요.
		 * 1~n까지 차곡 차곡 더해 나갔을때
		 * 1부터 몇까지 더해야 입력된 정수를 초과하는지 계산해주는 
		 * 프로그램을 작성해주세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int Goal = sc.nextInt(); //Goal이라는 숫자를 입력받는다.
		int total = 0; //total값을 0으로 초기화
		int count = 1; //count값을 1로 초기화
		while(true) //while문을 무한으로 돌린다
		{
			total+=count; //total값에 count를 더해서 저장한다.
			System.out.printf("1부터 %d까지의 총합은 : %d입니다.%n",count,total); //1부터 count값까지의 총합은 : total값입니다.를 출력
			if(total >= Goal) //total값이 Goal보다 크거나 같으면 아래 출력문 3개를 출력 크거나 같지 않다면 if문을 나오고 
			{
				System.out.println("목표값 : " + Goal);
				System.out.println("총합 : " + total);
				System.out.println("몇 까지 더했냐? : " + count);
				break; //if문의 조건을 충족하여 break를 만나 가까운 반복문 while을 종료시킨다.
			}
			count++; //count값을 1증가하고 다시 total += count로 이동
			sc.close();
		}
	}

}
