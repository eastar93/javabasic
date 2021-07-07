package Quiz;

public class Q1 {	
	
	public static void main(String[] args) {
		/*
		 * 다음 로직대로 전위, 후위수식을 이용해 코드를
		 * 작성해주시고, 전위,후위수식 코드는 
		 * Unary01.java에서 그랬듯
		 * 두단계로 주석으로 풀어서 설명도 하세요.
		 */ 
		
		int a = 15;
		System.out.println(a--);
		//1.System.out.println(a); a = 15
		//2.a = a - 1; a = 14
		System.out.println(a); 
		System.out.println(--a); 
		//1.a = a - 1; a = 13
		//2.System.out.println(a); a = 13
		System.out.println(a); 
		
	}
}
