package Polymorphism.game;

public class Field {

	public static void main(String[] args) {
		
		Warrior W1 = new Warrior();
		Magician M1 = new Magician();
		Elf E1 = new Elf();
		Goblin G1 = new Goblin();
		Ogre O1 = new Ogre();
		Dragon D1 = new Dragon();
		G1.MonsterData();
		M1.HeroData();
		
		M1.meteor(E1);
		M1.meteor(E1);
		M1.meteor(E1);
		M1.HeroData();
		E1.MonsterData();
	
		
	}
}
