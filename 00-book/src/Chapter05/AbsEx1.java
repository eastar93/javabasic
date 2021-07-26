package Chapter05;

abstract class AbsEx1 {
	
	int a = 100; // 변수
	final String str = "abstract test";
	public String getStr() {
		return str;
	}
	
	// 추상 메서드는 몸체(body)가 없다.
	public abstract int getA();

}
