package buyandSell;

public class Main03 {
	
	public static void main(String[] args) {
		
		Customer01 cs1 = new Customer01(20000);
		MSeller ms1 = new MSeller(8);
		OSeller os1 = new OSeller(5);
		WSeller ws1 = new WSeller(3);
		cs1.buyMango(ms1, 3);
		cs1.showBuyer();
		cs1.buyOrange(os1, 2);
		cs1.showBuyer();
		cs1.buyWatermellon(ws1, 1);
		cs1.showBuyer();
		cs1.buyMango(ms1, 3);
		cs1.buyOrange(os1, 2);
		cs1.showBuyer();
		cs1.buyWatermellon(ws1, 2);
		cs1.showBuyer();
		cs1.buyMango(ms1, 2);
		cs1.buyOrange(os1, 1);
		cs1.showBuyer();
	}

}
