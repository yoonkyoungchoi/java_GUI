package Layout;
import java.awt.*;

import javax.swing.*;

public class FlowLayoutEx extends JFrame {
	FlowLayoutEx(){
		setTitle("FLowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane(); //����Ʈ�� �˾Ƴ���
		
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("sub"));
		contentPane.add(new JButton("mul"));
		contentPane.add(new JButton("div"));
		contentPane.add(new JButton("Calculate"));
		
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutEx();
	}

}
