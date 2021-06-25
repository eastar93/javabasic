package Inheritance.game;

public class Main02 {
	
	public static void main(String[] args) {
	
		//Warrior를 생성해서 각종 스탯을 입력해주신 다음 getInfo()를 호출해주세요.		
		Warrior Wr = new Warrior();
		Wr.ID = "eastar93";
		Wr.Lv = 15;
		Wr.J = "전사";
		Wr.Hp = 1200;
		Wr.Mp = 800;
		Wr.PDam = 30;
		
		//getInfo()호출시 Commoner의 getInfo()는 무시됩니다.
		//Warrior의 getInfo()가 우선적으로 호출됩니다.
		Wr.getInfo();
	}
}
