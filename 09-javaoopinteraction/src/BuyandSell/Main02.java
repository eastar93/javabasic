package BuyandSell;

public class Main02 {
	
	public static void main(String[] args) {
		
		//상인 2개 만들기
		MSeller ms = new MSeller(1);
		OSeller os = new OSeller(1);
		//구매자 1개 만들기
		Customer01 cs1 = new Customer01(10000);
		//구매자 정보 확인
		cs1.showBuyer();
		//1번 상인 정보 확인
		ms.showMSeller();
		//2번 상인 정보 확인
		os.showOSeller();
		//1번 상인에게 구매자가 망고 구매
		cs1.buyMango(ms, 3);
		//구매자 정보 확인
		cs1.showBuyer();
		//1번 상인 정보 확인
		ms.showMSeller();
		//2번 상인 정보 확인
		os.showOSeller();
	
		
	}

}
