package polymorphism;

public class Army extends Person {
	
	private String rank;

	public Army(String name, int age, String rank)
	{
		super(name, age);
		this.rank = rank;
	}
	
	public void showArmy() {
		showPerson();
		System.out.printf("계급 : %s%n",rank);
		System.out.println("-----------");
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.printf("계급 : %s%n", rank);
		System.out.println("-----------");
	}
}
