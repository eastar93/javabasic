package AccessModifier02;

public class Main {
	
	public static void main(String[] args) {
		
		//Parent를 상속받은 Child 내부의 자료 조회
		Child01 child = new Child01();
		//1.public 자료
		System.out.println(child.a);
		//2.protected 자료
		//현재 Main.java와 같은 패키지 내부에 Parent, Child가 존재하므로 protected가 접근 가능
		//같은 클래스, 같은 패키지는 접근이 가능하지만 다른 패키지에 속해있는 클래스인 경우 상속관계가 없으면 접근이 불가능하다.
		System.out.println(child.b);
		//3.private 자료
		//같은 패키지 안에 존재하더라도 접근이 되지 않고 같은 클래스 안에 있어야 접근이 가능하다.
//		System.out.println(child.c);
		
		//4.default 자료
		System.out.println(child.d);
	}
	

}
