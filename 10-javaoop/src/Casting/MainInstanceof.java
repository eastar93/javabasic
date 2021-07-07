package Casting;

public class MainInstanceof {
	
	public static void main(String[] args) {
		
		Animal c1 = new Cat("모모", 5);
		//먼저 Animal 타입인 c1의 근본자료형이 Cat인지 검사
		System.out.println(c1 instanceof Cat);
		
		//먼저 Animal 타입인 c1의 근본자료형이 Rabbit인지 검사
		System.out.println(c1 instanceof Rabbit);
		
		//먼저 Animal 타입인 c1의 근본자료형이 Animal인지 검사
		System.out.println(c1 instanceof Animal);
		
	}

}
