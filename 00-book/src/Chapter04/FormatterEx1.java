package Chapter04;

import java.util.*;

class FormatterEx1 {
	
	public static void main(String[] args) {
		
		Formatter f = new Formatter();
		f.format("%1$b, %3$h, %2$5s", false, 500, 'A');
		System.out.println(f.toString());
	} 

}
