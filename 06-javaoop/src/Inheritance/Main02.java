package Inheritance;

public class Main02 {
	
	public static void main(String[] args) {
		
		Salaryman Sa1 = new Salaryman();
		Sa1.name = "신동규";
		Sa1.age = 29;
		Sa1.salary = 5500;
		
		Sa1.upSalary();
		Sa1.getSalaryInfo();
		System.out.println("-----------------");
		
		Student St1 = new Student();
		St1.name = "홍길동";
		St1.age = 24;
		St1.major = "무예학과";
		
		St1.getStudentInfo();
		
	}

}
