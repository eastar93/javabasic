package AccessModifier.game;

public class Magician extends Commoner {
	
	public void hunt()
	{		
		if((getHp()-2)>0)
		{
			System.out.println("마법사가 사냥을 시작합니다.");
			System.out.println("------------------------");
			DHp(2);
			IExp(10);
			System.out.printf("사냥 결과 체력은 %d가 되었습니다.%n",getHp());
			System.out.printf("사냥 결과 경험치는 %d가 되었습니다.%n",getExp());
			System.out.println("------------------------");
		}
		else
		{
			System.out.println("마법사가 체력이 바닥나 사망하였습니다.");
			System.out.println("------------------------");
		}
	}
	
	public void FireBall()
	{
		if((getMp()-3)>0)
		{
			System.out.println("마법사가 파이어볼 스킬을 시전했습니다.");
			System.out.println("------------------------");
			DMp(3);
			IExp(15);
			System.out.printf("사냥 결과 마력은 %d가 되었습니다.%n",getMp());
			System.out.printf("사냥 결과 경험치는 %d가 되었습니다.%n",getExp());
			System.out.println("------------------------");
		}
		else
		{
			System.out.println("마나가 바닥나 스킬을 더이상 사용할 수 없습니다.");
			System.out.println("------------------------");
		}		
	}
	public void EarthQuake()
	{
		if((getMp()-5)>0)
		{
			System.out.println("마법사가 지진 스킬을 시전했습니다.");
			System.out.println("------------------------");
			DMp(5);
			IExp(25);
			System.out.printf("사냥 결과 마력은 %d가 되었습니다.%n",getMp());
			System.out.printf("사냥 결과 경험치는 %d가 되었습니다.%n",getExp());
			System.out.println("------------------------");
		}
		else
		{
			System.out.println("마나가 바닥나 스킬을 더이상 사용할 수 없습니다.");
			System.out.println("------------------------");
		}		
	}
	

}
