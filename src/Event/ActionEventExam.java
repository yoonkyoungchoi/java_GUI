package Event;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventExam extends JFrame implements ActionListener{
	
	private JButton btn1;
	
	public ActionEventExam() {
		super("�׼� �̺�Ʈ");
		JPanel p =new JPanel();
		btn1 = new JButton("�ݱ�");
		p.add(btn1);
		add(p);
		
		setSize(300, 200);
		setVisible(true);
		
		btn1.addActionListener(new MyActionListener());
	}

	public static void main(String[] args) {
		new ActionEventExam();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1) {
			System.exit(0);
		}
		//if(e.getSource() == btn2) {
			//����
		//}
	}
	
	class myActionListner implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("�ݱ�")){
				System.exit(0);
			}
		}
	}

}
