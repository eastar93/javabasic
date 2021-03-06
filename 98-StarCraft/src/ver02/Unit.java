package ver02;

public class Unit {
	 
	private String Tribe = "Terran"; 
	//종족
	private String Type = "Normal";
	//타입
	private String Name = "Marine";
	//이름
	private String Size = "Small";
	//크기
	private int HP = 40;
	//체력
	private int Heal = 15;
	//회복
	private int HPT = 0;
	//체력 회복시 체력
	private int MFHP = 40;
	//마린 체력 풀회복
	private int STP = 5;
	//스팀팩 감소량
	private int STPH = 0;
	//스팀팩 이후 체력
	private int AST = 0;
	//공격력 스피드 총합
	private int ASL;
	//공격 속도 한계
	private int AS = 1;
	//공격 스피드 초기값
	private int ASV = 1;
	//공격 스피드 계수값
	private int AP = 6;
	//공격력 초기값
	private int APT = 0; //AP+AVT
	//공격력 총합
	private int AVT = 0; //AU+AV
	//공격력 계수 총합
	private int AU = 0; 
	//공격력 계수 초기값
	private int AV = 2;
	//공격력 계수
	private int SP = 0;
	//방어력 초기값
	private int SPT = 0; //SP+SVT
	//방어력 총합
	private int SVT = 0; //SU+SV
	//방어력 계수 총합
	private int SU = 0;
	//방어력 계수 초기값
	private int SV = 2;
	//방어력 계수
	private int ZCS = 0;
	//저글링 공격력과 마린 방어력 비교
	private int ZD = 3;
	//저글링 데미지
	private int HCS = 0;
	//히드라 공격력과 마린 방어력 비교
	private int HD = 7;
	//히드라 데미지
	private int UCS = 0;
	//울트라 공격력과 마린 방어력 비교
	private int UD = 15;
	//울트라 데미지
	
	public String Tribe()
	{
		return Tribe;
	}
	public void Tribe(String tr)
	{
		this.Tribe = tr;
	}
	
	public String Type()
	{
		return Type;
	}
	public void Type(String ty)
	{
		this.Type = ty;
	}
	public String Name() 
	{
		return Name;
	}		
	public void Name(String na)
	{
		this.Name = na;
	}
	public String Size()
	{
		return Size;
	}
	public void Size(String si)
	{
		this.Size = si;
	}
	public int HP() 
	{
		return HP;
	}
	public void HP(int hp)
	{
		this.HP = hp;
	}
	
	public int Heal() 
	{
		return HP+=15;
	}
	public int HPT()
	{
		return HP+15;
	}
	public int MFHP()
	{
		return HP=40;
	}
	public int STP()
	{
		return HP-=5;
	}
	public int STPA()
	{
		return HP-5;
	}
	public int AST()
	{
		return AS;
	}
	public void AST(int ast)
	{
		this.AST = ast;
	}
	public int ASL()
	{
		return AS=0;
	}
	public int AS()
	{
		return AS+=ASV;
	}
	public int ASV()
	{
		return ASV;
	}
	public int AP() 
	{
		return AP;
	}
	public void AP(int ap)
	{
		this.AP = ap;
	}
	public int APT() 
	{
		return AP+=AV;
	}
	public int AVT()
	{
		return AU+=AV;
	}
	public int AU() 
	{
		return AU;
	}
	public void AU(int au)
	{
		this.AU = au;
	}
	public int AV() 
	{
		return AV;
	}
	public int SP()
	{
		return SP;
	}
	public void SP(int sp)
	{
		this.SP = sp;
	}
	public int SPT()
	{
		return SP+=SV;
	}
	public int SVT()
	{
		return SU+=SV;
	}
	public int SU()
	{
		return SU;
	}
	public void SU(int su)
	{
		this.SU = su;
	}
	public int SV()
	{
		return SV;
	}
	public int getZCS()
	{
		return 3-SP;
	}
	public int getZD()
	{
		return HP+=(SP-3);
	}
	public int getHCS()
	{
		return 7-SP;	
	}
	public int getHD()
	{
		return HP+=(SP-7);	
	}
	public int getUCS()
	{
		return 15-SP;
	}	
	public int getUD()
	{
		return HP+=(SP-15);
	}
	public int Death()
	{
		return HP=0;
	}
	
	
	
	public void getInfo()
	{
		System.out.println("유닛 스펙");
		System.out.println("-------------------------------------------");
		System.out.println("종족 :" + Tribe);
		System.out.println("공격형태 :" + Type);
		System.out.println("유닛 이름 :" + Name);
		System.out.println("유닛 크기 :" + Size);
		System.out.println("체력 :" + HP);
		System.out.printf("공격력 : %d(+%d)%n",AP,AU);
		System.out.printf("방어력 :%d(+%d)%n",SP,SU);
		System.out.println("-------------------------------------------");
	}
}
