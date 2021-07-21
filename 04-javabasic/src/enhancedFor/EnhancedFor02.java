package enhancedFor;

public class EnhancedFor02 {
	
	public static void main(String[] args) {
		
		/*
		 * 다음은 학생들의 과목별 성적입니다.
		 * math = 96, 23, 52, 82, 72, 31, 58
		 * eng = 62, 42, 68, 31, 80, 77, 45
		 * com = 10, 28, 39, 74, 65, 90, 98
		 * 위 3개의 명칭으로 array를 만들어 담아주신 다음 
		 * 과목별 평균 점수를 enhanced for문을 이용해 구한 다음 콘솔창에 출력해주세요.
		 */
		
		int[] math = {96, 23, 52, 82, 72, 31, 58};
		int[] eng = {62, 42, 68, 31, 80, 77, 45};
		int[] com = {10, 28, 39, 74, 65, 90, 98};
		int total = 0;
		
		for(int score: math) //math에서 값을 받아서 score에 한개씩 입력 받아서
		{		
			total += score; //total에 score값을 더해서 누적해준다.
		}
		System.out.println("수학 평균 : " + total/math.length); //total값을 math배열의 주소길이값 만큼 나눠준 값을 출력해준다.
		
		total = 0;
		
		for(int score = 0; score < eng.length; score++) //score = 0부터 eng배열의 길이만큼 증가시킨다.
		{
			total += eng[score]; //total에 eng의 0번째부터 eng배열길이 만큼의 배열 값들을 더해서 누적시킨다.
		}
		System.out.println("영어평균 : " + total/eng.length); //total값을 eng배열의 주소길이값 만큼 나눠 준값을 출력해준다.
		
		total = 0;
		
		for(int score: com)
		{
			total += score;
		}
		System.out.println("컴퓨터 평균 : " + total/com.length);
	}

}
