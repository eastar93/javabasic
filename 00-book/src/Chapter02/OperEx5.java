package Chapter02;

public class OperEx5 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		boolean c = ((a+=12) > b) && (a==(b+=2));
		System.out.println("c="+c);
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		a = 10;
		b = 20;
		
		boolean d = ((a+=12)>b) || (a==(b+=2));
		System.out.println("d="+d);
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
	}

}
