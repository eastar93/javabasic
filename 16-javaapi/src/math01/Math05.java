package math01;

public class Math05 {
	
	public static void main(String[] args) {
		//주사위 게임을 만들어 주세요.
		//주사위 게임은 내 값은 myValue변수에,
		//컴퓨터 값은 comValue변수에 값을 난수발생으로 1~6번으로 부여 한 뒤
		//값이 같다면 무승부, 아니면 나나 컴퓨터 중 승자를 알려주는 방식입니다.

		int myValue = (int)(Math.random()*6)+1;
		int comValue = (int)(Math.random()*6)+1;

		if(myValue > comValue) {
			System.out.println("내가 승리했습니다.");
		} else if (myValue == comValue) {
			System.out.println("무승부입니다.");
		} else {
			System.out.println("컴퓨터가 승리했습니다.");
		}
		System.out.printf("내 값 : %d%n", myValue);
		System.out.printf("컴퓨터 값 : %d%n", comValue);
	}
}
