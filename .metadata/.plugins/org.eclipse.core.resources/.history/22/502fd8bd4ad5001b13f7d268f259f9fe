package AccessModifier.game;

public class Warrior extends Commoner {
	
	public void hunt()
	{
		if((getHp()-2)>0)
		{
			System.out.println("전사가 사냥을 시작합니다.");
			System.out.println("------------------------");
			DHp(2);
			IExp(10);
			System.out.printf("사냥 결과 체력은 %d가 되었습니다.%n",getHp());
			System.out.printf("사냥 결과 경험치는 %d가 되었습니다.%n",getExp());
			System.out.println("------------------------");
		}
		else 
		{
			System.out.println("전사가 체력이 바닥나 사망하였습니다.");
			System.out.println("------------------------");
		}
		
	}
	
	public void doubleAttack()
	{
		if((getMp()-2)>0)
		{
			System.out.println("전사가 더블어택 스킬을 시전했습니다.");
			System.out.println("------------------------");
			DMp(2);
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
	
	public void IndomitableWill()
	{
		setAtk(3);
		System.out.println("불굴의 의지를 사용해 공력력이 3증가 되었습니다.");
	}
	
	public void AbsoulteDef()
	{
		setDef(5);
		System.out.println("절대 방어를 사용해 방어력이 5증가 했습니다.");
	}
	
	
		
		
}
	



