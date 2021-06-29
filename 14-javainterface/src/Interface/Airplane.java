package Interface;

public class Airplane implements Vehicle {

	String airline;
	int speed;
	int gas;
	
	public Airplane(String airline) {
		this.airline = airline;
		this.speed = 0;
		this.gas = AIRPLANE_MAX_GAS;
	}
	
	@Override
	public void Accel() {
		
		if(speed + 250 > 1200)
		{
			speed = 1200;
		} else {			
			speed += 250;
		}
		gas -= 120;
		
	}

	@Override
	public void breakSpeed() {
		
		if(speed - 150 < 0)
		{
			speed = 0;
		} else {
			speed -= 150;
		}
		
	}

	@Override
	public void reFuel() {
		
		if(gas + 400 > AIRPLANE_MAX_GAS)
		{
			gas = AIRPLANE_MAX_GAS;
		} else {
			gas += 400;
		}
		
	}

	@Override
	public void showStatus() {
		
		System.out.printf("항공사 : %s%n", airline);
		System.out.printf("현재 속도 : %d%n", speed);
		System.out.printf("현재 연료량 : %d%n", gas);
		System.out.println("---------------");
		
	}

}
