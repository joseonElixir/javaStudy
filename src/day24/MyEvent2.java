package day24;

import java.awt.*;
import java.awt.event.*;

public class MyEvent2 extends Frame implements ActionListener {
	
	Label lb_first, lb_second, lb_result;
	TextField tf_first, tf_second, tf_result;
	Button bt_cal,bt_reset;
	
	public MyEvent2() {
		this.setLayout(new GridLayout(4,2,10,10));
		
		lb_first = new Label("ù��° ��");
		lb_second = new Label("�ι�° ��");
		lb_result = new Label("��� ");
		
		tf_first = new TextField();
		tf_second = new TextField();
		tf_result = new TextField();
		
		bt_cal = new Button("����ϱ�");
		bt_reset = new Button("�ʱ�ȭ");
		
		this.add(lb_first);	this.add(tf_first);
		this.add(lb_second); this.add(tf_second);
		this.add(lb_result); this.add(tf_result);
		this.add(bt_cal); this.add(bt_reset);
		
		tf_result.setEditable(false); //��Ȱ��ȭ
		
		bt_cal.addActionListener(this);
		bt_reset.addActionListener(this);
	
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//����: 1 ��û�ޱ� 2 �䱸���׺м� 3��ɱ���
		
		//1.��û�ޱ�
		Object ob = e.getSource();
		
		System.out.println("source:"+ob);
		if(ob==bt_cal) {
			//parse�ϱ� ���� ��ȿ���˻縦 �ؾ���.
			try {
				String num1_s = tf_first.getText();
				int num1 = Integer.parseInt(num1_s); //br.readline();�� ����.
				//���ڿ��� �޾Ƽ� ParseInt�� Parsing �۾��� �Ͽ� int������ ����.
				int num2 = Integer.parseInt(tf_second.getText());
				int sum= num1+num2;
				tf_result.setText(""+sum);
			}catch(Exception ex) {
				tf_result.setText("error");
			}
			
		}else if (ob==bt_reset) {
			tf_first.setText("");
			tf_second.setText("");
			tf_result.setText("");
		}

	}

	public static void main(String[] args) {
		
		MyEvent2 me = new MyEvent2();
		me.setSize(300,300);
		me.setVisible(true);
		
	}

}
