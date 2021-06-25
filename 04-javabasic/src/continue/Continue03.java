package Continue;

public class Continue03 {
	
	public static void main(String[] args) {
		
		/*
		 * 다음은 학생들의 과목별 성적입니다.
		 * math = 96, 23, 52, 82, 72, 31, 58
		 * eng = 62, 42, 68, 31, 80, 77, 45
		 * com = 10, 28, 39, 74, 65, 90, 98
		 * 각 과목별 평균점수를 내주시되, 합격자 평균만 내주세요.
		 * 합격점수는 60점 이상입니다.
		 */
		
		int math[] = {96, 23, 52, 82, 72, 31, 58};
		int eng[] = {62, 42, 68, 31, 80, 77, 45};
		int com[] = {10, 28, 39, 74, 65, 90, 98};
		int total = 0; //total값을 0으로 초기화
		int avg = 0; //avg값을 0으로 초기화
		int count = 0; //count값을 0으로 초기화
		
		for(int score:math) //math 배열에 있는 값을 score에서 하나씩 받아본다
		{
			if(score<60) //math에서 받아온 score값이 60미만일 경우
			{
				continue; //continue를 만나서 아래 명령문을 실행 하지 않고 다시 math배열에서 값을 score에서 받는다.
			}
			else //score값이 60이상일 경우
			{
			total+=score; //total에 score값을 더해간다
			++count; //score이 60이상인 사람의 값을 하나씩 더해간다.
			}
		}
		avg=total/count; //score를 다 더한 total값을 count값으로 나눈다.
		System.out.printf("합격자 수학 평균은 %d점입니다.%n",avg);
		//위 방법은 EnhancedFor방법
		
		total = 0;
		avg = 0;
		count = 0;
		
		for(int i=0; i<eng.length; i++)
		{
			if(eng[i]<60)
			{
				continue;
			}
			total+=eng[i];
			++count;
		}
		avg=total/count;
		System.out.printf("합격자 영어 평균은 %d점입니다.%n",avg);
		
		total = 0;
		avg = 0;
		count = 0;
		
		for(int i=0; i<com.length; i++)
		{
			if(com[i]<60)
			{
				continue;
			}
			total+=com[i];
			++count;
		}
		avg=total/count;
		System.out.printf("합격자 컴퓨터 평균은 %d점입니다.%n",avg);
	}
}
