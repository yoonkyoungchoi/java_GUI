import java.awt.*;
import javax.swing.*;

public class Test extends JFrame{
	
	public Test() {
		setTitle("�׽�Ʈ");
		Panel p = new Panel();
		
		Label id1 = new Label("ID");
		id1.setBackground(Color.blue);
		Label pwd1 = new Label("PWD");
		pwd1.setBackground(Color.blue);
		TextField tf1 = new TextField(15);
		TextField tf2 = new TextField(15);
		tf1.selectAll();
		tf2.setEchoChar('*');
		
		
		Label l1 = new Label("1. ����� ���ɺоߴ�? (������ ���� ����)");
		Label l2 = new Label("2. �󸶳� ���� ���忡 ���ʴϱ�?");
		Label l3 = new Label("3. �����ϴ� ������?");
		Label l4 = new Label("4. �ϰ���� ���� ���⼼��.");
		
		Checkbox ck1 = new Checkbox("news");
		Checkbox ck2 = new Checkbox("sports");
		Checkbox ck3 = new Checkbox("movies");
		Checkbox ck4 = new Checkbox("music");
		
		CheckboxGroup g = new CheckboxGroup();
		Checkbox g1 = new Checkbox("�Ѵ޿� �ѹ�",g, false);
		Checkbox g2 = new Checkbox("�����Ͽ� �ѹ�",g, false);
		Checkbox g3 = new Checkbox("���� �Ȱ���",g, true);
		
		List list1 = new List(4, false);
		list1.add("��");
		list1.add("����");
		list1.add("����");
		list1.add("�ܿ�");
		
		TextArea t1 = new TextArea("�Է�:", 8, 15);
		
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
