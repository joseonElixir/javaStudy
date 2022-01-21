package day23;

import java.awt.*;

public class MyFrame2 extends Frame {
	
	public MyFrame2(){
		//GridLayout (int rows, int cols, int hgap, int vgap)
		//(행, 열, 수직간격, 수평간격)
		GridLayout gl = new GridLayout(2,3,10,10);
		this.setLayout(gl);//프레임에 레이아웃을 설정
		
		Button bt1= new Button("bt1");//버튼 생성
		Button bt2= new Button("bt2");
		Button bt3= new Button("bt3");
		Button bt4= new Button("bt4");
		Button bt5= new Button("bt5");
		this.add(bt1);//add를 통한 버튼 삽입. 이때 레이아웃의 규칙에 맞춰서 삽입됨.
		this.add(bt2);
		this.add(bt3);
		this.add(bt4);
		this.add(bt5);
		
		Panel p = new Panel();
		p.setBackground(Color.CYAN);
		this.add(p); //add를 통한 패널 삽입. 그리고 색상값을 줌으로써 구분하기 용이하게 만듬.
		
		Button bt6 = new Button("bt6");
		Button bt7 = new Button("bt7");
		
		BorderLayout bl = new  BorderLayout(20,20);
		p.setLayout(bl);//패널에 레이아웃 규칙 설정.
		p.add(bt6,BorderLayout.NORTH); //add로 패널에 버튼을 삽입, BorderLayout은 중앙을 포함한 5방향의 규칙을 가지고 있음.
		p.add(bt7,"South");
		
	}
	
	@Override
	public Insets getInsets() { //경계선과 컴포넌트에 간격을 띄우기 위해 만듬.
		Insets i = new Insets(45, 20, 20, 20); 
		return i;

	}

	public static void main(String[] args) {
		
		MyFrame2 mf2 = new MyFrame2();
		mf2.setSize(300, 300);
		mf2.setVisible(true);
	}
	
}
