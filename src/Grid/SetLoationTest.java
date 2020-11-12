package Grid;

import javax.swing.*;
public class SetLoationTest extends JFrame{
	public SetLoationTest() {
		setTitle("setLocationTest");
		JPanel p = new JPanel();
		
		p.setLayout(null);
		
		JButton click = new JButton("Click");
		click.setSize(100, 40);
		click.setLocation(150 ,50);
		p.add(click);
		
		add(p);
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
