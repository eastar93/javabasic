package casting;

public class Rabbit extends Animal {
	
	public Rabbit(String name, int age)
	{
		super(name, age);
	}
	
	public  void run() {
		System.out.printf("토끼가 달립니다.");
	}
	
	public void sit() {
		System.out.println("토끼가 앉아있습니다.");
	}

}
