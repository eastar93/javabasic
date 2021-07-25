package Chapter04;

import java.util.StringTokenizer;

class StringTokenEx2 {
	
	public static void main(String[] args) {
		
		System.out.println("split 테스트 ::::::::::::");
		String date = "2005/08//15/";
		String[] sp = date.split("/", 5);
		for(int i = 0; i < sp.length; i++) 
			System.out.println("sp[" + i + "] : " + sp[i]);

		System.out.println("StringTokenizer테스트 ::::::::::::");
		StringTokenizer st = new StringTokenizer(date, "/");
		int index = 0;
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
		System.out.println("st" + index + " : " + token);
		index++;
		}
	}
}
