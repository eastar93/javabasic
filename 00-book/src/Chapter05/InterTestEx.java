package Chapter05;

interface InterTest {
	static final int A = 100;
	abstract int getA(); // abstarct 예약어는 생략할 수 있다.
}

class InterTestEx implements InterTest {
	
	public int getA() {
		return A;
	}
	
	public static void  main(String[] args) {
		
		InterTestEx it1 = new InterTestEx();
		System.out.println("getA() : " + it1.getA());		
	}
}
