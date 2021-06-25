package Polymorphism;

public class Official extends Person {
	
	private String job;
	
	public Official(String name, int age, String job) {
		
		super(name, age);
		this.job = job;
	}
	
	public void showOfficial() {
		showPerson();
		System.out.printf("직업 : %s%n",job);
		System.out.println("-----------");
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.printf("직업 : %s%n", job);
		System.out.println("-----------");
	}
	

}
