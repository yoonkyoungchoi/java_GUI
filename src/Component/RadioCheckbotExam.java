package Component;

import java.awt.*;

public class RadioCheckbotExam extends Frame {
	public RadioCheckbotExam() {
		Panel p = new Panel();
		CheckboxGroup g = new CheckboxGroup();
		Checkbox ra1 = new Checkbox("����", g, false);
		Checkbox ra2 = new Checkbox("����", g, true);
		
		p.add(ra1);
		p.add(ra2);
		add(p);
		setSize(450,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioCheckbotExam();
	}

}
