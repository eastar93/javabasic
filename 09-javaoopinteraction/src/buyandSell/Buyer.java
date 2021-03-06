package buyandSell;

public class Buyer {
	//구매자
	//구매자는 돈, 망고갯수를 멤버변수로 가집니다.
	//은닉 구현을 위해 private으로 처리합니다.
	
	//생성자는 (int money)를 받아 돈을 초기화합니다.
	//망고는 자동으로 0을 대입합니다.
	
	//showBuyer는 구매자의 상태를 보여줍니다.
	//money, mango 수치가 각각 몇인지 콘솔에 찍어줍니다.
	
	private int money;
	private int mango;
	
	public Buyer(int money) {
		this.money = money;
		this.mango = 0;
	}
	
	//buyMango는 망고를 합니다.
	//(int mango)로 망고 갯수를 입력받으면, 망고*1000만큼의
	//돈을 차감하고 망고 변수에 그 만큼 갯수를 늘려줍니다.
	//현실에서 망고를 구매할때 구매자가 가게를 고르지
	//가게에서 구매자를 선택하지 않으므로, Seller 변수를
	//Buyer가 고를 수 있도록 파라미터를 설정을 합니다.
	public void buyMango(Seller seller ,int m)
	{
		//조건식 : 망고의 총 가격보다 내 돈이 적은 경우
		if((m*1000)>money)
		{
			System.out.printf("망고를 %d개 만큼 살 돈이 없습니다 %n",m);
			System.out.println("---------------------");
			return;
		}
		//조건식 : 구매할 망고 갯수보다 판매자의 재고가 적은 경우 
		if(seller.getMango() < m) 
		{
			System.out.println("망고 재고가 부족합니다.");
			return;
		}
			seller.sellMango(m);
			money -= (m*1000);
			mango += m;
			System.out.printf("망고를 %d개 구매 했습니다.%n",m);
			System.out.println("---------------------");
			//판매자쪽에서 망고를 파는 코드를 내가 망고를 사는 코드에 넣어서
			//동시에 사고 팔도록 처리해야 상호작용이 일어난다.
			
			return;
	}
	public void showBuyer()
	{
		System.out.printf("남은 돈은 %d원 입니다.%n",money);
		System.out.printf("망고 갯수는 %d개 입니다.%n",mango);
		System.out.println("---------------------");
	}

}
