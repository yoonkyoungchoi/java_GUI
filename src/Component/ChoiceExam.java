package Component;

import java.awt.*;

public class ChoiceExam extends Frame{
	public ChoiceExam() {
		Panel p = new Panel();
		Choice ch = new Choice();
		
//		ch.addItem("봄");
//		ch.addItem("여름");
//		ch.addItem("가을");
//		ch.addItem("겨울");
		
		String s[] = {"봄", "여름", "가을", "겨울"};
		
		for (int i = 0; i< s.length; i++) {
			ch.addItem(s[i]);
		}
		
		p.add(ch);
		add(p);
		setSize(300,150);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
