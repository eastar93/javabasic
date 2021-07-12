package inheritance;

public class Main01 {
	
	public static void main(String[] args) {
		/*
		 * Student가 Person을 상속했기 때문에
		 * Student는 Person의 자원을 사용할 수 있습니다.
		 */
		
		Student s1 = new Student();
		s1.name = "신동규";
		s1.age = 29;
		s1.major = "컴퓨터소프트웨어과";
		
		s1.getPersonInfo();
		s1.getStudentInfo();
	
	}
}
