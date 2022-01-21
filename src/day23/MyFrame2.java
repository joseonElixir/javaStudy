package day23;

import java.awt.*;

public class MyFrame2 extends Frame {
	
	public MyFrame2(){
		//GridLayout (int rows, int cols, int hgap, int vgap)
		//(��, ��, ��������, ���򰣰�)
		GridLayout gl = new GridLayout(2,3,10,10);
		this.setLayout(gl);//�����ӿ� ���̾ƿ��� ����
		
		Button bt1= new Button("bt1");//��ư ����
		Button bt2= new Button("bt2");
		Button bt3= new Button("bt3");
		Button bt4= new Button("bt4");
		Button bt5= new Button("bt5");
		this.add(bt1);//add�� ���� ��ư ����. �̶� ���̾ƿ��� ��Ģ�� ���缭 ���Ե�.
		this.add(bt2);
		this.add(bt3);
		this.add(bt4);
		this.add(bt5);
		
		Panel p = new Panel();
		p.setBackground(Color.CYAN);
		this.add(p); //add�� ���� �г� ����. �׸��� ������ �����ν� �����ϱ� �����ϰ� ����.
		
		Button bt6 = new Button("bt6");
		Button bt7 = new Button("bt7");
		
		BorderLayout bl = new  BorderLayout(20,20);
		p.setLayout(bl);//�гο� ���̾ƿ� ��Ģ ����.
		p.add(bt6,BorderLayout.NORTH); //add�� �гο� ��ư�� ����, BorderLayout�� �߾��� ������ 5������ ��Ģ�� ������ ����.
		p.add(bt7,"South");
		
	}
	
	@Override
	public Insets getInsets() { //��輱�� ������Ʈ�� ������ ���� ���� ����.
		Insets i = new Insets(45, 20, 20, 20); 
		return i;

	}

	public static void main(String[] args) {
		
		MyFrame2 mf2 = new MyFrame2();
		mf2.setSize(300, 300);
		mf2.setVisible(true);
	}
	
}
