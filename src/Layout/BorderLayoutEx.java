package Layout;
import java.awt.*;
import javax.swing.*;
public class BorderLayoutEx extends JFrame {
	BorderLayoutEx(){
		setTitle("BorderLayoutEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane(); //ÄÁÅÙÆ®ÆÒ ¾Ë¾Æ³»±â
		
		contentPane.setLayout(new BorderLayoutEx());
		contentPane.add(new JButton("Calculate"),BorderLayout.CENTER);
		contentPane.add(new JButton("add"),BorderLayout.NORTH);
		contentPane.add(new JButton("sub"),BorderLayout.SOUTH);
		contentPane.add(new JButton("mul"),BorderLayout.EAST);
		contentPane.add(new JButton("div"),BorderLayout.WEST);
		setSize(300,200);
		setVisible(true);
		
	}

	public static void main(String[] args) {

		new BorderLayoutEx();
		
	}

}
