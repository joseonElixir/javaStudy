package day26;

import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;


public class Hotel extends Frame implements ActionListener{
	
	Menu menu;
	MenuBar mb;
	MenuItem mi_reserv , mi_cancel, mi_state , mi_exit;
	Panel p_main;
	HashMap<String,String> hm_room = new HashMap<String,String>();
	
	
	//reserv 
	Checkbox cb[];
	Label lb_reser_msg;
	Button bt_reser;
	//cancel
	Label lb_cancel;
	TextField tf_cancel;
	Button bt_cancel;
	
	//state 
	Label lb_state_text;
	
	
	public Hotel() {
		this.setLayout(new BorderLayout());
		p_main = new Panel( new BorderLayout());
		this.add(p_main);
		mb = new MenuBar();
		menu = new Menu("메뉴");
		this.setMenuBar(mb);
		mb.add(menu);
		mi_reserv = new MenuItem("예약");
		menu.add(mi_reserv);
		mi_cancel = new MenuItem("예약취소");
		menu.add(mi_cancel);
		mi_state = new MenuItem("조회");
		menu.add(mi_state);
		mi_exit = new MenuItem("종료");
		menu.add(mi_exit);
		
		Label lb_main = new Label("호텔 예약 Ver2.0",Label.CENTER);
		p_main.add(lb_main);
		
		String str = "";
		int num=100;
		cb = new Checkbox[9];
		for(int i=0;i<9;i++) {
			if(i%3==0) {
				num+=100;
			}else {
				num++;
			}
			str=""+num+"호";
			hm_room.put(getWarningString(), "");
			cb[i] = new Checkbox(str);
		}
		
		
		
		mi_reserv.addActionListener(this);
		mi_cancel.addActionListener(this);
		mi_state.addActionListener(this);
		mi_exit.addActionListener(this);
		
		
		
	}
	
	public void reserv() {
		//레이아웃
		p_main = new Panel(new BorderLayout());
		this.add(p_main);
		//상단
		Label lb_reser_title = new Label("방 예약하기");
		p_main.add(lb_reser_title,BorderLayout.NORTH);
		//중단
		Panel p_reser_center = new Panel(new GridLayout(3,3,10,10));
		p_main.add(p_reser_center,BorderLayout.CENTER);
		
		for(int i =0;i<cb.length;i++) {
			p_reser_center.add(cb[i]);
		}
		
		//하단
		Panel p_reser_south = new Panel(new BorderLayout());
		p_main.add(p_reser_south,BorderLayout.SOUTH);
		Label lb_reser_msg = new Label("메시지:",Label.LEFT);
		p_reser_south.add(lb_reser_msg,BorderLayout.CENTER);
		bt_reser = new Button("예약확인");
		p_reser_south.add(bt_reser,BorderLayout.EAST);
		
	}
	
	public void cancel() {
		p_main = new Panel(new BorderLayout());	
		this.add(p_main);
		
		Label lb_cancel_title = new Label("예약 취소하기");
		p_main.add(lb_cancel_title,BorderLayout.NORTH);
		
		Panel p_cancel = new Panel(new BorderLayout());
		p_main.add(p_cancel,BorderLayout.CENTER);
		
		Panel p_cancel_west = new Panel();
		p_cancel.add(p_cancel_west,BorderLayout.WEST);
		lb_cancel = new Label("입력 : ");
		p_cancel_west.add(lb_cancel);
		
		
		Panel p_cancel_center = new Panel();
		p_cancel.add(p_cancel_center,BorderLayout.CENTER);
		tf_cancel = new TextField(20);
		p_cancel_center.add(tf_cancel);
		
		
		Panel p_cancel_east = new Panel();
		p_cancel.add(p_cancel_east,BorderLayout.EAST);
		bt_cancel= new Button("예약취소");
		p_cancel_east.add(bt_cancel);
	}
	
	public void state() {
		p_main = new Panel(new BorderLayout());	
		this.add(p_main);
		Label lb_state = new Label("예약현황",Label.CENTER);
		p_main.add(lb_state,BorderLayout.NORTH);
		lb_state_text = new Label();
		p_main.add(lb_state,BorderLayout.CENTER);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if (obj ==mi_reserv) {
			this.remove(p_main);
			reserv();
			this.validate();
		}else if(obj== mi_cancel) {
			this.remove(p_main);
			cancel();
			this.validate();
		}else if(obj== mi_state) {
			
		}else if(obj== mi_exit) {
			System.exit(0);
		}else if(obj== null) {
			
		}else if(obj== null) {
			
		}else if(obj== null) {
			
		}
		
	}

	public static void main(String[] args) {
		
		Hotel ht = new Hotel();
		ht.setSize(300,300);
		ht.setVisible(true);
		
		String str = "301호"; //String 타입으로 값을 받는다 
		str = str.substring(0,str.length()-1);
		System.out.println(str);
	}

}
