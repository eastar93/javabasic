package buyandSell;

public class Customer01 {
	
	private int money;
	private int mango;
	private int orange;
	private int watermellon;
	
	public Customer01(int money) {
		this.money = money;
		this.mango = 0;
		this.orange = 0;
		this.watermellon = 0;
		
	}
	public void buyMango(MSeller mseller ,int m)
	{
		//조건식 : 망고의 총 가격보다 내 돈이 적은 경우
		if((m*1000)>money)
		{
			System.out.printf("망고를 %d개 만큼 살 돈이 없습니다 %n",m);
			System.out.println("---------------------");
			return;
		}
		//조건식 : 구매할 망고 갯수보다 판매자의 재고가 적은 경우 
		if(mseller.getMango() < m) 
		{
			System.out.println("망고 재고가 부족합니다.");
			System.out.println("---------------------");
			return;
		}
			money -= (m*1500);
			mango += m;
			System.out.printf("망고를 %d개 구매 했습니다.%n",m);
			System.out.println("---------------------");
			mseller.sellMango(m);
			//판매자쪽에서 망고를 파는 코드를 내가 망고를 사는 코드에 넣어서
			//동시에 사고 팔도록 처리해야 상호작용이 일어난다.
			
	}
	
	public void buyOrange(OSeller oseller, int o)
	{
		if((o*1500)>money)
		{
			System.out.printf("오렌지를 %d개 만큼 살 돈이 없습니다.%n",o);
			System.out.println("---------------------");
			return;
		}
		if(oseller.getOrange() < o)
		{
			System.out.println("오렌지 재고가 부족합니다.");
			System.out.println("---------------------");
			return;
		}
			money -= (o*1200);
			orange += o;
			System.out.printf("오렌지를 %d개 구매 했습니다.%n",o);
			System.out.println("---------------------");
			oseller.sellOrange(o);
	}
	
	public void buyWatermellon(WSeller wseller, int w)
	{
		if((w*2300)>money)
		{
			System.out.printf("수박을 %d개 만큼 살 돈이 없습니다.%n",w);
			System.out.println("---------------------");
			return;
		}
		if(wseller.getWatermellon() < w)
		{
			System.out.println("수박의 재고가 부족합니다.");
			System.out.println("---------------------");
			return;
		}
			money -= (w*2700);
			watermellon += w;
			System.out.printf("수박을 %d개 구매했습니다.%n",w);
			System.out.println("---------------------");
			wseller.sellWatermellon(w);
	}
	public void showBuyer()
	{
		System.out.printf("남은 돈은 %d원 입니다.%n",money);
		System.out.printf("망고 갯수는 %d개 입니다.%n",mango);
		System.out.printf("오렌지 갯수는 %d개 입니다.%n",orange);
		System.out.printf("수박 갯수는 %d개 입니다.%n",watermellon);
		System.out.println("---------------------");
	}


}
