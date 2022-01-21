package day23;
import java.awt.*;


public class MyFrame4 extends Frame{

	
	public MyFrame4() {
		
		BorderLayout bl = new BorderLayout(10, 10);
		this.setLayout(bl);
		Panel p1 = new Panel();
		//p1.setBackground(Color.yellow);
		BorderLayout bl1_1 = new BorderLayout(10,10);
		p1.setLayout(bl1_1);
		
		Panel p1_1 = new Panel();
		p1.add(p1_1,BorderLayout.CENTER);
		Label l1_1 = new Label("내가 만들었어",Label.CENTER);
		
		p1.add(l1_1,BorderLayout.SOUTH);
		GridLayout gl2 = new GridLayout(1,2,0,0);
		p1_1.setLayout(gl2);
		
		Panel pp1= new Panel();
		BorderLayout bl2 = new BorderLayout(5,5);
		pp1.setLayout(bl2);
		Label l1 = new Label("보내는 이");
		Label l2 = new Label("받는 이");
		pp1.add(l1,BorderLayout.NORTH);
		pp1.add(l2,BorderLayout.SOUTH);
		
		Panel pp2= new Panel();
		BorderLayout bl3 = new BorderLayout(5,5);
		pp2.setLayout(bl3);
		TextField tf = new TextField();
		TextField tf2 = new TextField();
		
		pp2.add(tf,BorderLayout.NORTH);
		pp2.add(tf2,BorderLayout.SOUTH);
		
		p1_1.add(pp1);
		p1_1.add(pp2);
		
		Panel p2 = new Panel();
		BorderLayout bl2_1 = new BorderLayout(10,10);
		p2.setLayout(bl2_1);
		Panel p2_1 = new Panel();
		FlowLayout fl = new FlowLayout();
		p2_1.setLayout(fl);
		p2.add(p2_1,BorderLayout.SOUTH);
		Button bt1 = new Button("보내기");
		Button bt2 = new Button("취소");
		p2_1.add(bt1);
		p2_1.add(bt2);
		Label l2_1 = new Label("메시지");
		p2.add(l2_1,BorderLayout.WEST);
		TextArea ta= new TextArea();
		p2.add(ta,BorderLayout.CENTER);
		
		
		
		this.add(p1,BorderLayout.NORTH);
		
		this.add(p2,BorderLayout.CENTER);
		
		
		
		
	}
	
	@Override
	public Insets insets() {
		
		Insets i = new Insets(50, 30, 30, 30);
		
		return i;
	}
	
	public static void main(String[] args) {
		
		MyFrame4 mf = new MyFrame4();
		mf.setSize(400, 350);
		mf.setVisible(true);
		
	}
	
}
