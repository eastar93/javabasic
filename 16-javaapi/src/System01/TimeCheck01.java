package System01;

public class TimeCheck01 {
	
	public static void main(String[] args) {
		//currentTimeMills의 자료는 long형에 저장합니다.
		//시작 지점
		long start = System.currentTimeMillis();
		System.out.println(start);
		long all = 0;
		
		for(int i = 0; i < 2000000000; i++) {
			all += 1;
		}
		
		//끝나는 시점
		long end = System.currentTimeMillis();
		System.out.println(end);
		//소요시간 측정
		System.out.println(end-start);
	}

}
