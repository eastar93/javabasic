package Chapter11;

import java.applet.Applet;
import java.awt.*;

public class FontMetricsEx extends Applet {
	
	Font f;
	FontMetrics fm;
	int x, y;
	String msg;
	Dimension size;
	
	public void init() {
		msg = "FontMetrics";
		
		f = new Font("impact", Font.BOLD, 30);
		
		fm = getFontMetrics(f);
		
		size = getSize();
		x = (size.width/2)-(fm.stringWidth(msg)/2);
		y = (size.height/2)-(fm.getDescent()/2);
	}
	
	public void paint(Graphics g) {
		g.setFont(f);
		g.drawString(msg, x, y);
	}
}
