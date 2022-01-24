package day25;

import java.util.*;
import java.awt.*;
import java.awt.event.*;


public class HotelReserTest_T extends Frame implements ActionListener{
	
	//기본 컴포넌트
	MenuBar mb;
	Menu m_menu;
	MenuItem mi_reser, mi_can, mi_state, mi_close;
	Label lb_main_title, lb_reser_msg;
	Panel p_main;
	HashMap<String, Boolean> map;
	
	//예약관련 컴포넌트
	Label lb_reser_title, lb_msg;
	Button bt_reser_result;
	Checkbox [] cbs ;
	
	//취소 관련 컴포넌트
	Label lb_can_title, lb_can_room,lb_can_msg;
	TextField tf_can_room;
	Button bt_can_result;
	
	//현황 관련 컴포넌트
	Label lb_state_title;
	TextArea ta_state_content;
	
	
	public HotelReserTest_T() {
		
		mb= new MenuBar();
		this.setMenuBar(mb);
		m_menu =  new Menu("메뉴");
		mb.add(m_menu);
		mi_reser = new MenuItem("방 예약하기");
		mi_can = new MenuItem("방 취소하기");
		mi_state = new MenuItem("예약 현황보기");
		mi_close = new MenuItem("종료"); 
		m_menu.add(mi_reser);
		m_menu.add(mi_can);
		m_menu.add(mi_state);
		m_menu.addSeparator();
		m_menu.add(mi_close);
		
		mi_reser.addActionListener(this);
		mi_can.addActionListener(this);
		mi_state.addActionListener(this);
		mi_close.addActionListener(this);
		
		
		
		lb_main_title = new Label("호텔 예약 관리 프로그램 Ver2.0", Label.CENTER);
		p_main = new Panel(new BorderLayout());
		p_main.add(lb_main_title);//borderLayout에 담을때 위치지정안하면 default가 center
		this.add(p_main);
		
		map = new HashMap<String, Boolean>();
		map.put("101", false);
		map.put("102", false);
		map.put("103", false);
		map.put("201", false);
		map.put("202", false);
		map.put("203", false);
		map.put("301", false);
		map.put("302", false);
		map.put("303", false);
		
		
	}
	
	/**예약 화면 구성 메서드*/
	public void makeReserView() {
		p_main = new Panel(new BorderLayout(5,5));
		//상단
		lb_reser_title = new Label("방 예약하기", Label.CENTER);
		p_main.add(lb_reser_title);
		//중단
		Panel p_temp_center = new Panel(new GridLayout(3,3,10,10));
		p_main.add(p_temp_center,BorderLayout.CENTER);
		
		cbs = new Checkbox[9];
		
		Iterator<String> keys = map.keySet().iterator(); // 맵으로부터 키값을 가져오기 위한 공식적인 코드.
		
		int count=0;
		while(keys.hasNext()) {
			String key = (String) keys.next(); //Iterator에 generic을 선언할 수도, 값에 casting을 할 수도 있다.
			boolean state = map.get(key);
			cbs[count] = new Checkbox(key);
			//cbs[count].setEnabled(state?false:true); 
			if(state==true) {
				cbs[count].setState(true);
				cbs[count].setEnabled(false);
			}
			
			p_temp_center.add(cbs[count]);
			count++;
		}
		
		
		
		//하단
		Panel p_temp_south = new Panel(new BorderLayout(5,5));
		lb_reser_msg  = new Label("메시지:",Label.LEFT);
		bt_reser_result = new Button("예약하기");
		p_temp_south.add(lb_reser_msg,BorderLayout.CENTER);
		p_temp_south.add(bt_reser_result,BorderLayout.EAST);
		p_main.add(p_temp_south,BorderLayout.SOUTH);
		
		bt_reser_result.addActionListener(this);
		
	}
	
	/**취소화면 관련 메소드*/
	public void makeCancelView() {
		p_main = new Panel(new BorderLayout(5,5));
		//상단
		Label lb_can_title = new Label("예약 취소하기",Label.CENTER);
		p_main.add(lb_can_title,BorderLayout.NORTH);
		
		
		//중단
		Panel p_temp1 = new Panel(new BorderLayout(5,5));
		p_main.add(p_temp1,BorderLayout.CENTER);
		Panel p_temp2 = new Panel(new BorderLayout(5,5));
		p_temp1.add(p_temp2,BorderLayout.NORTH);
		lb_can_room	= new Label("방 번호");
		tf_can_room = new TextField();
		bt_can_result = new Button("예약취소");
		
		p_temp2.add(lb_can_room,BorderLayout.WEST);
		p_temp2.add(tf_can_room,BorderLayout.CENTER);
		p_temp2.add(bt_can_result,BorderLayout.EAST);
		
		//하단
		lb_can_msg = new Label("메시지",Label.LEFT);
		p_main.add(lb_can_msg,BorderLayout.SOUTH);
		
		bt_can_result.addActionListener(this);
		
	}
	
	
	/**현황보기 관련 메소드*/
	public void makeStateView() {
		p_main = new Panel(new BorderLayout(5,5));
		lb_state_title = new Label("예약 현황 보기",Label.CENTER);
		ta_state_content = new TextArea();
		p_main.add(lb_state_title,BorderLayout.NORTH);
		p_main.add(ta_state_content,BorderLayout.CENTER);
		
		Iterator <String> keys = map.keySet().iterator();//분명히 도움되는 한줄
		
		String str="";
		while (keys.hasNext()) {
			String key = keys.next();
			boolean state = map.get(key);
			str+=key+"호실 : "+(state?"예약됨":"빈방")+"\n";
		}
		ta_state_content.setText(str);
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		
		if(obj== mi_reser) {
			this.remove(p_main);
			makeReserView();
			this.add(p_main);
			this.validate();
		}else if(obj==mi_can){
			this.remove(p_main);
			makeCancelView();
			this.add(p_main);
			this.validate();
		}else if (obj==mi_state) {
			this.remove(p_main);
			makeStateView();
			this.add(p_main);
			this.validate();
		}else if (obj==mi_close) {
			System.exit(0);
		}else if (obj==bt_reser_result) {
			for(int i=0;i<cbs.length;i++) {
				String key = cbs[i].getLabel();
				boolean state = cbs[i].getState(); // 체크박스 상태 
				map.put(key, state);
			}
			lb_reser_msg.setText("메세지 : 예약 완료됨.");
		}else if(obj==bt_can_result) {
			String key = tf_can_room.getText();
			boolean state = map.get(key);
			if(state) {
				map.put(key, false);
				lb_can_msg.setText("메시지 :"+key+" 호실 취소됨");
			}else {
				lb_can_msg.setText("메시지 : "+key+" 호실은 이미 빈방입니다.");
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		HotelReserTest_T hrt = new HotelReserTest_T();
		hrt.setSize(300,300);
		hrt.setVisible(true);
		
	}
	
}
