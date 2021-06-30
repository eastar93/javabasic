package Chapter02;

public class OperTest2 {
	
	public static void main(String[] args) {
		
		int a, b;
		a = b = 10;
		
		boolean c = ++a > b++ || a++ >= ++b;
		//c == 11>10 || 11> = 11;
		System.out.println(a+","+b);
		//11,11
		System.out.println("변수 c의 값 :"+c);
		//변수 c의 값 : true
	}

}
