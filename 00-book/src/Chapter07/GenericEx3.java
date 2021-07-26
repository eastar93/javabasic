package Chapter07;

import static java.lang.System.out;

public class GenericEx3<T> {
	
	T v;
	public GenericEx3() {}
	public GenericEx3(T n) {
		v = n;
	}
	public void set(T n) {
		v = n;
	}
	public T get() {
		return v;
	}
	public static void main(String[] args) {
		GenericEx3<?> g3 = new GenericEx3<String>();
//		g3.set("String객체");
		String s = (String)g3.get();
		out.println("g2의 결과 : " + s);
	}
	

}
