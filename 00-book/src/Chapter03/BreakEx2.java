package Chapter03;

public class BreakEx2 {
	
	public static void main(String[] args) {
		
		exit_For:
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 3) 
					break exit_For;
				System.out.println("i값 : " + i + ", j값 : " + j);
			}
		}
	}

}
