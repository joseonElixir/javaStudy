package day23;

import java.awt.*;

public class MyFrame {

	public static void main(String[] args) {
	
		Frame f = new Frame("나의 첫 프레임");
		f.setSize(300, 300); //프레임 사이즈 설정
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
		//스크린이 생성되는 위치에 대한 좌표값을 계산하기 위해 사용자의 스크린 사이즈 불러오기.
		//위처럼 쓰면 절차가 눈에 보임. 다만 쓸데없는 변수를 선언하므로 메모리 낭비를 발생시킴.
		Dimension dim2 = Toolkit.getDefaultToolkit().getScreenSize();
		//이렇게 쓸 것. 
		
		
		int x = (int)dim.getWidth()/2-150;
		int y = (int)dim.getHeight()/2-150;
		System.out.println("x="+x+", y="+y);
		f.setLocation(x, y);
		f.setVisible(true);
		
		
		
	}
	
	
}
