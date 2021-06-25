package Interation.game;

public class Ogre {
	
	private int Hp;
	private int Atk;
	private int Def;
	private int Exp;

	public Ogre()
	{
		this.Hp = 50;
		this.Atk = 15;
		this.Def = 9; 
		this.Exp = 15;
	}
	
	public void getOgInfo()
	{
		System.out.printf("오우거의 체력은 %d입니다.%n",Hp);
		System.out.printf("오우거의 공격력은 %d입니다.%n",Atk);
		System.out.printf("오우거의 방어력은 %d입니다.%n",Def);
		System.out.println("---------------------------------------");
	}
	
	public void huntGd(Gladiator Gd)
	{
		Gd.setHp(Atk);
		if(Gd.getHp()>0 && Atk>Gd.getDef())
		{
			System.out.printf("오우거가 글레디에이터에게 %d만큼의 데미지를 주었습니다.%n",getAtk()-Gd.getDef());
			System.out.println("---------------------------------------");
			Gd.getGdInfo();
		}
		else if(Atk<=Gd.getDef())
		{
			System.out.println("오우거는 글레디에이터의 방어력이 높아 데미지를 입지 않습니다.");
			System.out.println("---------------------------------------");
		}
		else if(Gd.getHp()==0)
		{
			System.out.println("글레디에이터는 오우거에 의해 사망하였습니다.");
			System.out.println("---------------------------------------");
		}
		else 
		{
			System.out.println("글레디에이터는 이미 죽은 몬스터입니다.");
			System.out.println("---------------------------------------");
		}
	}
	
	public void huntDs(DragonSlayer Ds)
	{
		Ds.setHp(Atk);
		if(Ds.getHp()>0 && Atk>Ds.getDef())
		{
			System.out.printf("오우거가 드래곤슬레이어에게 %d만큼의 데미지를 주었습니다.%n",getAtk()-Ds.getDef());
			System.out.println("---------------------------------------");
			Ds.getDsInfo();
		}
		else if(Atk<=Ds.getDef())
		{
			System.out.println("오우거는 드래곤슬레이어의 방어력이 높아 데미지를 입지 않습니다.");
			System.out.println("---------------------------------------");
		}
		else if(Ds.getHp()==0)
		{
			System.out.println("드래곤슬레이어가 오우거에 의해 사망하였습니다.");
			System.out.println("---------------------------------------");
		}
		else 
		{
			System.out.println("드래곤슬레이어는 이미 죽었습니다.");
			System.out.println("---------------------------------------");
		}
	}
	
	public void huntAm(Archmage Am)
	{
		Am.setHp(Atk);
		if(Am.getHp()>0 && Atk>Am.getDef())
		{
			System.out.printf("오우거가 대현자에게 %d만큼의 데미지를 주었습니다.%n",getAtk()-Am.getDef());
			System.out.println("---------------------------------------");
			Am.getAmInfo();
		}
		else if(Atk<=Am.getDef())
		{
			System.out.println("오우거는 대현자의 방어력이 높아 데미지를 입지 않습니다.");
			System.out.println("---------------------------------------");
		}
		else if(Am.getHp()==0)
		{
			System.out.println("대현자가 오우거에 의해 사망하였습니다.");
			System.out.println("---------------------------------------");
		}
		else 
		{
			System.out.println("대현자는 이미 죽었습니다.");
			System.out.println("---------------------------------------");
		}
	}
	
	public int getHp() {
		return Hp;
	}
	public int getAtk() {
		return Atk;
	}
	public int getDef() {
		return Def;
	}
	public int getExp() {
		return Exp;
	}


	public void setHp(int A) {
		if((Def-A)<0)
		{
			Hp += (Def-A);
		}
	}
	public void setDHp(int D) {
		if(Hp-(Def-D)<0)
		{
			Hp=0;
		}
	}
	public void setAtk(int atk) {
		Atk = atk;
	}
	public void setDef(int def) {
		Def = def;
	}
	public void setExp(int GE) {
		Exp = 15;
	}

}
