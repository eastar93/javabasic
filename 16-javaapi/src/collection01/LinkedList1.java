package collection01;

import java.util.ArrayList;
import java.util.List;

public class LinkedList1 {
	
	public static void main(String[] args) {
		//LinkedList는 자료의 변경이 빈번할 때 사용하면 성능 향상이 있습니다.
		//일반적인 상황에서는 ArrayList을 더 많이 쓰고,
		//양 리스트 간 사용법에는 큰 차이가 없습니다.
		List<String> list1 = new ArrayList<>();
		list1.add("자바");
		list1.add("jsp");
		list1.add("스프링");
		list1.add("스프링부트");
		System.out.println(list1);
		
		//.remove()는 두 유형이 있습니다.
		//.remove(번호)를 넣을 경우 주어진 번호에 있는 자료가 삭제되고
		//.remove("자료")를 입력하면 번호와 상관없이 자료가 삭제됩니다.
		list1.remove(0); //0번 인덱스 "자바" 삭제
		System.out.println(list1);
		list1.remove("스프링"); //"스프링" 자료 삭제
		System.out.println(list1);
		
		//리스트 전체적으로 비우고 싶을때는 .clear()를 사용합니다.
		list1.clear();
		System.out.println(list1);
		
		//4개 자료 아무거나 추가하기
		list1.add("망고");
		list1.add("파파야");
		list1.add("파인애플");
		list1.add("수박");
		System.out.println(list1);
		}

}
