package constructor;

public class Main02 {
	
	public static void main(String[] args) {
		
		Dog D1 = new Dog("카레", 6, "골든리트리버", false);
		Dog D2 = new Dog("바둑이", 3, "코커스파니엘", true);
		System.out.println("-----------------");
		D1.getInfo();
		System.out.println("-----------------");
		D2.getInfo();
	}

}
