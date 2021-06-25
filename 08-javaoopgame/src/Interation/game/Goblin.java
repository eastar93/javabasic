package Interation.game;

public class Goblin {
	
	private int hp;
	private int atk;
	private int def;
	private int exp;
	

	public Goblin()
	{
		this.hp = 15;
		this.atk = 7;
		this.def = 1; 
		this.exp = 3;
	}
	
	public void getGlInfo()
	{
		System.out.printf("고블린의 체력은 %d입니다.%n",hp);
		System.out.printf("고블린의 공격력은 %d입니다.%n",atk);
		System.out.printf("고블린의 방어력은 %d입니다.%n",def);
		System.out.println("--------------------------------------------");
	}
	
	public void huntGd(Gladiator Gd)
	{
		Gd.setHp(atk);
		if(Gd.getHp()>0 && atk>Gd.getDef())
		{
			System.out.printf("고블린이 글레디에이터에게 %d만큼의 데미지를 주었습니다.%n",getAtk()-Gd.getDef());
			System.out.println("--------------------------------------------");
			Gd.getGdInfo();
		}
		else if(atk<=Gd.getDef())
		{
			System.out.println("고블린은 글레디에이터의 방어력이 높아 데미지를 입지 않습니다.");
			System.out.println("--------------------------------------------");
		}
		else if(Gd.getHp()==0)
		{
			System.out.println("글레디에이터가 고블린에의해 사망하였습니다.");
			System.out.println("--------------------------------------------");
		}
		else 
		{
			System.out.println("글레디에이터는 이미 죽은 몬스터입니다.");
			System.out.println("--------------------------------------------");
			
		}
	}
	
	public void huntDs(DragonSlayer Ds)
	{
		Ds.setHp(atk);
		if(Ds.getHp()>0 && atk>Ds.getDef())
		{
			System.out.printf("고블린이 드래곤슬레이어에게 %d만큼의 데미지를 주었습니다.%n",getAtk()-Ds.getDef());
			System.out.println("--------------------------------------------");
			Ds.getDsInfo();
		}
		else if(atk<=Ds.getDef())
		{
			System.out.println("고블린은 드래곤슬레이어의 방어력이 높아 데미지를 입지 않습니다.");
			System.out.println("--------------------------------------------");
		}
		else if(Ds.getHp()==0)
		{
			System.out.println("드래곤슬레이어가 고블린에의해 사망하였습니다.");
			System.out.println("--------------------------------------------");
		}
		else 
		{
			System.out.println("드래곤슬레이어는 이미 죽었습니다.");
			System.out.println("--------------------------------------------");
		}
	}
	
	public void huntAm(Archmage Am)
	{
		Am.setHp(atk);
		if(Am.getHp()>0 && atk>Am.getDef())
		{
			System.out.printf("고블린이 대현자에게 %d만큼의 데미지를 주었습니다.%n",getAtk()-Am.getDef());
			System.out.println("--------------------------------------------");
			Am.getAmInfo();
		}
		else if(atk<=Am.getDef())
		{
			System.out.println("고블린은 대현자의 방어력이 높아 데미지를 입지 않습니다.");
			System.out.println("--------------------------------------------");
		}
		else if(Am.getHp()==0)
		{
			System.out.println("대현자가 고블린에의해 사망하였습니다.");
			System.out.println("--------------------------------------------");
		}
		else 
		{
			System.out.println("대현자는 이미 죽었습니다.");
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
	public void setExp(int GE) {
		exp = 3;
	}
	
	
}
