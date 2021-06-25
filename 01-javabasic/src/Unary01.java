
public class Unary01 {

	public static void main(String[] args) {
		/*
		 * 단항 연산자 ++,--
		 * ++, --는 숫자의 왼쪽  혹은 오른쪽에 붙을 수 있습니다.
		 * 왼쪽에 붙는 경우 전위 수식으로 표현
		 * 오른쪽에 붙는 경우 후위 수식으로 표현
		 * 어느 방향에 붙는지에 따라 실행 순서가 바뀝니다.
		 * ++는 대상 변수의 숫자를 1증가, --는 숫자를 1감소
		 */
		
		int a = 1;
		System.out.println(++a);
		// 전위 수식, 실행 전 1부터 증가시키고 a를 출력
		// 1. a = a + 1;
		// 2. System.outprintln(a); a=2
		System.out.println(a); //a는 증가된 값이 유지됨 a=2
		System.out.println(a++);
		// 후위 수식, a(2)출력 후 1증가
		// 1. System.out.println(a); a=2
		// 2. a = a + 1; a=3
		System.out.println(a); //a는 증가된 값이 유지됨		
	}
}
