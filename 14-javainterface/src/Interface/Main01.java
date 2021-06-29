package Interface;

public class Main01 {
	
	public static void main(String[] args) {
		//자동차 생성 및 사용
		
		Car c1 = new Car("SDK");
		Vehicle v1 = new Car("신동규");
		v1.Accel();
		v1.breakSpeed();
		v1.Accel();
		v1.Accel();
		v1.Accel();
		v1.showStatus();
		
		c1.Accel();
		c1.showStatus();
		
	}

}
