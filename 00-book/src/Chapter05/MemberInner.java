package Chapter05;

class MemberInner {
	
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	class Inner { // 내부 클래스 정의
		public void printData() {
			System.out.println("int a : " + a);
			System.out.println("private int b : " + b); // 주시하자!
			System.out.println("static int c : " + c);
		}
	}
	public static void main(String[] args) {
		
	//	MemberInner outer = new MemberInner();
	//	MemberInner.Inner inner = outer.new Inner();
		MemberInner.Inner inner = new MemberInner().new Inner();
		inner.printData();
	}

}
