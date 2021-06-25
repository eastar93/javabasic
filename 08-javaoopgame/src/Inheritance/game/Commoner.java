package Inheritance.game;

public class Commoner {
	
	//레벨, 체력, 아이디, 마나수치를 변수로 만들어주세요.
	 
	//메서드는 getInfo()로 콘솔에 변수 상태를 조회할 수 있도록 구성해주시면 됩니다.
	
	public String ID;
	public int Lv;
	public String J;
	public int Hp;
	public int Mp;
	
	public void getInfo()
	{
		System.out.printf("ID : %s%n",ID);
		System.out.printf("레벨 : %d%n",Lv);
		System.out.printf("직업 : %s%n",J);
		System.out.printf("체력 : %d%n",Hp);
		System.out.printf("마나 : %d%n",Mp);		
	}
	

}
