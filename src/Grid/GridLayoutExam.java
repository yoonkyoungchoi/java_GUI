package Grid;
import java.awt.*;
import javax.swing.*;

public class GridLayoutExam extends JFrame {
	
	public GridLayoutExam() {
		setTitle("GirdLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(4 ,2);
		grid.setVgap(10);
		
		Container c = getContentPane();
		c.setLayout(grid);
		
		c.add(new JLabel("�̸�"));
		c.add(new JTextField(""));
		c.add(new JLabel("�й�"));
		c.add(new JTextField(""));
		c.add(new JLabel("���� ����"));
		c.add(new JTextField(""));
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridLayoutExam();

	}

}
