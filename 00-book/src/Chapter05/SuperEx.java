package Chapter05;

class Parent1 {
	
	public Parent1(int var) {
		System.out.println("Parent 클래스");
	}
}

class SuperEx extends Parent1 {
	
	public SuperEx() {
		super(1);
		System.out.println("SuperEx 클래스");
	}
	
	public static void main(String[] args) {
		
		SuperEx se = new SuperEx();
	}
}
