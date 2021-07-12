package map01;

import java.util.HashMap;
import java.util.Map;

public class HashMap01 {
	
	public static void main(String[] args) {
		//Map자료형의 대표 자료형은 HashMap입니다.
		//제네릭 내부에는 <Key자료형, Value자료형>으로 작성합니다.
		Map<String, String> map = new HashMap<>();
		map.put("채종훈", "자바");
		map.put("김영수", "JSP");
		map.put("코로나", "바이러스");
		System.out.println(map);
		
		//자료조회시 .get(키값)으로 조회합니다.
		//map은 키로 벨류를 조회하는건 가능하지만 역은ㅇ 불가능하다.
		//없는 키값으로 조회하면 null이 나온다.
		//인덱스 번호도 존재하지 않습니다.
		System.out.println(map.get("김영수"));
		System.out.println(map.get(0));
		
		//기본적으로 map자료형은 조회도 key중심으로 이뤄집니다.
		//.containsKey()는 해당 키 값이 자료내에 존재하는지 확인합니다.
		System.out.println(map.containsKey("채종훈"));
		System.out.println(map.containsKey("이종훈"));
		
		//remove는 key를 이용해서 key=value 전체를 삭제합니다.
		map.remove("코로나");
		System.out.println(map);
		
		//.size()는 크기를 알려줍니다. 정수로 key=value쌍이
		//저장되어있는지 확인 할 수 있습니다.
		System.out.println(map.size());
	}

}
