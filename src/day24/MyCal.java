package day24;
import java.awt.*;
import java.awt.event.*;


public class MyCal extends Frame implements ActionListener{
	
	Label lb_num1,lb_num2,lb_result;
	TextArea ta_num1,ta_num2;
	TextComponent ta_result;
	Button bt_add,bt_reset;
	
	public MyCal() {
		
		this.setLayout(new GridLayout(4,2,10,10));
		lb_num1 = new Label("first number");
		ta_num1 = new TextArea();
		lb_num2 = new Label("second number");
		ta_num2 = new TextArea();
		lb_result = new Label("result");
		ta_result = new TextArea();
		
		bt_add = new Button("add");
		bt_reset = new Button("reset");
		
		
		
		this.add(lb_num1);
		this.add(ta_num1);
		this.add(lb_num2);
		this.add(ta_num2);
		this.add(lb_result);
		this.add(ta_result);
		this.add(bt_add);
		this.add(bt_reset);
		
		bt_add.addActionListener(this);
		bt_reset.addActionListener(this);
	}
	

 
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		Object ob_num1 =ta_num1.getText();
		Object ob_num2 =ta_num2.getText();
		String str= (String) ob_num1; //Object->String
		int its = Integer.parseInt((String)ob_num2); //Object -> String -> Integer -> int
		int err_num = (Integer)ob_num1; // 에러. String은 Integer로 변환할때 ParseInt로 구문분석을 통해 변환해야함.
		int num = Integer.parseInt(ta_num1.getText());
		int sum = err_num+num;
		
		if(ob==bt_add) {
			ta_result.setText(""+sum);
	
		}else if (ob==bt_reset) {
			
		}
		
	}
	

	public static void main(String[] args) {
	
		MyCal mc = new MyCal();
		mc.setSize(300,300);
		mc.setVisible(true);
		
	}
	
}
