package buyandSell;

public class MSeller {
	
	private int mango;
	private int money;
	
	public MSeller(int mango) 
	{	
		this.mango = mango;
		this.money = 0;
	}
	
	public void sellMango(int m) 
	{
		if(this.mango < m)
		{
			System.out.printf("%d개 만큼의 망고는 없습니다.",m);
			System.out.println("----------------------");
			return;
		}
		money+=(m*1500);
		mango-=m;
		System.out.printf("남은 망고는 %d개입니다.%n",mango);
		System.out.printf("벌어들인 돈은 %d원입니다.%n",money);
		System.out.println("---------------------");
	}
	public void showMSeller()
	{
		System.out.printf("남은 망고 갯수는 %d개 입니다.%n",mango);
		System.out.printf("벌어들인 돈은 %d원 입니다.%n",money);
		System.out.println("---------------------");
	}
	
	//망고갯수를 buyer에서 확인할 수 있도록 getMango() getter를 생성해줌
	public int getMango() {
		return mango;
	}

}
