package Component;

import java.awt.*;

public class ButtonExam extends Frame{
	public ButtonExam() {
		Panel p = new Panel();
		Button b1 = new Button();
		Button b2 = new Button("��ư2");
		b1.setLabel("��ư1");
		
		p.add(b1);
		p.add(b1);
		add(p);
		setSize(450,150);
		setVisible(true);
		setLocation(200,200);
	}

	public static void main(String[] args) {
		new ButtonExam();

	}

}
