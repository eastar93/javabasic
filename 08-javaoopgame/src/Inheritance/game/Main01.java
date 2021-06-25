package Inheritance.game;

public class Main01 {
	
	public static void main(String[] args) {
		//초보자계정 하나를 생성하고 확인해주세요.
		
		Commoner c1 = new Commoner();
		c1.ID = "eastar93";
		c1.Lv = 1;
		c1.J = "평민";
		c1.Hp = 50;
		c1.Mp = 30;
		
		c1.getInfo();
		
	}
}
