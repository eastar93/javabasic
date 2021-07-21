package structure;

public class Structure02 {
	
	//Person 내부의 정보를 쉽게 조회하기 위한 메서드 제작
	public static void getInfo(Person p) {
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.address);
		System.out.println(p.pNum);
	}
	
	public static void getCatInfo (Cat c) {
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.kind);
		System.out.println(c.color);
	}
	
	public static void main(String[] args) {
		// 사람을 두 명 만들어보세요(a, b)
		
		Person a = new Person();
		a.name = "홍길동";
		a.age = 99;
		a.address = "조선";
		a.pNum = "010-1234-5678";
		getInfo(a);
		
//		System.out.println(a.name);
//		System.out.println(a.age);
//		System.out.println(a.pNum);
		
		System.out.println("--------------");
		
		Person b = new Person();
		b.name = "아무개";
		b.age = 87;
		b.address = "NewYork";
		b.pNum = "010-8765-4321";
		getInfo(b);
		
//		System.out.println(b.name);
//		System.out.println(b.age);
//		System.out.println(b.pNum);
		
		System.out.println("--------------");
		
		Cat c = new Cat();
		c.name = "냥이";
		c.age = 3;
		c.kind = "러시안블루";
		c.color = "회색";
		System.out.println("고양이 이름 : "+c.name);
		System.out.println("고양이 나이 : "+c.age+"살");
		System.out.println("고양이 종류 : "+c.kind);
		System.out.println("고양이 색깔 : "+c.color);
		
//		getCatInfo(c);
		
		System.out.println("--------------");
		
		Cat d = new Cat();
		d.name = "깜이";
		d.age = 5;
		d.kind = "샴";
		d.color = "베이직";
		getCatInfo(d);
		
	}
	
}
