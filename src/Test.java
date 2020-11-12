import java.awt.*;
import javax.swing.*;

public class Test extends JFrame{
	
	public Test() {
		setTitle("테스트");
		Panel p = new Panel();
		
		Label id1 = new Label("ID");
		id1.setBackground(Color.blue);
		Label pwd1 = new Label("PWD");
		pwd1.setBackground(Color.blue);
		TextField tf1 = new TextField(15);
		TextField tf2 = new TextField(15);
		tf1.selectAll();
		tf2.setEchoChar('*');
		
		
		Label l1 = new Label("1. 당신의 관심분야는? (여러개 선택 가능)");
		Label l2 = new Label("2. 얼마나 자주 극장에 가십니까?");
		Label l3 = new Label("3. 좋아하는 계절은?");
		Label l4 = new Label("4. 하고싶은 말을 남기세요.");
		
		Checkbox ck1 = new Checkbox("news");
		Checkbox ck2 = new Checkbox("sports");
		Checkbox ck3 = new Checkbox("movies");
		Checkbox ck4 = new Checkbox("music");
		
		CheckboxGroup g = new CheckboxGroup();
		Checkbox g1 = new Checkbox("한달에 한번",g, false);
		Checkbox g2 = new Checkbox("일주일에 한번",g, false);
		Checkbox g3 = new Checkbox("거의 안간다",g, true);
		
		List list1 = new List(4, false);
		list1.add("봄");
		list1.add("여름");
		list1.add("가을");
		list1.add("겨울");
		
		TextArea t1 = new TextArea("입력:", 8, 15);
		
		p.add(id1);
		p.add(tf1);
		p.add(pwd1);
		p.add(tf2);
		p.add(l1);
		p.add(ck1);
		p.add(ck2);
		p.add(ck3);
		p.add(ck4);
		p.add(l2);
		p.add(g1);
		p.add(g2);
		p.add(g3);
		p.add(l3);
		p.add(list1);
		p.add(l4);
		p.add(t1);
		add(p);
		
		setSize(200, 600);
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		new Test();

	}

}
