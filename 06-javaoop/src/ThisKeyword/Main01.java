package ThisKeyword;

public class Main01 {
	
	public static void main(String[] args) {
		
		//this가 적용된 Person 생성하기
		//생성시 Ctrl + Space를 누르면 입력할 요소가 출력됨
		Person p1 = new Person("신동규", 29, 20000, "컴소과");
		p1.getInfo();
		Person p2 = new Person("아무개", 25, 15000, "디자인과");
		p2.getInfo();
	}

}
