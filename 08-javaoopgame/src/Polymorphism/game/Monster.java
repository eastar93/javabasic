package Polymorphism.game;

public abstract class Monster {
	
	private String name;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	public Monster(String name, int hp, int atk, int def, int exp) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.exp = exp;
	}
	
	
	public void MonsterData() {
		System.out.printf("몬스터의 이름은 %s입니다.%n",name);
		System.out.printf("몬스터의 체력은 %d입니다.%n",hp);
		System.out.printf("몬스터의 공격은 %d입니다.%n",atk);
		System.out.printf("몬스터의 방어력은 %d입니다.%n",def);
		System.out.println("----------------------------------------------");
	}
	
	public abstract void doBattle(Hero hr);
//	{
//		if (hr.getExp()>0 && hr.getHp()<=0)
//		{
//			System.out.printf("%s는(은) 이미 죽은 유닛입니다.%n", hr.getName());
//			System.out.println("----------------------------------------------");
//			return;
//		}
//		hr.setHp(getAtk());
//		if(getAtk()<=hr.getDef())
//		{
//			System.out.printf("%s는 %s의 방어력이 높아 데미지를 못입혔습니다.%n" ,hr.getName(),name);
//			System.out.println("----------------------------------------------");
//		}
//		else if(hr.getHp()>0)
//		{
//			System.out.printf("%s가 %s에게 %d만큼의 데미지를 주었습니다.%n",name,hr.getName(),getAtk()-hr.getDef());
//			System.out.println("----------------------------------------------");
//			hr.HeroData();			
//		}
//		else if(hr.getDHp()<=0)
//		{
//			System.out.printf("%s가 %s에 의해 사망하였습니다.%n",hr.getName(),name);
//			if(hr.getHp()<0)
//			{
//				hr.setHp(0);
//			}
//			System.out.println("----------------------------------------------");
//		}
//	}	
	
		
		
	
	public String getName() {
		return name;
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
	public int getExp() {
		return exp;
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
	public void setExp(int Exp) {
		exp = 20;
	}

}
