package Chapter04;

class ArrayEx1 {
	
	public static void main(String[] args) {
		
		char[] ch; // 배열 선언
		ch = new char[4]; // 배열 생성
		
		// 배열 초기화
		ch[0] = 'J';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
		
		// 배열 내용 출력
		for(int i = 0; i < ch.length; i++)
			System.out.println("ch[" + i + "] : " + ch[i]);
	}

}
