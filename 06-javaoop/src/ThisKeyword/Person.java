package thisKeyword;

public class Person {
	//사람의 정보를 여기에 기입합니다.
	public String name;
	public int age;
	public int money;
	public String major;
	
	//생성자를 활용합니다.
	public Person(String name, int age, int money, String major)
	{
		//main에서 생성해준 값을 힙의 해당 값에 넣어준다.
		this.name = name;
		this.age = age;
		this.money = money;
		this.major = major;
	}
	
	//getInfo()를 이용해 조회합니다.
	public void getInfo()
	{
		System.out.printf("이름 : %s%n",name);
		System.out.printf("나이 : %d%n",age);
		System.out.printf("소지금액 : %d%n",money);
		System.out.printf("전공 : %s%n",major);
		System.out.println("------------------");
	}

}
