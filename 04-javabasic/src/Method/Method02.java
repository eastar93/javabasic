package method;

public class Method02 {

	public static int add2(int a) { //3.int 형의 add2가 생성되고 int a값에 보낸 10을 받는다
		return a + 1; //a값을 1더해서 호출한 add2자리에 반환한다.
	}
	
	public static void main(String[] args) { //1.main구역을 생성
		
		/*
		 * 반환 자료가 void가 아닌 경우는 호출 위치에 
		 * return문 오른쪽 자료를 그대로 갖다 놓습니다.
		 * 자료를 반환하는 것이 꼭 console창에 표시됨을 의미하지는 않습니다.
		 */
		int b = add2(10); //2.add라는 구역을 호출하고 10이라는 값을 같이 보낸다. //4.위에서 반환한 11값을 int b가 다시 받는다.
		System.out.println(b); //5.b값을 출력한다.
	}
}
