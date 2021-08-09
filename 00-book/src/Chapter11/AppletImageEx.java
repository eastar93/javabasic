package Chapter11;

import java.awt.*;
import java.applet.Applet;

public class AppletImageEx extends Applet {
	
	Image image;
	
	public void init() {
		image = getImage(getDocumentBase(), 
				"file:///E:/신동규/eastar93/Eclipse%20Java/Workspace/javabasic/00-book/src/Chapter11/pooh.jpg");
	}
	
	public void paint(Graphics g) {
		g.drawImage(image, 0, 0, this);
	}

}
