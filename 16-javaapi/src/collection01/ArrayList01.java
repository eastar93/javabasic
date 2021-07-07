package collection01;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
	
	public static void main(String[] args) {
		//List는 생성자료형으로 ArrayList와 LinkedList를 받을 수 있고
		//기본적으로는 ArrayList를 쓰게 됩니다.
		//java.utill의 List나 ArrayList를 사용 할 수 있습니다.
		
		//정수 자료를 받을 수 있는 리스트 생성
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		System.out.println(list1);
		list1.add(10);
		System.out.println(list1);
		
		//1번 인덱스 이후로 다 한 칸씩 뒤로 밀고 빈 공간에 자료 저장
		list1.add(1, 100);
		System.out.println(list1);
		list1.add(1, 99);
		System.out.println(list1);
		
	}
}
