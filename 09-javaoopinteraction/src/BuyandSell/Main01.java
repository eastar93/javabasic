package buyandSell;

public class Main01 {
	
	public static void main(String[] args) {
		
		Buyer b1 = new Buyer(1000);
		Seller s1 = new Seller(5);
		b1.buyMango(s1, 3);
		b1.showBuyer();
		s1.showSeller();
		s1.sellMango(3);
		s1.sellMango(100);
		s1.sellMango(3);
	
		
	}

}
