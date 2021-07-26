package Chapter05;

class StaticInner {
	
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	static class Inner {
		// 어쩔 수 없이 내부 클래스를 static으로 선언해야 할 경우가 있다.
		// 그건 바로 내부 클래스의 멤버들 중 하나라도 static 멤버가 있을 때다.
		
		static int d = 1000;
		public void printData() {
		// System.out.println("int a : " + a); //오류
		// System.out.println("private int b : " + b); // 오류
		System.out.println("static int c : " + c);
		System.out.println("static int d : " + d);
		}
	}
	public static void main(String[] args) {
		// 또 다른 독립된 객체에서 static 내부 클래스 생성할 때
		StaticInner.Inner inner = new StaticInner.Inner();
		inner.printData();
		
		// Static Inner라는 외부 클래스 내에서 생성할 때
		// Inner inner = new Inner();
		// inner.printData();
	}
}
