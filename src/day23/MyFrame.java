package day23;

import java.awt.*;

public class MyFrame {

	public static void main(String[] args) {
	
		Frame f = new Frame("���� ù ������");
		f.setSize(300, 300); //������ ������ ����
		///
		
//		FlowLayout fl =new FlowLayout(FlowLayout.LEFT,30,30);
//		FlowLayout fl2 =new FlowLayout(FlowLayout.RIGHT,30,30);
//		f.setLayout(fl);
		
		BorderLayout bl = new BorderLayout(20,20);
		f.setLayout(bl);
		
		Button bt1 = new Button("bt1");
		Button bt2 = new Button("bt2");
		Button bt3 = new Button("bt3");
		Button bt4 = new Button("bt4");
		Button bt5 = new Button("bt5");
		
		f.add(bt1,BorderLayout.NORTH);
		f.add(bt2,BorderLayout.WEST);
		f.add(bt3,BorderLayout.CENTER);
		f.add(bt4,BorderLayout.SOUTH);
		f.add(bt5,"East");
		
		
		
		
		///
		Toolkit temp = Toolkit.getDefaultToolkit();
		Dimension dim = temp.getScreenSize();
		//��ũ���� �����Ǵ� ��ġ�� ���� ��ǥ���� ����ϱ� ���� ������� ��ũ�� ������ �ҷ�����.
		//��ó�� ���� ������ ���� ����. �ٸ� �������� ������ �����ϹǷ� �޸� ���� �߻���Ŵ.
		Dimension dim2 = Toolkit.getDefaultToolkit().getScreenSize();
		//�̷��� �� ��. 
		
		
		int x = (int)dim.getWidth()/2-150;
		int y = (int)dim.getHeight()/2-150;
		System.out.println("x="+x+", y="+y);
		f.setLocation(x, y);
		f.setVisible(true);
		
		
		
	}
	
	
}
