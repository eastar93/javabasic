package polymorphism;

public class Main {
	
	public static void main(String[] args) {
		
		//부모 타입인 Person만으로도 양쪽 자료형을 모두 처리 가능
		Person s1 = new Student("복학생", 24, 3);
		Person a1 = new Army("최일병", 21, "일병");
		Person o1 = new Official("김홍식", 25, "회사원");
		
		//단 메서드는 Person을 베이스 객체는
		//Person에 정의된 메서드만 호출 가능
		s1.showPerson();
		a1.showPerson();
		o1.showPerson();
		

	}
}
