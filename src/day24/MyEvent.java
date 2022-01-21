package day24;
import java.awt.*; //AWT ��Ű�� ���� ����(��Ű��)�� ������ ����.
import java.awt.event.*; // event ��Ű��.

public class MyEvent extends Frame implements ActionListener{
	Button bt_red,bt_blue,bt_green;
	
	public MyEvent() {
		this.setLayout(new FlowLayout());
		//this.setBackground(Color.CYAN);
		
		bt_red = new Button("red");
		bt_blue = new Button("blue");
		bt_green = new Button("green");
		this.add(bt_red);
		this.add(bt_blue);
		this.add(bt_green);
		
		
		bt_red.addActionListener(this); //actionPerformed�� this�� ������ �ִ�.
		bt_blue.addActionListener(this);
		bt_green.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//�Ǵ��� ���� ��û�ޱ�.
		//String temp =e.getActionCommand();
		//System.out.println(temp);
		
		Object ob = e.getSource(); //Object Ŭ���� ob�� ActionEvent e�� �ּҰ��� ����.
		//�� ActionEvent�� �߻��� ��ü�� �ּ�.
		//�䱸���׿� ���� �м�.
		if(ob==bt_red) { //�̺�Ʈ�� �߻��� �ּҿ� ���� �ּҵ��� ���ϱ�
			this.setBackground(Color.red);//����� ���� ��������.
			FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
			this.setLayout(fl);
			
		}else if(ob==bt_blue) {
			this.setBackground(Color.blue);
			FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
			this.setLayout(fl);
		}else if(ob==bt_green) {
			this.setBackground(Color.green);
			FlowLayout fl = new FlowLayout(FlowLayout.RIGHT);
			this.setLayout(fl);
		}
		this.validate();// ������ ó��. ��, ������ ��Ȯ��.������ġ�� �ٲܶ� ��������� �Ѵ�.
		
//		if(e.getActionCommand().equals("red")) {
//			//��ɱ��� ����
//			this.setBackground(Color.red);
//			
//		}else if(e.getActionCommand().equals("blue")) {
//			//��ɱ��� ����
//			this.setBackground(Color.blue);
//		}if(e.getActionCommand().equals("green")) {
//			//��ɱ��� ����
//			this.setBackground(Color.green);
//		}
		
	}
	
	public static void main(String[] args) {
		
		MyEvent me = new MyEvent();
		
		me.setSize(300,300);
		me.setVisible(true);
		
	}

	
	
}
