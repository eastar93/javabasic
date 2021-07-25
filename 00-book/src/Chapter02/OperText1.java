package Chapter02;

class OperText1 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println(++a);
		//a = 11 b = 20
		System.out.println(++a + b++);
		//a = 12 b = 20 (32)
		System.out.println((++a%3) + (a*++b));
		//a = 13 b = 22 1+286 = 287
	}

}
