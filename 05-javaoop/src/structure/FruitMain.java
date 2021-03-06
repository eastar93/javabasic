package structure;

public class FruitMain {
	
	public static void main(String[] args) {
		
		FruitClass F1 = new FruitClass();
		FruitClass F2 = new FruitClass();
		
		F1.name = "사과";
		F1.area = "국내산";
		F1.taste = "단맛";
		F1.price = 3000;
		
		F1.getInfo();
		
		System.out.println("--------");
		
		System.out.println("이름 : " + F1.name);
		System.out.println("생산지 : " + F1.area);
		System.out.println("맛 : " + F1.taste);
		System.out.println("가격 : " + F1.price);
	
		System.out.println("--------");
		
		F2.name = "레몬";
		F2.area = "호주산";
		F2.taste = "신맛";
		F2.price = 2500;
		
		F2.getInfo();
		
		System.out.println("--------");

		System.out.println("이름 : " + F2.name);
		System.out.println("생산지 : " + F2.area);
		System.out.println("맛 : " + F2.taste);
		System.out.println("가격 : " + F2.price);
		
	}

}
