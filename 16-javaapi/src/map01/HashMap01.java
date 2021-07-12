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
		System.out.println(map.get("자바"));
		System.out.println(map.get(0));
	}

}
