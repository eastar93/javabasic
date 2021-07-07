package enhancedFor;

public class EnhancedFor01 {
	
	public static void main(String[] args) {
		
		/*
		 * 향상된 for문은 반복문 진행시 타겟으로 배열을 넣습니다.
		 * 이 경우 반복실행 횟수는 배열의 내부요소 갯수만큼 입니다.
		 */
		
		int[] arr1 = {100, 211, 339, 475, 591};
		
		for(int a: arr1) //int a: arr1은 arr1에서 값을 하나씩 취해서 a값에 넣어서 아래 출력문에서 출력하고 더이상 값이 없으면 for문을 빠져나온다
		{
			System.out.println(a);
		}
		System.out.println("----------");
		for(int i=0; i<arr1.length; i++) //i가 0부터 arr1의 배열 길이만큼 증가해가면서 출력해준다.
		{
			System.out.println(arr1[i]); //arr1의 i번째(0부터 arr1의 배열길이 수)까지 출력한다.
		}
	}
}
