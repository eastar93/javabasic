package Interation.game;

public class Archmage {
	
	private int lv;
	private int hp;
	private int mp;
	private int atk;
	private int skAtk;
	private int def;
	private int exp;

	public Archmage()
	{
		this.lv = 7;
		this.hp = 120;
		this.mp = 70;
		this.atk = 15;
		this.def = 9;
		this.exp = 0;
	}
	
	public void getAmInfo()
	{
		System.out.printf("U1의 레벨은 %d입니다.%n",lv);
		System.out.printf("U1의 체력은 %d입니다.%n",hp);
		System.out.printf("U1의 마력은 %d입니다.%n",mp);
		System.out.printf("U1의 공격력은 %d입니다.%n",atk);
		System.out.printf("U1의 방어력은 %d입니다.%n",def);
		System.out.printf("U1의 경험치는 %d입니다.%n",exp);
		System.out.println("--------------------------------------------");
	}
	
	public void huntGl(Goblin Gl)
	{
		Gl.setHp(atk);
		if(Gl.getHp()>0 && atk>Gl.getDef())
		{
			System.out.printf("대현자가 고블린에게 %d만큼의 데미지를 주었습니다.%n",getAtk()-Gl.getDef());
			System.out.println("--------------------------------------------");
			Gl.getGlInfo();
		}
		else if(atk<=Gl.getDef())
		{
			System.out.println("대현자는 고블린의 방어력이 높아 데미지를 입지 않습니다.");
		}
		else if(Gl.getHp()==0)
		{
			System.out.println("고블린이 대현자에 의해 사망하였습니다.");
			System.out.printf("경험치 %d를 얻었습니다.%n",Gl.getExp());
			exp += Gl.getExp();
			System.out.println("--------------------------------------------");
		}
		else 
		{
			System.out.println("고블린은 이미 죽은 몬스터입니다.");
			System.out.println("--------------------------------------------");
		}
	}
	
//	public void BlackMGl(Goblin Gl)
//	{
//		setSkAtk(12);
//		setMp(8);
//		Gl.setHp(SkAtk);
//		if(SkAtk>Gl.getDef()&&)
//		{
//			Gl.setDHp(0);
//			System.out.println("대현자가 고블린에게 어둠의 마법 기술을 시전했습니다.");
//			System.out.printf("대현자가 고블린에게 %d만큼의 데미지를 주었습니다.%n",getSkAtk()-Gl.getDef());
//			System.out.println("고블린이 대현자에 의해 사망하였습니다.");
//			System.out.printf("경험치 %d를 얻었습니다.%n",Gl.getGiExp());
//			Exp += Gl.getGiExp();
//			System.out.println("---------------------------------------");
//		}
//		else if(Gl.getHp()<0) 
//		{
//			System.out.println("오우거는 이미 죽은 몬스터입니다.");
//			System.out.println("--------------------------------------------");
//		}
//		if(Gl.getHp()>0 && SkAtk>Gl.getDef())
//		{
//			System.out.println("대현자가 고블린에게 어둠의 마법 기술을 시전했습니다.");
//			System.out.printf("대현자가 고블린에게 %d만큼의 데미지를 주었습니다.%n",getSkAtk()-Gl.getDef());
//			System.out.println("---------------------------------------");
//			Gl.getGlInfo();
//		}
//		else if(Atk<=Gl.getDef())
//		{
//			System.out.println("대현자는 고블린의 방어력이 높아 데미지를 입지 않습니다.");
//		}
//	}
		
