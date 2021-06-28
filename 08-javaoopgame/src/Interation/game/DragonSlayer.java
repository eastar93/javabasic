package Interation.game;

public class DragonSlayer {
	
	private int lv;
	private int hp;
	private int mp;
	private int atk;
	private int skAtk;
	private int def;
	private int exp;

	public DragonSlayer()
	{
		this.lv = 3;
		this.hp = 50;
		this.mp = 35;
		this.atk = 18;
		this.def = 9;
		this.exp = 0;
	}
	
	public void getDsInfo()
	{
		System.out.printf("드래곤슬레이어의 레벨은 %d입니다.%n",lv);
		System.out.printf("드래곤슬레이어의 체력은 %d입니다.%n",hp);
		System.out.printf("드래곤슬레이어의 마력은 %d입니다.%n",mp);
		System.out.printf("드래곤슬레이어의 공격력은 %d입니다.%n",atk);
		System.out.printf("드래곤슬레이어의 방어력은 %d입니다.%n",def);
		System.out.printf("드래곤슬레이어의 경험치는 %d입니다.%n",exp);
		System.out.println("----------------------------------------------");
	}
	
	public void huntGl(Goblin Gl)
	{
		if (Gl.getExp()>0 && Gl.getHp()<=0)
		{
			System.out.println("고블린은 이미 죽은 몬스터입니다.");
			System.out.println("----------------------------------------------");
			return;
		}
		Gl.setHp(atk);
		if(atk<=Gl.getDef())
		{
			System.out.println("드래곤슬레이어는 고블린의 방어력이 높아 데미지를 못입혔습니다.");
			System.out.println("----------------------------------------------");
		}
		else if(Gl.getHp()>0)
		{
			System.out.printf("드래곤슬레이어가 고블린에게 %d만큼의 데미지를 주었습니다.%n",getAtk()-Gl.getDef());
			System.out.println("----------------------------------------------");
			Gl.getGlInfo();			
		}
		
		else if(Gl.getDHp()<=0)
		{
			System.out.println("고블린이 드래곤슬레이어에 의해 사망하였습니다.");
			System.out.printf("경험치 %d를 얻었습니다.%n",Gl.getExp());
			if(Gl.getHp()<0)
			{
				Gl.setHp(0);
			}
			exp += Gl.getExp();
			System.out.println("----------------------------------------------");
		}
			
	}
	
