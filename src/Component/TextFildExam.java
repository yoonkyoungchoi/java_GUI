package Component;

import java.awt.*;

public class TextFildExam extends Frame{
	public TextFildExam() {
		super("�ؽ�Ʈ �ʵ�");
		Panel p = new Panel;
		TextField tf1 = new TextField("�ֹι�ȣ ���ڸ�");
		TextField tf2 = new TextField("�ֹι�ȣ ���ڸ�");
		tf1.selectAll();
		tf2.getEchoChar();
		p.add(tf1);
		p.add(tf2);
		add(p);
		setSize(250,1450);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
