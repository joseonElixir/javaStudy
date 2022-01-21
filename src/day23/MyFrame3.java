package day23;

import java.awt.*;

class MyF extends Frame{
	
	public MyF() {
		//GridLayout gl1 = new GridLayout(2,1,30,30);
		//FlowLayout fl = new FlowLayout(FlowLayout.TRAILING,20,20);
		BorderLayout bl2 = new BorderLayout(40,40);
		this.setLayout(bl2);
		
		Panel pan1 = new Panel(); //pan1파트
		pan1.setBackground(Color.PINK); //백그라운드컬러 설정
		pan1.setSize(WIDTH, 300);
		GridLayout gl2 = new GridLayout(2,2,15,15);
		pan1.setLayout(gl2); //레이아웃 설정
		
		Button b4 = new Button("b4");
		Button b5 = new Button("b5");
		Button b6 = new Button("b6");
		Button b7 = new Button("b7");//버튼 제작 
		
		
		pan1.add(b4);
		pan1.add(b5);
		pan1.add(b6);
		pan1.add(b7);//버튼 삽입
		
		
		Panel pan2 = new Panel();
		pan2.setBackground(Color.blue);
		BorderLayout bl = new BorderLayout();
		GridLayout gl3 = new GridLayout(3,1,0,0);
		pan2.setLayout(gl3);
		
		Button b1 = new Button("b1");
		Panel p3 = new Panel();
		p3.setBackground(Color.BLUE);
		
		Button b3 = new Button("b3");
		
		pan2.add(b1,BorderLayout.NORTH);
		pan2.add(p3);
		pan2.add(b3,BorderLayout.SOUTH);
		pan2.setSize(200,200);
		
		this.add(pan1,BorderLayout.CENTER);
		this.add(pan2,BorderLayout.SOUTH);
	}
	
	@Override
	public Insets getInsets() {
		Insets i = new Insets(30, 25,25, 25);
		return i;
	}
	
	
}


public class MyFrame3 {

	public static void main(String[] args) {
		
		MyF my = new MyF();
		my.setSize(350, 400);
		
		my.setVisible(true);
		
	}
	
}
