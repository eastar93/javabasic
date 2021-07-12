package map01;

import java.util.HashMap;
import java.util.Map;

public class HashMap02 {
	
	public static void main(String[] args) {
		//식당 메뉴판을 만들어보세요.
		//key는 음식이름, value는 가격(정수)로 저장해주세요.
		//메뉴는 5개 이상 집어넣어주세요.
		//메뉴를 개 조회해서 화면에 출력해주세요.
		
		Map<String, Integer> menu = new HashMap<>();
		menu.put("김밥", 3500);
		menu.put("라면", 5000);
		menu.put("우동", 6500);
		menu.put("돈까스", 7500);
		menu.put("쫄면", 5500);
		System.out.println(menu);
		
		System.out.println(menu.get("김밥"));
		System.out.println(menu.get("라면"));
		System.out.println(menu.get("우동"));
		
	}

}
