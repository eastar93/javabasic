package Inheritance.game;

public class Main03 {

	public static void main(String[] args) {
		
		Magician Mg = new Magician();
		Mg.ID = "eastar93";
		Mg.Lv = 10;
		Mg.J = "주술사";
		Mg.Hp = 600;
		Mg.Mp = 1000;
		Mg.MDam = 100;
		
		Mg.getInfo();
		System.out.println("---------------");
		
		Archer Ar = new Archer();
		Ar.ID = "eastar93";
		Ar.Lv = 20;
		Ar.J = "궁수";
		Ar.Hp = 1800;
		Ar.Mp = 900;
		Ar.FDam = 150;
		
		Ar.getInfo();
	
	}
}
