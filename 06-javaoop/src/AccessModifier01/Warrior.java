package AccessModifier01;

public class Warrior {
	//ID, 체력, 공격력, 레벨, 경험치 속성 추가
	//사용자가 main에서 임의로 수치를 고치는것을 막기 위해 
	//public 대신 private으로 수정
	private String ID;
	private int Hp;
	private int Atk;
	private int Lv;
	private int Exp;
	
	//메서드는 아무리 사용해도 개발자의 의도대로만 사용되도록 
	//제한하기 수월하기 때문에 일반적으로 public으로 설정합니다.
	public Warrior(String id) 
	{
		this.Hp = 20;
		this.Atk = 3;
		//레벨, 경험치는 생성시 1, 0으로
		this.Lv = 1;
		this.Exp = 0;
		//ID는사용자가 입력한 대로
		this.ID = id;
	}
	
	public void hunt()
	{
		System.out.println("전사가 사냥을 시작합니다.");
		Hp -= 2;
		Exp += 10;
		System.out.printf("사냥 결과 체력은 %d가 되었습니다.%n",Hp);
		System.out.printf("사냥 결과 경험치는 %d가 되었습니다.%n",Exp);
	}
	
	public void getInfo()
	{
		System.out.println("ID : " +ID);
		System.out.println("레벨 : " +Lv);
		System.out.println("공격력 : " +Atk);
		System.out.println("체력 : " +Hp);
		System.out.println("경험치 : " +Exp);
		
	}
}
