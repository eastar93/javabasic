package Polymorphism.game;

public class Magician extends Hero{
	
	public Magician() 
	{
		super("Magician",150,100,12,5,0);
	}

	public void meteor(Monster ms)
	{
		if (getMp()<=0 && ms.getHp()>0)
		{
			setMp(0);
			System.out.println("마나가 충분하지 않다 더이상 스킬을 사용할 수 없습니다.%n");
			System.out.println("----------------------------------------------");
			return;
		}
		if (getExp()>0 && ms.getHp()<=0)
		{
			System.out.printf("%s는 이미 죽은 몬스터입니다.%n",ms.getName());
			System.out.println("----------------------------------------------");
			return;
		}
		setSkAtk(15);
		setMp(3);
		ms.setHp(getSkAtk());
		if(getSkAtk()<=ms.getDef())
		{
			System.out.printf("마법사는 %s의 방어력이 높아 데미지를 못입혔습니다.%n",ms.getName());
			System.out.println("----------------------------------------------");
		}
		else if(ms.getHp()>0 && getSkAtk()>ms.getDef())
		{
			System.out.printf("마법사가 %s에게 메테오 기술을 시전했습니다.%n",ms.getName());
			System.out.printf("마법사가 %s에게 %d만큼의 데미지를 주었습니다.%n",ms.getName(),getSkAtk()-ms.getDef());
			System.out.println("----------------------------------------------");
			ms.MonsterData();
		}
		else if(ms.getDHp()<=0) 
		{
			System.out.printf("%s이 마법사에 의해 사망하였습니다.%n",ms.getName());
			System.out.printf("경험치 %d를 얻었습니다.%n",ms.getExp());
			if(ms.getHp()<0)
			{
				ms.setHp(0);
			}
			setExp(getExp()+ms.getExp());
			System.out.println("----------------------------------------------");
		}
	}	
	
}