	public void ADMGl(Goblin Gl)
	{
		if (getMp()<=0 && Gl.getHp()>0)
		{
			mp=0;
			System.out.println("마나가 충분하지 않다 더이상 스킬을 사용할 수 없습니다.");
			System.out.println("----------------------------------------------");
			return;
		}
		if (Gl.getExp()>0 && Gl.getHp()<=0)
		{
			System.out.println("고블린은 이미 죽은 몬스터입니다.");
			System.out.println("----------------------------------------------");
			return;
		}
		setSkAtk(7);
		setMp(5);
		Gl.setHp(skAtk);
		if(skAtk<=Gl.getDef())
		{
			System.out.println("드래곤슬레이어는 고블린의 방어력이 높아 데미지를 못입혔습니다.");
			System.out.println("----------------------------------------------");
		}
		else if(Gl.getHp()>0 && skAtk>Gl.getDef())
		{
			System.out.println("드래곤슬레이어가 고블린에게 멸룡의 오의 기술을 시전했습니다.");
			System.out.printf("드래곤슬레이어가 고블린에게 %d만큼의 데미지를 주었습니다.%n",getSkAtk()-Gl.getDef());
			System.out.println("----------------------------------------------");
			Gl.getGlInfo();
		}
		else if(Gl.getDHp()<=0) 
		{
			System.out.println("고블린이 드래곤슬레이어에 의해 사망하였습니다.");
			System.out.printf("경험치 %d를 얻었습니다.%n",Gl.getExp());
			if(Gl.getHp()<0)
			{
				Gl.setHp(0);
			}
			exp += Gl.getExp();
			System.out.println("----------------------------------------------");
		}
	}

	
	public void huntZb(Zombie Zb)
	{
		if (Zb.getExp()>0 && Zb.getHp()<=0)
		{
			System.out.println("좀비는 이미 죽은 몬스터입니다.");
			System.out.println("----------------------------------------------");
			return;
		}
		Zb.setHp(atk);
		if(atk<=Zb.getDef())
		{
			System.out.println("드래곤슬레이어는 좀비의 방어력이 높아 데미지를 못입혔습니다.");
			System.out.println("----------------------------------------------");
		}
		else if(Zb.getHp()>0)
		{
			System.out.printf("드래곤슬레이어가 좀비에게 %d만큼의 데미지를 주었습니다.%n",getAtk()-Zb.getDef());
			System.out.println("----------------------------------------------");
			Zb.getZbInfo();			
		}
		
		else if(Zb.getDHp()<=0)
		{
			System.out.println("좀비가 드래곤슬레이어에 의해 사망하였습니다.");
			System.out.printf("경험치 %d를 얻었습니다.%n",Zb.getExp());
			if(Zb.getHp()<0)
			{
				Zb.setHp(0);
			}
			exp += Zb.getExp();
			System.out.println("----------------------------------------------");
		}
			
	}

	
	public void ADMZb(Zombie Zb)
	{
		if (getMp()<=0 && Zb.getHp()>0)
		{
			mp=0;
			System.out.println("마나가 충분하지 않다 더이상 스킬을 사용할 수 없습니다.");
			System.out.println("----------------------------------------------");
			return;
		}
		if (Zb.getExp()>0 && Zb.getHp()<=0)
		{
			System.out.println("좀비는 이미 죽은 몬스터입니다.");
			System.out.println("----------------------------------------------");
			return;
		}
		setSkAtk(7);
		setMp(5);
		Zb.setHp(skAtk);
		if(skAtk<=Zb.getDef())
		{
			System.out.println("드래곤슬레이어는 좀비의 방어력이 높아 데미지를 못입혔습니다.");
			System.out.println("----------------------------------------------");
		}
		else if(Zb.getHp()>0 && skAtk>Zb.getDef())
		{
			System.out.println("드래곤슬레이어가 좀비에게 멸룡의 오의 기술을 시전했습니다.");
			System.out.printf("드래곤슬레이어가 좀비에게 %d만큼의 데미지를 주었습니다.%n",getSkAtk()-Zb.getDef());
			System.out.println("----------------------------------------------");
			Zb.getZbInfo();
		}
		else if(Zb.getDHp()<=0) 
		{
			System.out.println("좀비가 드래곤슬레이어에 의해 사망하였습니다.");
			System.out.printf("경험치 %d를 얻었습니다.%n",Zb.getExp());
			if(Zb.getHp()<0)
			{
				Zb.setHp(0);
			}
			exp += Zb.getExp();
			System.out.println("----------------------------------------------");
		}
	}
	
	public void huntOg(Ogre Og)
	{
		if (Og.getExp()>0 && Og.getHp()<=0)
		{
			System.out.println("오우거는 이미 죽은 몬스터입니다.");
			System.out.println("----------------------------------------------");
			return;
		}
		Og.setHp(atk);
		if(atk<=Og.getDef())
		{
			System.out.println("드래곤슬레이어는 오우거의 방어력이 높아 데미지를 못입혔습니다.");
			System.out.println("----------------------------------------------");
		}
		else if(Og.getHp()>0)
		{
			System.out.printf("드래곤슬레이어가 오우거에게 %d만큼의 데미지를 주었습니다.%n",getAtk()-Og.getDef());
			System.out.println("----------------------------------------------");
			Og.getOgInfo();			
		}
		
		else if(Og.getDHp()<=0)
		{
			System.out.println("오우거가 드래곤슬레이어에 의해 사망하였습니다.");
			System.out.printf("경험치 %d를 얻었습니다.%n",Og.getExp());
			if(Og.getHp()<0)
			{
				Og.setHp(0);
			}
			exp += Og.getExp();
			System.out.println("----------------------------------------------");
		}
			
	}
	
