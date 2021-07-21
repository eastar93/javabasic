package method;

public class Method01 {
	
	public static void add(int a) { //add라는 영역이 생기고 a값에 500이라는 값을 같이 넘겨준다
		/*
		 * void는 결과물 없음을 의미함.
		 * add라는 이름을 main에서도 내부 영역에서 호출해야 실행될 코드.
		 * int a 자료를 호출시에 제공해야 내부 문장을 실행 할 수 있다.
		 */
		System.out.println(a + 1); //넘겨 받은 500이라는 값에 1을 더해서 출력은 하지만 main구역으로 반환하지는 않는다.
	}
	
	public static void main(String[] args) { //1.main이 우선적으로 실행되고
		/*
		 * method는 자주 사용할 코드를 특정한 이름으로 붙여둔것입니다.
		 * method는 내부에는 불완전한 코드가 들어올 수 있습니다.
		 * method는 이 불완전한 코드를 완성시킬 자료를 요청할 수 있습니다.
		 * method는 실행 결과물을 약속해야 사용 할 수 있습니다.
		 * 실행 결과물이 있다면 return문을 이용해 약속된 실행 결과물을 호출 위치로 보내줍니다.
		 * method는 main 외부에 작성합니다.
		 */
		
		add(500); //2.add(500)으로 호출하면
		
	}
}
