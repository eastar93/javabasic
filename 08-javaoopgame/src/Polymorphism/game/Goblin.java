package Polymorphism.game;

public class Goblin extends Monster {
	
	public Goblin() 
	{
		super("Goblin",50,9,3,7);
	}
	
	public void doBattle(Hero hr) {
		
		if (hr.getExp()>0 && hr.getHp()<=0)
		{
			System.out.printf("%s는(은) 이미 죽은 유닛입니다.%n", hr.getName());
			System.out.println("----------------------------------------------");
			return;
		}
		hr.setHp(getAtk());
		if(getAtk()<=hr.getDef())
		{
			System.out.printf("%s는 %s의 방어력이 높아 데미지를 못입혔습니다.%n" ,hr.getName(),getName());
			System.out.println("----------------------------------------------");
		}
		else if(hr.getHp()>0)
		{
			System.out.printf("%s가 %s에게 %d만큼의 데미지를 주었습니다.%n",getName(),hr.getName(),getAtk()-hr.getDef());
			System.out.println("----------------------------------------------");
			hr.HeroData();			
		}
		else if(hr.getDHp()<=0)
		{
			System.out.printf("%s가 %s에 의해 사망하였습니다.%n",hr.getName(),getName());
			if(hr.getHp()<0)
			{
				hr.setHp(0);
			}
			System.out.println("----------------------------------------------");
		}
	}		
}



	
	