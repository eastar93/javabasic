package structure;

public class Structure01 {
	
	public static void main(String[] args) {
		/*
		 * Scanner와 마찬가지로 사용자가 커스텀으로 디자인한 자료형은
		 * 아래와 같이 new 자료형(); 문법으로 생성합니다.
		 */
		Person a = new Person();
		// a라는 구조체에 이름, 나이, 폰번호를 입력합니다.
		a.name = "신동규";
		a.age = 29;
		a.pNum = "010-8899-0785";
		// 입력된 자료를 하나하나 출력합니다.
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.pNum);
		
		System.out.println();
		
		Person b = new Person();
		b.name = "홍길동";
		b.age = 99;
		b.pNum = "010-1234-5678";
		
		System.out.println(b.name);
		System.out.println(b.age);
		System.out.println(b.pNum);
	}
}
