package Static02;

public class Main {
	
	public static void main(String[] args) {
		//System.out.println(Asean.score);
		
		//Asean 조원 없이도 Asean 조별점수는 조회 가능
		Asean A1 = new Asean(75, 80, 100);
		Asean A2 = new Asean(60, 90, 85);
		Asean A3 = new Asean(80, 55, 95);
		Asean A4 = new Asean(55, 100, 75);
		
		A1.showAseanInfo();
		A2.showAseanInfo();
		A3.showAseanInfo();
		A4.showAseanInfo();
		
		
	}

}
