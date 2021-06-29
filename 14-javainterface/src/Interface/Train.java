package Interface;

public class Train implements Vehicle {

	private String operator;
	private int speed;
	private int gas; 
	
	public Train(String operator)
	{
		this.operator = operator;
		this.speed = 0;
		this.gas = TRAIN_MAS_GAS;
	}
	
	@Override
	public void Accel() {
		
		if(speed + 100 > 750)
		{
			speed = 750;
		} else {
			speed += 100;
		}
		gas -= 50;
		
	}

	@Override
	public void breakSpeed() {

		if(speed - 50 < 0)
		{
			speed = 0;
		} else {
			speed -= 50;
		}
	}

	@Override
	public void reFuel() {
		
		if(gas + 300 > TRAIN_MAS_GAS)
		{
			gas = TRAIN_MAS_GAS;
		} else {
			gas += 300;
		}
		
	}

	@Override
	public void showStatus() {
		
		System.out.printf("운전사 : %s%n", operator);
		System.out.printf("현재 속도 : %d%n", speed);
		System.out.printf("현재 연료량 : %d%n", gas);
		System.out.println("---------------");
		
	}

}
