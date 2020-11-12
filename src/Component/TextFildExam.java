package Component;

import java.awt.*;

public class TextFildExam extends Frame{
	public TextFildExam() {
		super("텍스트 필드");
		Panel p = new Panel;
		TextField tf1 = new TextField("주민번호 앞자리");
		TextField tf2 = new TextField("주민번호 앞자리");
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
