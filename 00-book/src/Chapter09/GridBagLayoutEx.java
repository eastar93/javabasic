package Chapter09;

import java.awt.*;

public class GridBagLayoutEx extends Frame {
	 
	GridBagLayout gb;
	GridBagConstraints gbc;
	
	public GridBagLayoutEx() {
		super("GridGabLayout 테스트");
		gb = new GridBagLayout();
		setLayout(gb);
		
		gbc = new GridBagConstraints();
		
		gbc.fill = GridBagConstraints.BOTH;
		
		addToFrame(new Button("컴포넌트1"), 0, 0, 2, 1, 2.0, 1.0);
		addToFrame(new Button("컴포넌트2"), 2, 0, 1, 1, 0.5, 1.0);
		addToFrame(new Button("컴포넌트3"), 0, 1, 3, 1, 3.0, 1.0);
		addToFrame(new Button("컴포넌트4"), 0, 2, 1, 2, 0.0, 1.0);
		addToFrame(new Button("컴포넌트5"), 1, 2, 2, 1, 0.0, 1.0);
		addToFrame(new Button("컴포넌트6"), 1, 3, 2, 1, 0.0, 1.0);
		
		setBounds(200, 200, 200, 200);
		setVisible(true);
	}
	
	public void addToFrame(Component com, int x, int y, int width,
				int height, double weightx, double weighty) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = width;
		gbc.gridheight = height;
		gbc.weightx = weightx;
		gbc.weighty = weighty;
		
		add(com, gbc);
	}
	
	public static void main(String[] args) {
		
		new GridBagLayoutEx();
	}
}
