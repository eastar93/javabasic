package abstract01;

public class Main {
	
	public static void main(String[] args) {
		//Parent타입을 직접 생성 불가
//		Parent p1 = new Parent();
		
		//단 Parent를 상속받아 getA메서드로 구체화시킨 
		//Child타입으로는 객체 생성 및 사용이 가능
		Child c = new Child();
		c.getA();
		//추라고 오버라이딩 없이 상속받은 일반 메서드도 호출 가능
		c.getInfo();
	}
}
