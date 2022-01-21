package day24;
import java.awt.*;
import java.awt.event.*;


public class MenuTest extends Frame implements ActionListener ,WindowListener{
	
	MenuBar mb; //메뉴를 배치할 수 있는 공간
	Menu m_file, m_color,m_color2; // 메뉴 
	MenuItem mi_save,mi_load,mi_close,mi_red,mi_blue,mi_yell,mi_gray; //메뉴 안에 들어갈 항목들
	Panel pn_center;
	Label lb_south;
	public MenuTest() {
		
		this.setLayout(new BorderLayout(10,10)); //frame에 layout 설정
		
		Panel pn_south = new Panel(new BorderLayout(10,10));//패널선언과 동시에 레이아웃 설정
		pn_center = new Panel(); //각 레이아웃에 패널 삽입
		this.add(pn_south,"South");
		this.add(pn_center,BorderLayout.CENTER);
		pn_south.setBackground(Color.blue);
		
		lb_south = new Label("글자");  //
		lb_south.setForeground(Color.red);
		//pn_south.setLayout(new BorderLayout(10,10));//패널에 레이아웃 설정
		pn_south.add(lb_south,"West"); // 패널의 특정 구역에 라벨 삽입
		
		
		mb = new MenuBar();
		this.setMenuBar(mb); //frame에 메뉴바 셋팅
		m_file = new Menu("파일");
		mb.add(m_file);//메뉴바에 메뉴 삽입
		
		mi_save = new MenuItem("저장하기");
		m_file.add(mi_save);//매뉴에 들어갈 항목(menuItem)을 메뉴에 삽입
		mi_load = new MenuItem("불러오기");
		m_file.add(mi_load);
		m_file.addSeparator();// 구분자.
		mi_close = new MenuItem("닫기");
		m_file.add(mi_close); 
		
		
		//
		
		m_color = new Menu("색상");
		mb.add(m_color); //새로운 메뉴 삽입
		
		mi_red = new MenuItem("빨강");
		mi_blue = new MenuItem("파랑");
		m_color.add(mi_blue);
		m_color.add(mi_red);
		
		m_color2 = new Menu("다른 색상");
		m_color.add(m_color2);//메뉴 안에 메뉴 삽입.
		mi_yell = new MenuItem("노랑");
		mi_gray = new MenuItem("회색");
		m_color2.add(mi_yell);
		m_color2.add(mi_gray);
		
		
		
		
		mi_save.addActionListener(this);//이벤트의 근원지 mi_save와 이벤트를 처리항 주체 this를 연결
		mi_load.addActionListener(this);
		mi_close.addActionListener(this);
		mi_red.addActionListener(this);
		mi_blue.addActionListener(this);
		mi_gray.addActionListener(this);
		mi_yell.addActionListener(this);
		this.addWindowListener(this);//자신에게서 발생하는 이벤트를 처리하는 주체 (자신)을 연결
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object ob = e.getSource();
		
		if(ob==mi_save) {
			FileDialog fd = new FileDialog(this,"저어어어어자아아아앙",FileDialog.SAVE);
			//윈도우를 상속받는 애들은 전부 비활성화로 시작하기 때문에 setvisible을 해줘야함
			fd.setVisible(true);
			
		}else if(ob==mi_load) {
			
		}else if(ob==mi_close) {
			System.exit(0);
		}
		else if(ob==mi_red) {
			pn_center.setBackground(Color.red);
		}else if(ob==mi_blue) {
			pn_center.setBackground(Color.blue);
			
		}else if(ob==mi_yell) {
			lb_south.setForeground(Color.yellow);
		}else if(ob==mi_gray) {
			lb_south.setForeground(Color.GRAY);
			
		}
		
		
	}

	// WindowListener 인터페이스를 상속받았기 때문에 필수적으로 오버라이딩 해줘야 하는 것들.
	//오버라이딩하지 않으면 abstract class(불완전 클래스)가 된다.
	@Override
	public void windowOpened(WindowEvent e) {}


	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}


	@Override
	public void windowClosed(WindowEvent e) {} 


	@Override
	public void windowIconified(WindowEvent e) {}


	@Override
	public void windowDeiconified(WindowEvent e) {}


	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}
	
	public static void main(String[] args) {
		
		MenuTest mt = new MenuTest();
		mt.setSize(300,300);
		mt.setVisible(true);
		
	}
	
}
