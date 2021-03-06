package ver02;

public class Marine extends Unit {
		
		public void getInfo()
		{
			System.out.println("유닛 스펙");
			System.out.println("-------------------------------------------");
			System.out.println("종족 :" + Tribe());
			System.out.println("공격형태 :" + Type());
			System.out.println("유닛 이름 :" + Name());
			System.out.println("유닛 크기 :" + Size());
			System.out.println("체력 :" + HP());
			System.out.println("공격속도 :" + AST());
			System.out.printf("공격력 : %d(+%d)%n",AP(),AU());
			System.out.printf("방어력 :%d(+%d)%n",SP(),SU());
			System.out.println("-------------------------------------------");
		}
		 
		public void APUpgrade()
		{
			
			if(HP()>0 && HP()<=40)
			{
				AVT();
				APT();
				System.out.println("공격력 업그레이드 완료");
				System.out.printf("공격력 %d증가%n",AV());
				System.out.println("-------------------------------------------");
			}
			else if(HP()<=0)
			{
				System.out.println("더이상 공격력 업그레이드가 되지 않습니다.");
				System.out.println("-------------------------------------------");
			}
			
			
		}
		public void SPUpgrade()
		{
			if(HP()>0 && HP()<=40)
			{
				SVT();
				SPT();
				System.out.println("방어력 업그레이드 완료");
				System.out.printf("방어력 %d증가%n",SV());
				System.out.println("-------------------------------------------");
				
			}
			else if(HP()<=0)
			{
				System.out.println("더이상 방어력 업그레이드가 되지 않습니다.");
				System.out.println("-------------------------------------------");
			}
		}
		
		public void SPPower()
		{
			if(SP()>15)
			{
				System.out.println("더이상 저글링 히드라 울트라 모두에게 데미지를 받지 않습니다.");
				System.out.println("-------------------------------------------");
			}
			else if(SP()>7)
				
			{
				System.out.println("더이상 저글링과 히드라에게 데미지를 받지 않습니다.");
				System.out.println("-------------------------------------------");
			}
			else if(SP()>3)
			{			
				System.out.println("더이상 저글링에게 데미지를 받지 않습니다.");
				System.out.println("-------------------------------------------");
			}
			else if(SP()<3)
			{
				System.out.println("방어력이 낮습니다.");
				System.out.println("업그레이드가 필요합니다.");
			}
		}
		public void Stimpack()
		{
			
			AS();
			if(STPA() >0)
			{	
				STP();
				System.out.println("스팀팩을 사용했습니다.");
				System.out.printf("공격속도가 %d증가했습니다.%n",ASV());
				System.out.printf("남은 체력은 %d입니다.%n",HP());
				System.out.println("-------------------------------------------");
				if(AST()>=5)
				{
					ASL();
					System.out.println("스팀팩을 사용했습니다.");
					System.out.println("공격속도가 한계치에 도달해 초기화 되었습니다.");
					System.out.printf("남은 체력은 %d입니다.%n",HP());
					System.out.println("-------------------------------------------");
				}
			}
			else if(STPA()<=0)
			{
				System.out.println("더이상 스팀팩을 사용 할 수 없습니다.");
				System.out.println("-------------------------------------------");
			}

		}
	
	
		public void GetHurtZergling()
		{
			
			if(getZCS()>0)
			{
				getZD();
				System.out.printf("저글링에게 %d만큼 데미지를 입었습니다.%n",getZCS());
				System.out.println("-------------------------------------------");
				if (HP()<0)
				{
					Death();
					System.out.println("유닛의 체력이 바닥나 죽었습니다.");
					System.out.println("-------------------------------------------");
				}
				else
				{
					System.out.println("유닛이 죽지 않았습니다.");
					System.out.printf("남은 체력은 %d입니다%n", HP());
					System.out.println("-------------------------------------------");
				}
			}
			else if(getZCS()<=0)  
			{
				System.out.println("저글링에게 데미지를 입지 않았습니다.");
				System.out.println("-------------------------------------------");
			}
		}
		public void GetHurtHydra()
		{
			
			if(getHCS()>0)
			{	
				getHD();
				System.out.printf("히드라에게 %d만큼 데미지를 입었습니다.%n",getHCS());
				System.out.println("-------------------------------------------");
				if (HP()<0)
				{
					
					System.out.println("유닛의 체력이 바닥나 죽었습니다.");
					System.out.println("-------------------------------------------");
				}
				else
				{
					System.out.println("유닛이 죽지 않았습니다.");
					System.out.printf("남은 체력은 %d입니다%n", HP());
					System.out.println("-------------------------------------------");
				}
			}
			else if(getHCS()<=0)  
			{
				System.out.println("히드라에게 데미지를 입지 않았습니다.");
				System.out.println("-------------------------------------------");
			}
		}
		public void GetHurtUltra()
		{
			
			if(getUCS()>0)
			{
				getUD();
				System.out.printf("울트라에게 %d만큼 데미지를 입었습니다.%n",getUCS());
				System.out.println("-------------------------------------------");
				if (HP()<=0)
				{
					Death();
					System.out.println("유닛의 체력이 바닥나 죽었습니다.");
					System.out.println("-------------------------------------------");
				}
				else
				{
					System.out.println("유닛이 죽지 않았습니다.");
					System.out.printf("남은 체력은 %d입니다%n", HP());
					System.out.println("-------------------------------------------");
				}
			}
			else if(getUCS()<=0)  
			{
				System.out.println("울트라에게 데미지를 입지 않았습니다.");
				System.out.println("-------------------------------------------");
			}

		}
		public void Cure()
		{
			
			if(HP()>0 && HP()<40)
			{
				Heal();
				if(HP()>=40)
				{
					MFHP();
					System.out.println("치료가 되었습니다.");
					System.out.printf("현재 체력은 %d입니다%n",HP());
					System.out.println("-------------------------------------------");
				}
				
			}
			else if(HPT()>40)
			{
				MFHP();
				System.out.println("더이상 회복되지 않습니다.");
				System.out.println("-------------------------------------------");
			}
			else if(HP() <= 0)
			{ 
				System.out.println("이 유닛의 체력은 0이하입니다.");
				System.out.println("이 유닛은 살릴 수 없는 유닛입니다.");
				System.out.println("-------------------------------------------");
			}
		}
}
		
				 


