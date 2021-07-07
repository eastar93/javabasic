package structure;

public class PersonMain {
	
	public static void main(String[] args) {
		
		PersonClass Person1 = new PersonClass();
		PersonClass Person2 = new PersonClass();
		
		Person1.name = "신동규";
		Person1.age = 29;
		Person1.address = "서울";
		Person1.pNum = "010-8899-0785";
		Person1.glasses = true;
				
		Person2.name = "김철수";
		Person2.age = 31;
		Person2.address = "광주";
		Person2.pNum = "010-3658-9769";
		Person2.glasses = false;
		
		Person1.getInfo();
		System.out.println("--------------");
		Person2.getInfo();
	}

}
