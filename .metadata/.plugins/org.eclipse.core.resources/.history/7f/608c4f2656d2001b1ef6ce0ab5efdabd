package Garbage;

public class Main {
	
	public static void main(String[] args) {
		
		Item i1 = new Item(1);
		Item i2 = new Item(2);
		i2 = null;
		Item i3 = new Item(3);
		System.gc();
		//값이 쓰레기인것을 회수하는 명령어.
		Item i4 = new Item(4);
		i4 = null; //i4를 생성하고 힙에 i4에 해당하는 값을 만들었으나 null을 대입해서 연결은 끊어지고 아직은 힙에 4번에 해당하는 값은 살아있다.
		Item i5 = new Item(5);
		System.gc(); //i1~i6번까지 연결 확인을 해서 i4가 끊어진것을 확인하고 힙에서 i4에 해당하는 값을 삭제한다.
		Item i6 = new Item(6);
		
		//스택에 있는 Main의 값이 힙과 연결되어 있으면 쓸모있는 데이터다.
		
	}

}