	public void ADMOg(Ogre Og)
	{
		if (getMp()<=0 && Og.getHp()>0)
		{
			mp=0;
			System.out.println("마나가 충분하지 않다 더이상 스킬을 사용할 수 없습니다.");
			System.out.println("----------------------------------------------");
			return;
		}
		if (Og.getExp()>0 && Og.getHp()<=0)
		{
			System.out.println("오우거은 이미 죽은 몬스터입니다.");
			System.out.println("----------------------------------------------");
			return;
		}
		setSkAtk(7);
		setMp(5);
		Og.setHp(skAtk);
		if(skAtk<=Og.getDef())
		{
			System.out.println("드래곤슬레이어는 오우거의 방어력이 높아 데미지를 못입혔습니다.");
			System.out.println("----------------------------------------------");
		}
		else if(Og.getHp()>0 && skAtk>Og.getDef())
		{
			System.out.println("드래곤슬레이어가 오우거에게 멸룡의 오의 기술을 시전했습니다.");
			System.out.printf("드래곤슬레이어가 오우거에게 %d만큼의 데미지를 주었습니다.%n",getSkAtk()-Og.getDef());
			System.out.println("----------------------------------------------");
			Og.getOgInfo();
		}
		else if(Og.getDHp()<=0) 
		{
			System.out.println("오우거이 드래곤슬레이어에 의해 사망하였습니다.");
			System.out.printf("경험치 %d를 얻었습니다.%n",Og.getExp());
			if(Og.getHp()<0)
			{
				Og.setHp(0);
			}
			exp += Og.getExp();
			System.out.println("----------------------------------------------");
		}
	}
	public void huntVp(Vampire Vp)
	{
		if (Vp.getExp()>0 && Vp.getHp()<=0)
		{
			System.out.println("벰파이어는 이미 죽은 몬스터입니다.");
			System.out.println("----------------------------------------------");
			return;
		}
		Vp.setHp(atk);
		if(atk<=Vp.getDef())
		{
			System.out.println("드래곤슬레이어는 벰파이어의 방어력이 높아 데미지를 못입혔습니다.");
			System.out.println("----------------------------------------------");
		}
		else if(Vp.getHp()>0)
		{
			System.out.printf("드래곤슬레이어가 벰파이어에게 %d만큼의 데미지를 주었습니다.%n",getAtk()-Vp.getDef());
			System.out.println("----------------------------------------------");
			Vp.getVpInfo();			
		}
		
		else if(Vp.getDHp()<=0)
		{
			System.out.println("벰파이어가 드래곤슬레이어에 의해 사망하였습니다.");
			System.out.printf("경험치 %d를 얻었습니다.%n",Vp.getExp());
			if(Vp.getHp()<0)
			{
				Vp.setHp(0);
			}
			exp += Vp.getExp();
			System.out.println("----------------------------------------------");
		}
			
	}
	
	public void ADMVp(Vampire Vp)
	{
		if (getMp()<=0 && Vp.getHp()>0)
		{
			mp=0;
			System.out.println("마나가 충분하지 않다 더이상 스킬을 사용할 수 없습니다.");
			System.out.println("----------------------------------------------");
			return;
		}
		if (Vp.getExp()>0 && Vp.getHp()<=0)
		{
			System.out.println("벰파이어는 이미 죽은 몬스터입니다.");
			System.out.println("----------------------------------------------");
			return;
		}
		setSkAtk(7);
		setMp(5);
		Vp.setHp(skAtk);
		if(skAtk<=Vp.getDef())
		{
			System.out.println("드래곤슬레이어는 벰파이어의 방어력이 높아 데미지를 못입혔습니다.");
			System.out.println("----------------------------------------------");
		}
		else if(Vp.getHp()>0 && skAtk>Vp.getDef())
		{
			System.out.println("드래곤슬레이어가 벰파이어에게 멸룡의 오의 기술을 시전했습니다.");
			System.out.printf("드래곤슬레이어가 벰파이어에게 %d만큼의 데미지를 주었습니다.%n",getSkAtk()-Vp.getDef());
			System.out.println("----------------------------------------------");
			Vp.getVpInfo();
		}
		else if(Vp.getDHp()<=0) 
		{
			System.out.println("벰파이어가 드래곤슬레이어에 의해 사망하였습니다.");
			System.out.printf("경험치 %d를 얻었습니다.%n",Vp.getExp());
			if(Vp.getHp()<0)
			{
				Vp.setHp(0);
			}
			exp += Vp.getExp();
			System.out.println("----------------------------------------------");
		}
	}

		
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
