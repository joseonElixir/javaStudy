package day24;
import java.awt.*; //AWT 패키지 안의 폴더(패키지)를 제외한 전부.
import java.awt.event.*; // event 패키지.

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
		
		
		bt_red.addActionListener(this); //actionPerformed는 this가 가지고 있다.
		bt_blue.addActionListener(this);
		bt_green.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//판단을 위한 요청받기.
		//String temp =e.getActionCommand();
		//System.out.println(temp);
		
		Object ob = e.getSource(); //Object 클래스 ob에 ActionEvent e의 주소값을 저장.
		//즉 ActionEvent가 발생한 객체의 주소.
		//요구사항에 대한 분석.
		if(ob==bt_red) { //이벤트가 발생한 주소와 기존 주소들을 비교하기
			this.setBackground(Color.red);//결과에 따른 절차수행.
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
		this.validate();// 렌더링 처리. 즉, 구조의 재확인.구조배치를 바꿀때 선언해줘야 한다.
		
//		if(e.getActionCommand().equals("red")) {
//			//기능구현 영역
//			this.setBackground(Color.red);
//			
//		}else if(e.getActionCommand().equals("blue")) {
//			//기능구현 영역
//			this.setBackground(Color.blue);
//		}if(e.getActionCommand().equals("green")) {
//			//기능구현 영역
//			this.setBackground(Color.green);
//		}
		
	}
	
	public static void main(String[] args) {
		
		MyEvent me = new MyEvent();
		
		me.setSize(300,300);
		me.setVisible(true);
		
	}

	
	
}
