package constructor;

public class Dog {
	
	public String name;
	public int age;
	public String kind;
	public boolean ShelterPuppy;
	
	public Dog(String n, int a, String k, boolean S)
	{
		name = n;
		age = a;
		kind = k;
		ShelterPuppy = S;
		
		System.out.println("이름 :" + name + 
					       ",나이 :" + age + "살" +
					       ",견종 :" + kind + 
					       ",유기견 여부 :" + ShelterPuppy);
	}
	public void getInfo() {
		System.out.println("강아지 이름 :" + name);
		System.out.println("나이 :" + age);
		System.out.println("견종 :" +kind);
		System.out.println("유기여부 :" +ShelterPuppy);
	}

}