	public void huntZb(Zombie Zb)
	{
		Zb.setHp(atk);
		if(Zb.getHp()>0 && atk>Zb.getDef())
		{
			System.out.printf("대현자가 좀비에게 %d만큼의 데미지를 주었습니다.%n",getAtk()-Zb.getDef());
			System.out.println("--------------------------------------------");
			Zb.getZbInfo();
		}
		else if(atk<=Zb.getDef())
		{
			System.out.println("대현자는 좀비의 방어력이 높아 데미지를 입지 않습니다.");
		}
		else if(Zb.getHp()<=0)
		{
			System.out.println("좀비가 대현자에 의해 사망하였습니다.");
			System.out.printf("경험치 %d를 얻었습니다.%n",Zb.getExp());
			exp += Zb.getExp();
			System.out.println("--------------------------------------------");
		}
		else 
		{
			System.out.println("좀비는 이미 죽은 몬스터입니다.");
			System.out.println("--------------------------------------------");
		}
	}
	
//	public void BlackMZb(Zombie Zb)
//	{
//		setSkAtk(12);
//		setMp(8);
//		Zb.setHp(SkAtk);
//		if(Zb.getHp()>0 && SkAtk>Zb.getDef())
//		{
//			System.out.println("대현자가 좀비에게 어둠의 마법 기술을 시전했습니다.");
//			System.out.printf("대현자가 좀비에게 %d만큼의 데미지를 주었습니다.%n",getSkAtk()-Zb.getDef());
//			System.out.println("---------------------------------------");
//			Zb.getZbInfo();
//		}
//		else if(Atk<=Zb.getDef())
//		{
//			System.out.println("대현자는 좀비의 방어력이 높아 데미지를 입지 않습니다.");
//		}
//		if(Zb.getHp()<=0)
//		{
//			System.out.println("좀비가 대현자에 의해 사망하였습니다.");
//			System.out.printf("경험치 %d를 얻었습니다.%n",Zb.getGiExp());
//			Exp += Zb.getGiExp();
//			System.out.println("---------------------------------------");
//		}
//		if(Zb.getHp()<0) 
//		{
//			System.out.println("좀비는 이미 죽은 몬스터입니다.");
//			System.out.println("---------------------------------------");
//		}
//	}
	
	public void huntOg(Ogre Og)
	{
		Og.setHp(atk);
		if(Og.getHp()>0 && atk>Og.getDef())
		{
			System.out.printf("대현자가 오우거에게 %d만큼의 데미지를 주었습니다.%n",getAtk()-Og.getDef());
			System.out.println("--------------------------------------------");
			Og.getOgInfo();
		}
		else if(atk<=Og.getDef())
		{
			System.out.println("대현자는 오우거의 방어력이 높아 데미지를 입지 않습니다.");
			System.out.println("--------------------------------------------");
		}
		else if(Og.getHp()<=0)
		{
			System.out.println("오우거가 대현자에 의해 사망하였습니다.");
			System.out.printf("경험치 %d를 얻었습니다.%n",Og.getExp());
			exp += Og.getExp();
			System.out.println("--------------------------------------------");
		}
		else 
		{
			System.out.println("오우거는 이미 죽은 몬스터입니다.");
			System.out.println("--------------------------------------------");
		}
	}
	
//	public void BlackMOg(Ogre Og)
//	{
//		setSkAtk(12);
//		setMp(8);
//		Og.setHp(Atk);
//		if(Og.getHp()>0 && Atk>Og.getDef())
//		{
//			System.out.println("대현자가 오우거에게 어둠의 마법 기술을 시전했습니다.");
//			System.out.printf("대현자가 오우거에게 %d만큼의 데미지를 주었습니다.%n",getSkAtk()-Og.getDef());
//			System.out.println("---------------------------------------");
//			Og.getOgInfo();
//		}
//		else if(Atk<=Og.getDef())
//		{
//			System.out.println("대현자는 오우거의 방어력이 높아 데미지를 입지 않습니다.");
//		}
//		else if(Og.getHp()==0)
//		{
//			System.out.println("오우거가 대현자에 의해 사망하였습니다.");
//			System.out.printf("경험치 %d를 얻었습니다.%n",Og.getGiExp());
//			Exp += Og.getGiExp();
//			System.out.println("---------------------------------------");
//		}
//		else 
//		{
//			System.out.println("오우거는 이미 죽은 몬스터입니다.");
//			System.out.println("---------------------------------------");
//		}
//	}
		
	public int getHp() {
		return hp;
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
		hp += (def-A);
	}
	
	public void setMp(int M) {
		mp -= M;
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
	public void setExp(int Ge) {
		exp += Ge;
	}

}
