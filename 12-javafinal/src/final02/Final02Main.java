package final02;

public class Final02Main {
	
	public static void main(String[] args) {
		//일반 숫자를 이용한 출력요소
		System.out.printf("전사의 체력 : %d%n",50);
		System.out.println(50);
		System.out.printf("몬스터의 경험치 : %d%n",20);
		System.out.println(20);
		
		//자주 사용하게 될 수치는 아래와 같이 상수처리해서
		//코드에 대입을 해 줍니다.
		//이러면 변수명만으로도 어떤 의미를 가진 수치인지
		//바로 유추가 가능하기 때문에 코드 가독성이 높아집니다.
		final int WARRIOR_HP = 50;
		final int MONSTER_EXP = 20;
		//final상수의 상수명을 선언 할 때는 이름을 모두
		//대문자로 사용하고 띄어쓰는 부분은 _로 표기한다.
		
		System.out.println(WARRIOR_HP);
		System.out.println(MONSTER_EXP);
		
	}
}
