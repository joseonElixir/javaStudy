package day23;

import java.awt.*;



public class MyFrame3_T extends Frame{
	
	public MyFrame3_T() {
	
		BorderLayout bl = new BorderLayout(20,20);
		this.setLayout(bl);
		
		Panel pn1 = new Panel();
		this.add(pn1,"Center");
		pn1.setBackground(Color.pink);
		
		GridLayout gl = new GridLayout(2,2,10,10);
		pn1.setLayout(gl);
		
		Button bt1 = new Button("bt1");
		Button bt2 = new Button("bt2");
		Button bt3 = new Button("bt3");
		Button bt4 = new Button("bt4");
		
		pn1.add(bt1);
		pn1.add(bt2);
		pn1.add(bt3);
		pn1.add(bt4);

		
		Panel pn2 = new Panel();
		this.add(pn2,"South");
		pn2.setBackground(Color.blue);
		BorderLayout bl2 = new BorderLayout(10,10);
		pn2.setLayout(bl2);
		Button bt5 = new Button("bt5");
		Button bt6 = new Button("bt6");
		
		pn2.add(bt5,"North");
		pn2.add(bt6,"South");
		
		
	}
	
	@Override
	public Insets getInsets() {
		Insets i = new Insets(25,20,20,20);

		return i;
	}
	
	
	public static void main(String[] args) {
		
		MyFrame3_T mf = new MyFrame3_T();
		mf.setSize(300,300);
		mf.setVisible(true);
		
	}
	
}
