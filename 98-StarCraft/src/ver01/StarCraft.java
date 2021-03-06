package ver01;

public class StarCraft {
	
	public String tribe;
	public String type;
	public String name;
	public String size;
	public int HP;
	public int Heal;
	public int AP;
	public int AU;
	public int AV;
	public int AS;
	public int ASV;
	public int SP;
	public int SU;
	public int SV;
	 
	public StarCraft(String tr, String ty, String n, String s, int H, int Ap, int As, int Sp)
	{
		tribe = tr;
		type = ty;
		name = n;
		size = s;
		HP = H;
		Heal = 15;
		AP = Ap;
		AU = 0;
		AV = 2;
		AS = As;
		ASV = 1;
		SP = Sp;
		SU = 0;
		SV = 2;
		System.out.printf("%s이(가) 생성되었습니다.",name);
	}
	
	public void getInfo()
	{
		System.out.println("유닛 스펙");
		System.out.println("-------------------------------------------");
		System.out.println("종족 : " + tribe);
		System.out.println("공격형태 : " + type);
		System.out.println("유닛 이름 : " + name);
		System.out.println("유닛 크기 : " + size);
		System.out.println("체력 : " + HP);
		System.out.println("공격속도 : " + AS );
		System.out.printf("공격력 : %d(+%d)%n",AP,AU);
		System.out.printf("방어력 :%d(+%d)%n",SP,SU);
		System.out.println("-------------------------------------------");
	}
	
	public void APUpgrade()
	{
		
		if(HP>0 && HP<=40)
		{
			AU+=AV;
			AP+=2;
			System.out.println("공격력 업그레이드 완료");
			System.out.printf("공격력 %d증가%n",AV);
			System.out.println("-------------------------------------------");
		}
		else if(HP<=0)
		{
			System.out.println("더이상 공격력 업그레이드가 되지 않습니다.");
			System.out.println("-------------------------------------------");
		}
		
		
	}
	public void SPUpgrade()
	{
		if(HP>0 && HP<=40)
		{
			SU+=SV;
			SP+=2;
			System.out.println("방어력 업그레이드 완료");
			System.out.printf("방어력 %d증가%n",SV);
			System.out.println("-------------------------------------------");
			
		}
		else if(HP<=0)
		{
			System.out.println("더이상 방어력 업그레이드가 되지 않습니다.");
			System.out.println("-------------------------------------------");
		}
	}
	
	public void SPPower()
	{
		if(SP>15)
		{
			System.out.println("더이상 저글링 히드라 울트라 모두에게 데미지를 받지 않습니다.");
			System.out.println("-------------------------------------------");
		}
		else if(SP>7)
			
		{
			System.out.println("더이상 저글링과 히드라에게 데미지를 받지 않습니다.");
			System.out.println("-------------------------------------------");
		}
		else if(SP>3)
		{			
			System.out.println("더이상 저글링에게 데미지를 받지 않습니다.");
			System.out.println("-------------------------------------------");
		}
		else if(SP==0)
		{
			System.out.println("방어력이 낮습니다.");
			System.out.println("업그레이드가 필요합니다.");
		}
	}
	public void Stimpack()
	{
		HP-=5;
		AS+=ASV;
		if(HP > 0)
		{
			System.out.println("스팀팩을 사용했습니다.");
			System.out.printf("공격속도가 %d증가했습니다",ASV);
			System.out.printf("남은 체력은 %d입니다%n",HP);
			System.out.println("-------------------------------------------");
		}
		else if(HP<=1)
		{
			System.out.println("더이상 스팀팩을 사용 할 수 없습니다.");
			System.out.println("-------------------------------------------");
		}
	}
	public void GetHurtZergling()
	{
		
		if((SP-3)<0)
		{
			HP += (SP-3);
			System.out.printf("저글링에게 %d만큼 데미지를 입었습니다.%n",3-SP);
			System.out.println("-------------------------------------------");
			if (HP<0)
			{
				HP=0;
				System.out.println("유닛의 체력이 바닥나 죽었습니다.");
				System.out.println("-------------------------------------------");
			}
			else
			{
				System.out.println("유닛이 죽지 않았습니다.");
				System.out.printf("남은 체력은 %d입니다%n", HP);
				System.out.println("-------------------------------------------");
			}
		}
		else if((SP-3)>=0)  
		{
			System.out.println("저글링에게 데미지를 입지 않았습니다.");
			System.out.println("-------------------------------------------");
		}
	}
	public void GetHurtHydra()
	{
		
		if((SP-7)<0)
		{	
			HP += (SP-7);
			System.out.printf("히드라에게 %d만큼 데미지를 입었습니다.%n",7-SP);
			System.out.println("-------------------------------------------");
			if (HP<0)
			{
				HP=0;
				System.out.println("유닛의 체력이 바닥나 죽었습니다.");
				System.out.println("-------------------------------------------");
			}
			else
			{
				System.out.println("유닛이 죽지 않았습니다.");
				System.out.printf("남은 체력은 %d입니다%n", HP);
				System.out.println("-------------------------------------------");
			}
		}
		else if((SP-7)>=0)  
		{
			System.out.println("히드라에게 데미지를 입지 않았습니다.");
			System.out.println("-------------------------------------------");
		}
	}
	public void GetHurtUltra()
	{
		
		if((SP-15)<0)
		{
			HP+=(SP-15);
			System.out.printf("울트라에게 %d만큼 데미지를 입었습니다.%n",15-SP);
			System.out.println("-------------------------------------------");
			if (HP<=0)
			{
				HP=0;
				System.out.println("유닛의 체력이 바닥나 죽었습니다.");
				System.out.println("-------------------------------------------");
			}
			else
			{
				System.out.println("유닛이 죽지 않았습니다.");
				System.out.printf("남은 체력은 %d입니다%n", HP);
				System.out.println("-------------------------------------------");
			}
		}
		else if((SP-15)>=0)  
		{
			System.out.println("울트라에게 데미지를 입지 않았습니다.");
			System.out.println("-------------------------------------------");
		}

	}
	public void Cure()
	{
		if(HP>0 && HP<40)
		{
			HP+=Heal;
			if((HP+=Heal)>40)
			{
				HP=40;
			}
			System.out.println("치료가 되었습니다.");
			System.out.printf("현재 체력은 %d입니다%n",HP);
			System.out.println("-------------------------------------------");
		}
		else if((HP+=Heal)>40)
		{
			HP = 40;
			System.out.println("더이상 회복되지 않습니다.");
			System.out.println("-------------------------------------------");
		}
		else if(HP <= 0)
		{ 
			System.out.println("이 유닛의 체력은 0이하입니다.");
			System.out.println("이 유닛은 살릴 수 없는 유닛입니다.");
			System.out.println("-------------------------------------------");
		}
	
	}
}
