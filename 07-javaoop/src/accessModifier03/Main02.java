package accessModifier03;

public class Main02 {
	
	public static void main(String[] args) {
		//다른 패키지에서 상속받은 Child02를 확인해보겠습니다.
		Child02 child2 = new Child02();
		
		//1.public접근
		System.out.println(child2.a);
		//1-2.child내부의 e값 변경 및 접근
		child2.e = 100;
		System.out.println(child2.e);
		//2.protected접근
		//protected는 같은 패키지, 혹은 
		//다른 패키지라면 상속 관계일때 접근 가능
		//System.out.println(child2.b);
		child2.setB(-10); //child2의 b값을 -10으로 셋팅하였으나 child2쪽에서 값이 음수일경우 동작 안하게 걸어놔서
		child2.getB(); //child2의 b값을 음수로 넣어도 기존에 있는 값 2가 나온다
		child2.setB(200); //child2의 b값이 200으로 세팅 되어 child2쪽의 조건을 충족해서
		child2.getB(); //child2의 b값을 2에서 200으로 변경해서 200으로 출력된다.
		System.out.println(child2.getBInt());
		//3.defalut(패키지가 같으면 접근 가능)
		//System.out.println(child2.d);
	}

}

