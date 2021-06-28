package Interation.game;

public class Zombie {
	
	private int hp;
	private int atk;
	private int def;
	private int exp;

	public Zombie()
	{
		this.hp = 70;
		this.atk = 7;
		this.def = 5; 
		this.exp = 7;
	}
	
	public void getZbInfo()
	{
		System.out.printf("좀비의 체력은 %d입니다.%n",hp);
		System.out.printf("좀비의 공격력은 %d입니다.%n",atk);
		System.out.printf("좀비의 방어력은 %d입니다.%n",def);
		System.out.println("--------------------------------------------");
	}
	
	public void huntGd(Gladiator Gd)
	{
		if (Gd.getExp()>0 && Gd.getHp()<=0)
		{
			System.out.println("검투사는 이미 죽은 유닛입니다.");
			System.out.println("---------------------------------------");
			return;
		}
		Gd.setHp(atk);
		if(atk<=Gd.getDef())
		{
			System.out.println("좀비는 감투사의 방어력이 높아 데미지를 못입혔습니다.");
		}
		else if(Gd.getHp()>0)
		{
			System.out.printf("좀비가 검투사에게 %d만큼의 데미지를 주었습니다.%n",getAtk()-Gd.getDef());
			System.out.println("---------------------------------------");
			Gd.getGdInfo();			
		}
	}
		
	
	public void huntDs(DragonSlayer Ds)
	{
		if (Ds.getExp()>0 && Ds.getHp()<=0)
		{
			System.out.println("드래곤슬레이어는 이미 죽은 유닛입니다.");
			System.out.println("---------------------------------------");
			return;
		}
		Ds.setHp(atk);
		if(atk<=Ds.getDef())
		{
			System.out.println("좀비가 드래곤슬레이어의 방어력이 높아 데미지를 못입혔습니다.");
		}
		else if(Ds.getHp()>0)
		{
			System.out.printf("좀비가 드래곤슬레이어에게 %d만큼의 데미지를 주었습니다.%n",getAtk()-Ds.getDef());
			System.out.println("---------------------------------------");
			Ds.getDsInfo();			
		}
	}
	
	public void huntAm(Archmage Am)
	{
		if (Am.getExp()>0 && Am.getHp()<=0)
		{
			System.out.println("대현자는 이미 죽은 유닛입니다.");
			System.out.println("---------------------------------------");
			return;
		}
		Am.setHp(atk);
		if(atk<=Am.getDef())
		{
			System.out.println("좀비는 대현자의 방어력이 높아 데미지를 못입혔습니다.");
		}
		else if(Am.getHp()>0)
		{
			System.out.printf("좀비는 대현자에게 %d만큼의 데미지를 주었습니다.%n",getAtk()-Am.getDef());
			System.out.println("---------------------------------------");
			Am.getAmInfo();			
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

		if((def-A)<0)
		{
			hp += (def-A);
		}
	}
	public void setDHp(int D) {
		if((hp-=D)<0)
		{
			hp=0;
		}
	}
	
	public void setAtk(int Atk) {
		atk = Atk;
	}
	public void setDef(int Def) {
		def = Def;
	}
	public void setExp(int GE) {
		exp += 3;
	}
}
