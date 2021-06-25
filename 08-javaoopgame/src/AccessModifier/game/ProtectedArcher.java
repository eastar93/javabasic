package AccessModifier.game;

public class ProtectedArcher extends ProtectedCommoner {
	
	public ProtectedArcher() 
	{	
		this.Lv = 1;
		this.Hp = 15;
		this.Mp = 10;
		this.Exp = 0;
	}
	
	public void getInfo()
	{
		System.out.printf("Lv : %d%n",Lv);
		System.out.printf("Hp : %d%n",Hp);
		System.out.printf("Mp : %d%n",Mp);
		System.out.printf("Exp : %d%n",Exp);
		System.out.println("------------------------");
	}
	
	public void hunt()
	{
		if((Hp-2)>0)
		{
			System.out.println("궁수가 사냥을 시작합니다.");
			Hp -= 2;
			Exp += 10;
			System.out.printf("사냥 결과 체력은 %d가 되었습니다.%n",Hp);
			System.out.printf("사냥 결과 경험치는 %d가 되었습니다.%n",Exp);
		}
		else
		{
			System.out.println("궁수가 체력이 바닥나 사망하였습니다.");
		}
	}
	
	public void MultiShot()
	{
		if((Mp-2)>0)
		{
			System.out.println("궁수가 멀티샷을 시전했습니다.");
			Mp -= 2;
			Exp += 15;
			System.out.printf("사냥 결과 마력은 %d가 되었습니다.%n",Mp);
			System.out.printf("사냥 결과 경험치는 %d가 되었습니다.%n",Exp);
		}
		else
		{
			System.out.println("마나가 바닥나 스킬을 더 이상 사용 할 수 없습니다.");
		}
	}

}
