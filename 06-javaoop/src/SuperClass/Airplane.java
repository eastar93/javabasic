package SuperClass;

public class Airplane {
	
	//비행기는 속도를 가집니다
	public int speed;
	
	//생성자는 속도를 입력한 값으로 맞춰줍니다.
	public Airplane(int s) 
	{
		speed = s;
	}
	
	//fly() 메서드를 수행하면 속도가 500씩 붙습니다.
	//단, 일반 비행기를 속도가 900이상이 될 수 없습니다.
	public void fly() {
		
		if(speed + 500 >900) {
			speed = 900;
			System.out.println("현재 속도가 최고속도입니다.");		
		}
		else
		{
			speed+=500;
			System.out.printf("시속 %dkm/h로 비행중.%n",speed);
		}
//		--------------------------------------------------
		
//		speed+=500;
//		if(speed>900)
//		{
//			speed=900;
//			System.out.println("현재 속도가 최고속도입니다.");
//		}
//		System.out.printf("시속 %dkm/h로 비행중.%n",speed);
//		System.out.println("----------------------");
		//속도를 조건식으로 체크해서 최대 속도는 900을 초과할 수 없고 최대 속도 미만에서 500씩 더해주는 로직 작성
		
	}
	
	//breakSpeed() 메서드를 수행하면 속도가 100씩 감속합니다.
	//단, 브레이크 연산은 속도 최저선이 0입니다.
	public void breakSpeed() {
		//속도를 조건식으로 체크해서 0미만으로 내려갈 수 없고 100씩 감속시키는 로직

		
		if(speed - 100 <0) {
		speed = 0;
		
		System.out.printf("감속 결과 시속 %dkm/h입니다.%n",speed);
		System.out.println("더이상 속도를 줄일 수 없습니다.");
		System.out.println("----------------------");
	}
	else
	{
		speed-=100;
		System.out.printf("감속 결과 시속 %dkm/h입니다.%n",speed);
	}
//		-------------------------------------------------------
//		
//		speed-=100;
//		if(speed>0)
//		{
//			System.out.printf("감속 결과 시속 %dkm/h입니다.%n",speed);
//			System.out.println("----------------------");
//		}
//		else if(speed<=0)
//		{
//			speed = 0;
//			System.out.printf("감속 결과 시속 %dkm/h입니다.%n",speed);
//			System.out.println("더이상 속도를 줄일 수 없습니다.");
//			System.out.println("----------------------");
//		}	
	}
	
}
