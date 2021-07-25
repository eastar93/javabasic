package Chapter04;

public class MethodEx {

	int var1, var2; // 멤버 변수들
	
	public int sum(int a , int b) { // 메서드(멤버 함수)
		return a + b;
	}
	
	public static void main(String[] args) {
		
		MethodEx me = new MethodEx();
		int res = me.sum(1000, -10);
		System.out.println("res = " + res);
	}
}
