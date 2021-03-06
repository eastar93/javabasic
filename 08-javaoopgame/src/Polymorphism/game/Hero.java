package Polymorphism.game;

//모든 몬스터는 Monster.java라는 부모클래스를 가집니다.
//이 클래스의 상속을 받아서 몬스터를 만들면 Monster라는 자료형 하나로
//모든 몬스터 종류를 처리 할 수 있습니다.
//기존의 huntXXX(몬스터 자료형)메서드는
//hunt(Monster)라고 적는것만으로도 모든 몬스터 유형을 처리할 수 있습니다.
//플레이어(직업은 자유)로 하나를 만들고 Monster자료형과 상호작용해 교전할 수 있는 코드를 작성해주세요
//main에서 테스트도 해주시면 됩니다.

public class Hero {
	
	private String name;
	private int hp;
	private int mp;
	private int atk;
	private int skAtk;
	private int def;
	private int exp;
	
	public Hero(String name, int hp, int mp, int atk, int def, int exp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.atk = atk;
		this.def = def;
		this.exp = exp;
		
	}
	
	public void HeroData() {
		System.out.printf("영웅의 이름은 %s입니다.%n",name);	
		System.out.printf("영웅의 체력은 %d입니다.%n",hp);
		System.out.printf("영웅의 공격력은 %d입니다.%n",atk);
		System.out.printf("영웅의 마력은 %d입니다.%n",mp);
		System.out.printf("영웅의 방어력은 %d입니다.%n",def);
		System.out.printf("영웅의 경험치는 %d입니다.%n",exp);
		System.out.println("----------------------------------------------");
	}
	
	public void hunt(Monster ms)
	{
		if (ms.getExp()>0 && ms.getHp()<=0)
		{
			System.out.printf("%s은(는) 이미 죽은 유닛입니다.%n", ms.getName());
			System.out.println("----------------------------------------------");
			return;
		}
		ms.setHp(getAtk());
		if(getAtk()<=ms.getDef())
		{
			System.out.printf("%s는 %s의 방어력이 높아 데미지를 못입혔습니다.%n" ,ms.getName(),name);
			System.out.println("----------------------------------------------");
		}
		else if(ms.getHp()>0)
		{
			System.out.printf("%s가 %s에게 %d만큼의 데미지를 주었습니다.%n",name,ms.getName(),getAtk()-ms.getDef());
			System.out.println("----------------------------------------------");
			ms.MonsterData();			
		}
		else if(ms.getDHp()<=0)
		{
			System.out.printf("%s가 %s에 의해 사망하였습니다.%n",ms.getName(),name);
			System.out.printf("경험치 %d를 얻었습니다.%n",ms.getExp());
			if(ms.getHp()<0)
			{
				ms.setHp(0);
			}
			exp += ms.getExp();
			System.out.println("----------------------------------------------");
		}
	}
	
	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	public int getDHp() {
		return hp=0;
	}
	public int getMp() {
		return mp;
	}
	public int getAtk() {
		return atk;
	}
	public int getSkAtk() {
		return skAtk;
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
	public void setMp(int M) {
		mp -= M;
		if((mp-M)<0)
		{
			mp=0;
		}
	}
	public void setAtk(int Atk) {
		atk = Atk;
	}
	public void setSkAtk(int Ad) {
		skAtk = atk+Ad;
	}
	public void setDef(int Def) {
		def = Def;
	}
	public void setExp(int Exp) {
		exp = Exp;
	}


}
