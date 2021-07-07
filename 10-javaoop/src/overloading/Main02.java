package overloading;

public class Main02 {
	
	public static void main(String[] args) {
		
		OverTest o1 = new OverTest();
		OverTest o2 = new OverTest("a");
		OverTest o3 = new OverTest(3);
		OverTest o4 = new OverTest("b",4);
		
		o1.showData();
		o2.showData();
		o3.showData();
		o4.showData();
	}

}
