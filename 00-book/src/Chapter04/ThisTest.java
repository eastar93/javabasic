package Chapter04;

public class ThisTest {
	
	public ThisTest() {
		System.out.println("객체생성 시 : " + this);
	}
	public static void main(String[] args) {
		ThisTest tt = new ThisTest();
		System.out.println("객체생성 후 : " + tt);
	}

}
