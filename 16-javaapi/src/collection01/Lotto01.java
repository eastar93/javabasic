package collection01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto01 {
	
	public static void main(String[] args) {
		//로또복권 추첨기를 만들어보겠습니다.
		//로또복권 추첨기는 1이상 45이하의 범위에서 겹치는 숫자 없이
		//6개의 숫자를 뽑습니다.
		//순서를 정렬해서 출력하도록 만들어주세요.
		//ArrayList의 정렬은 .sort()대신
		//Collections.sort(리스트); 를 이용해 정렬합니다.
		
		List<Integer> lotto = new ArrayList<>();
		Random num = new Random();
		int n = 0;
		while(n<6)
		{
			int lnum = num.nextInt(45);
			n++;
			lotto.add(lnum+1);
		}
		int bnum = num.nextInt(45);
		
		Collections.sort(lotto);
		
		System.out.print("추첨 된 번호 : ");
		System.out.println(lotto);
		System.out.print("2등 당첨 번호 : ");
		System.out.println(bnum+1);
	}
}
