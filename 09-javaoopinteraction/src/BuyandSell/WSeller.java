package BuyandSell;

public class WSeller {
	
	private int watermellon;
	private int money;

	public WSeller(int watermellon)
	{
		this.watermellon = watermellon;
		this.money = 0;
	}
	
	public void sellWatermellon(int w)
	{
		if(this.watermellon<0)
		{
			System.out.printf("%d개 만큼의 수박이 없습니다.");
			System.out.println("---------------------");
			return;
		}
		money+=(w*2700);
		watermellon-=w;
		System.out.printf("남은 수박은 %d통입니다.%n",watermellon);
		System.out.printf("벌어들인 돈은 %d원입니다.%n",money);
		System.out.println("---------------------");
	}
	public void showWSeller()
	{
		System.out.printf("남은 수박 갯수는 %d개 입니다.%n",watermellon);
		System.out.printf("벌어들인 돈은 %d원 입니다.%n",money);
		System.out.println("---------------------");
	}

	public int getWatermellon() {
		return watermellon;
	}
	
}
