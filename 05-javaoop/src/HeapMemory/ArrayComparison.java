package heapMemory;

import java.util.Arrays;

public class ArrayComparison {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = arr1;
		//arr1의 주소값을 arr2의 주소값에 넣어서 같은 곳을 가리킨다.
		//주소만 빼오는 복사를 얕은복사라고 한다
		//힙에 있는 값을 복사해오는 것을 깊은 복사라고 한다
		int[] arr3 = {1, 2, 3, 4, 5};
		//arr3은 arr1과 arr2와 달리 별도의 주소를 가리키고 있다.
		arr1[0] = 10;
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		
		//주소 값이 아닌 전체 배열 데이터를 보고 싶다면 Arrays.toString
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		
				
	}
}
