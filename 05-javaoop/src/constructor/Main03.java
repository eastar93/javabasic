package constructor;

public class Main03 {
	
	public static void main(String[] args) {
		
		BasketballPlayer p1 = new BasketballPlayer("박건",23,180,150);
		p1.getInfo();
		p1.DunkShoot();
		System.out.println("----------------");
		BasketballPlayer p2 = new BasketballPlayer("건희",27,160,100);
		p2.getInfo();
		p2.DunkShoot();
				
	}

}
