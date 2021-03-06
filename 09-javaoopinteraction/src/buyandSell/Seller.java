package buyandSell;

public class Seller {
	
	//판매처
	//돈, 망고를 가집니다.
	
	//생성자에서 망고갯수를 입력받을 수 있습니다.
	//돈은 0으로 넣어주세요.
	
	//판매시 망고갯수를 입력할 수 있고
	//망고갯수 * 1000만큼의 돈이 올라가고
	//망고는 판 갯수만큼 차감됩니다.
	//0미만으로 망고가 줄어들 수 없습니다.
	
	//showSeller를 이용해 현재 남은 망고와 돈을 볼 수 있습니다.
	
	private int money;
	private int mango;
	
	
	public Seller(int mango)
	{
		this.money = 0;
		this.mango = mango;
	}
	
	public void sellMango(int m)
	{
		if(this.mango<m)
		{
			System.out.printf("%d개 만큼의 망고가 없습니다.%n",m);
			System.out.println("---------------------");
			return;
		}
		money += m*1000;
		mango -= m;
		System.out.printf("남은 망고는 %d개입니다.%n",mango);
		System.out.printf("벌어들인 돈은 %d원입니다.%n",money);
		System.out.println("---------------------");
	}
	public void showSeller()
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

