package polymorphism;

public class Student extends Person {
	
	private int grade;
	
	//super()를 이용해 초기화하는 생성자를 만들어 주세요.
	public Student(String name, int age, int grade) {
		//부모쪽의 생성자에게 넘겨주기 위해 
		//생성자 내부에서 super()를 사용합니다.
		//자식쪽 생성자에서 super(전달자료1, 전달자료2...);를 사용하면 부모 생성자에게 전달된다.
		super(name, age);
		this.grade = grade;
	}
	
	//상속받은 showPerson을 활용한 ShowStudent를 작성해주세요.
	public void showStudent() {
		showPerson();
		System.out.printf("학년 : %d%n",grade);
		System.out.println("-----------");
	}
	
	//부모쪽의 showPerson()을 오버라이딩해서 자식쪽에 재정의
	//재정의된 메서드는 부모타입으로도 자식쪽에서 호출가능합니다.
		public void showPerson() {
			super.showPerson();
			System.out.printf("학년 : %d%n",grade);
			System.out.println("-----------");
		}


}
