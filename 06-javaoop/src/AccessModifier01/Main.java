package accessModifier01;

public class Main {
	
	public static void main(String[] args) {
		/*
		 * 전사를 하나 만들고 사냥을 3번 하세요.
		 * 사냥 3번 후에 전체 상태를 system.outprinln()을 이용해 출력해주세요.
		 */
		
		//public을 사용하면 Main에서 값을 무작위로 수정할 수 있다
		//private을 사용하면 Main에서 힙쪽에서 private으로 선언한 값들을 간섭할 수 없다.
		Warrior w1 = new Warrior("eastar93");
//		w1.Hp=1000000; 
		w1.hunt();
		w1.hunt();
		w1.hunt();
//		System.out.println("아이디 : " + w1.ID);
//		System.out.println("Lv : " + w1.Lv);
//		System.out.println("체력 : " + w1.Hp);
//		System.out.println("공격력 : " + w1.Atk);
//		System.out.println("Exp : " + w1.Exp);
		
		Warrior w2 = new Warrior("Wr");
		w2.hunt();
		w2.hunt();
		w2.getInfo();
	}

}
