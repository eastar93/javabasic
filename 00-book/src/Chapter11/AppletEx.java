package Chapter11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class AppletEx extends Applet implements ActionListener {
	TextField t;
	Button b;
	List list;
	
	public void init() {
		
		setLayout(new BorderLayout());
		
		String name = getParameter("name");
		
		Panel p = new Panel();
		list = new List(10);
		
		Label l = new Label("받을 사람 : ");
		t = new TextField(name, 20);
		b = new Button("보내기");
		
		p.add(l);
		p.add(t);
		p.add(b);
		
		add(p, BorderLayout.NORTH);
		add(list, BorderLayout.CENTER);
		
		t.addActionListener(this);
		b.addActionListener(this);
		
		list.add("init()호출");
	}
	
	public void start() {
		list.add("start()호출");
	}
	
	public void stop() {
		list.add("stop()호출");
	}
	
	public void paint(Graphics g) {
		list.add("paint()호출");
	}

	public void actionPerformed(ActionEvent e) {
		list.add(t.getText());
		t.setText("");
		
	}
	
	
}
