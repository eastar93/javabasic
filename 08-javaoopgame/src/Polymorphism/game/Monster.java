package Polymorphism.game;

import Interation.game.Gladiator;

//모든 몬스터는 Monster.java라는 부모클래스를 가집니다.
//이 클래스의 상속을 받아서 몬스터를 만들면 Monster라는 자료형 하나로
//모든 몬스터 종류를 처리 할 수 있습니다.
//기존의 huntXXX(몬스터 자료형)메서드는
//hunt(Monster)라고 적는것만으로도 모든 몬스터 유형을 처리할 수 있습니다.
//플레이어(직업은 자유)로 하나를 만들고 Monster자료형과 상호작용해 교전할 수 있는 코드를 작성해주세요
//main에서 테스트도 해주시면 됩니다.

public class Monster {
	
	private String name;
	private int hp;
	private int atk;
	private int def;
	
	public Monster(String Name, int Hp, int Atk, int Def) {
		this.name = Name;
		this.hp = Hp;
		this.atk = Atk;
		this.def = Def;
		
	}
	
	public void MonsterData() {
		System.out.printf("몬스터 이름은 %s입니다.%n",name);
		System.out.printf("몬스터 체력은 %d입니다.%n",hp);
		System.out.printf("몬스터 공격은 %d입니다.%n",atk);
		System.out.printf("몬스터 방어력은 %d입니다.%n",def);
	}
	
	public void huntGd(Gladiator Gd)
	{
		Gd.setHp(atk);
		if(Gd.getHp()>0 && atk>Gd.getDef())
		{
			System.out.printf("%s이(가) 전사에게 %d만큼의 데미지를 주었습니다.%n", name,getAtk()-Gd.getDef());
			System.out.println("--------------------------------------------");
			Gd.getGdInfo();
		}
		else if(atk<=Gd.getDef())
		{
			System.out.printf("%s은(는) 전사의 방어력이 높아 데미지를 입지 않습니다.", name);
			System.out.println("--------------------------------------------");
		}
		else if(Gd.getHp()==0)
		{
			System.out.printf("전사가 %s에의해 사망하였습니다.", name);
			System.out.println("--------------------------------------------");
		}
		else 
		{
			System.out.println("전사는 이미 죽은 몬스터입니다.");
			System.out.println("--------------------------------------------");
			
		}
	}
	
	public int getHp() {
		return hp;
	}
	public int getDHp() {
		return hp=0;
	}
	public int getAtk() {
		return atk;
	}
	public int getDef() {
		return def;
	}

	public void setHp(int A) {
		if((hp+(def-A))<0)
		{
			hp=0;
		}
		else if((def-A)<0)
		{
			hp += (def-A);
		}
	}
	public void setAtk(int Atk) {
		atk = Atk;
	}
	public void setDef(int Def) {
		def = Def;
	}
}
