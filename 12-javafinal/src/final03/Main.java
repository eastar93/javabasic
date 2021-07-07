package final03;

public class Main {
	
	public static void main(String[] args) {
		//final 변수를 사용하기 위한 Country 객체 생성 불필요
		//일반적으로 상수를 쓰는 경우는
		//한 군데만 수정해도 전체 프로그램의 수정내용이
		//반영되게 만들고 싶을때 사용한다.
		System.out.println(Country.KOREA);
		System.out.println(Country.CHINA);
		System.out.println(Country.STATES);
		System.out.println(Country.CANADA);
		
		//Country.KOREA = 1005;
		
		System.out.printf("한국 넓이는  : %d%n",Country.KOREA);
		System.out.printf("한국 넓이는  : %d%n",Country.KOREA);
		System.out.printf("한국 넓이는  : %d%n",Country.KOREA);
		System.out.printf("한국 넓이는  : %d%n",Country.KOREA);
		System.out.printf("한국 넓이는  : %d%n",Country.KOREA);
		System.out.printf("한국 넓이는  : %d%n",Country.KOREA);
		System.out.printf("한국 넓이는  : %d%n",Country.KOREA);
		
	}
}
