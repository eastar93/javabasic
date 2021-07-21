package buyandSell;

public class OSeller {
	
	private int orange;
	private int money;
	
	public OSeller(int orange)
	{
		this.orange = orange;
		this.money = 0;
	}
	
	public void sellOrange(int o)
	{
		if(this.orange < o)
		{
			System.out.printf("%d개 만큼의 오렌지는 없습니다.",o);
			System.out.println("----------------------");
			return;
		}
		money+=(o*1200);
		orange-=o;
		System.out.printf("남은 오렌지는 %d개입니다.%n",orange);
		System.out.printf("벌어들인 돈은 %d원입니다.%n",money);
		System.out.println("----------------------");
	}
	public void showOSeller()
	{
		System.out.printf("남은 오렌지 갯수는 %d개 입니다.%n",orange);
		System.out.printf("벌어들인 돈은 %d원 입니다.%n",money);
		System.out.println("---------------------");
	}
	
	public int getOrange() {
		return orange;
	}

}
