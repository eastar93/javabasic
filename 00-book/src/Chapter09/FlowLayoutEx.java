package Chapter09;

import java.awt.*;

public class FlowLayoutEx {
	
	public static void main(String[] args) {
		
		Frame f = new Frame("FlowLayout 테스트");
		Panel p = new Panel();
		
		Button b1 = new Button("버튼 1");
		Button b2 = new Button("버튼 2");
		Button b3 = new Button("버튼 3");
		Button b4 = new Button("버튼 4");
		Button b5 = new Button("버튼 5");
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		
		f.add(p);
		
		f.setLocation(300, 300);
		f.setSize(200, 100);
		f.setVisible(true);
	}
}
