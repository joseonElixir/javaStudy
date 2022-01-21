package day24;

import java.awt.*;
import java.awt.event.*;

public class MyEvent2 extends Frame implements ActionListener {
	
	Label lb_first, lb_second, lb_result;
	TextField tf_first, tf_second, tf_result;
	Button bt_cal,bt_reset;
	
	public MyEvent2() {
		this.setLayout(new GridLayout(4,2,10,10));
		
		lb_first = new Label("첫번째 수");
		lb_second = new Label("두번째 수");
		lb_result = new Label("결과 ");
		
		tf_first = new TextField();
		tf_second = new TextField();
		tf_result = new TextField();
		
		bt_cal = new Button("계산하기");
		bt_reset = new Button("초기화");
		
		this.add(lb_first);	this.add(tf_first);
		this.add(lb_second); this.add(tf_second);
		this.add(lb_result); this.add(tf_result);
		this.add(bt_cal); this.add(bt_reset);
		
		tf_result.setEditable(false); //비활성화
		
		bt_cal.addActionListener(this);
		bt_reset.addActionListener(this);
	
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//절차: 1 요청받기 2 요구사항분석 3기능구현
		
		//1.요청받기
		Object ob = e.getSource();
		
		System.out.println("source:"+ob);
		if(ob==bt_cal) {
			//parse하기 전에 유효성검사를 해야함.
			try {
				String num1_s = tf_first.getText();
				int num1 = Integer.parseInt(num1_s); //br.readline();과 같다.
				//문자열을 받아서 ParseInt로 Parsing 작업을 하여 int값으로 가공.
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
