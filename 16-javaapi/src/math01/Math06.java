package math01;

public class Math06 {
	
	public static void main(String[] args) {
		//가위바위보 게임을 만들어보겠습니다.
		//Math.random()을 이용해 1/3확률로 가위,바위,보를 부여 받으며
		//가위 > 보, 바위 > 가위, 보 > 가위의 상성을 가집니다.
		//같은 요소가 나오면 무승부입니다.
		//힌트)컴퓨터가 이기는 경우, 내가 이기는 경우, 비기는 경우를 따져서
		//조건식에 ||을 사용합니다.
		
		//상수를 처리하는 부분
		final int SCISSORS = 0;
		final int ROCK = 1;
		final int PAPER = 2;
		
		//내가 낸 것과 컴퓨터가 낸 것을 숫자에서 문자로 치환해주는 배열
		String[] items = {"가위", "바위", "보"};

		int M = (int)(Math.random()*3);
		int C = (int)(Math.random()*3);
		
		if((M == SCISSORS && C == PAPER) || 
			(M == ROCK && C == SCISSORS) ||
			(M == PAPER && C == ROCK)) {
			System.out.println("내가 이겼습니다.");
		} else if ((M == SCISSORS && C == ROCK) ||
				(M == ROCK && C == PAPER) ||
				(M == PAPER && C == SCISSORS)) {
			System.out.println("컴퓨터가 이겼습니다.");
		} else if (M == C) {
			System.out.println("무승부입니다.");
		}
		System.out.println("내가 낸 것 : " + items[M]);
		System.out.println("컴퓨터가 낸 것 : " + items[C]);
		
//		
//		if(M==SCISSORS) {
//			if(C==SCISSORS) {
//				System.out.println("무승부");
//				System.out.println("내가 낸 것 : 가위");
//				System.out.println("컴퓨터가 낸 것 : 가위");
//			} else if(C==ROCK) {
//				System.out.println("승자 : 컴퓨터");
//				System.out.println("내가 낸 것 : 가위");
//				System.out.println("컴퓨터가 낸 것 : 바위");
//			} else if(C==PAPER) {
//				System.out.println("승자 : 나");
//				System.out.println("내가 낸 것 : 가위");
//				System.out.println("컴퓨터가 낸 것 : 보");
//			}
//		}
//		else if(M==ROCK) {
//			if(C==SCISSORS) {
//			System.out.println("승자 : 나");
//			System.out.println("내가 낸 것 : 바위");
//			System.out.println("컴퓨터가 낸 것 : 가위");
//			} else if(C==ROCK) {
//				System.out.println("무승부");
//				System.out.println("내가 낸 것 : 바위");
//				System.out.println("컴퓨터가 낸 것 : 바위");
//			} else if(C==PAPER) {
//				System.out.println("승자 : 컴퓨터");
//				System.out.println("내가 낸 것 : 바위");
//				System.out.println("컴퓨터가 낸 것 : 보");
//			}
//		}
//		else if(M==PAPER) {
//			if(C==SCISSORS) {
//			System.out.println("승자 : 컴퓨터");
//			System.out.println("내가 낸 것 : 보");
//			System.out.println("컴퓨터가 낸 것 : 가위");
//			} else if(C==ROCK) {
//			System.out.println("승자 : 나");
//			System.out.println("내가 낸 것 : 보");
//			System.out.println("컴퓨터가 낸 것 : 바위");
//			} else if(C==PAPER) {
//				System.out.println("무승부");
//				System.out.println("내가 낸 것 : 보");
//				System.out.println("컴퓨터가 낸 것 : 보");
//			}
//		}
	} 
}
