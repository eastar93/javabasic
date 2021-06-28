package Casting;

public class Cat extends Animal {
	
	public Cat(String name, int age)
	{
		super(name, age);
	}
	
	public void meow()
	{
		System.out.println("고양이가 울다.");
	}
	
	public void sit()
	{
		System.out.println("고양이가 앉아 있습니다.");
	}
	
	
	
}
