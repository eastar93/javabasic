package arrays01;

import java.util.Arrays;

public class Arrays01 {
	
	public static void main(String[] args) {
		//이진 탐색은 데이터가 오름차순으로 정렬되어 있으며
		//배열요소 내부에 중복되는 값이 없어야 최상의 성능을 보입니다.
		//대신 조건을 모두 만족하는 경우 조회 속도가 가장 빠릅니다.
		
		int[] arr1 = {5, 7, 6, 1, 3, 9, 0, 12};
		
		//Arrays.binarySearch(배열명, 찾는값);
		int a = Arrays.binarySearch(arr1, 0);
		System.out.println(a);
		
		//정렬이 된 상태의 배열을 탐색하는 경우
		int[] arr2 = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		
		int b = Arrays.binarySearch(arr2, 14);
		System.out.println(b);
		
	}
}
