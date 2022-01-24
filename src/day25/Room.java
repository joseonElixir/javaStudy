package day25;

import java.awt.*; 
import java.awt.event.*;
import java.util.*;



public class Room extends Frame implements ActionListener , WindowListener{

	MenuItem mi_reserve, mi_cancel, mi_check, mi_exit;
	HashMap<Integer, String> hm_room;
	Button bt_res, bt_cancel;
	Checkbox[] cb;
	TextField tf_res, tf_cancel, tf_cancel_bot;

	public Room() {
		
		hm_room = new HashMap<Integer, String>();
		cb = new Checkbox[9];
		int num = 100;
		for (int i = 0; i < 9; i++) {
			if (i != 0 && i % 3 == 0) {
				num += 98;
			} else {
				num++;
			}

			hm_room.put(num, "빈방");
			String num_s = "" + (num);
			cb[i] = new Checkbox(num_s);
		}

		this.setLayout(new BorderLayout(30, 30));
		Label lb_title = new Label("숙박 예약 Ver2.0", Label.CENTER);
		this.add(lb_title, BorderLayout.CENTER);
		MenuBar mb = new MenuBar();
		this.setMenuBar(mb);
		Menu m = new Menu("메뉴");
		mb.add(m);
		mi_reserve = new MenuItem("예약하기");
		mi_cancel = new MenuItem("예약취소");
		mi_check = new MenuItem("예약현황");
		mi_exit = new MenuItem("종료");
		m.add(mi_reserve);
		m.add(mi_cancel);
		m.add(mi_check);
		m.addSeparator(); // addSeparator(); 구분자.
		m.add(mi_exit);

		mi_reserve.addActionListener(this);
		mi_cancel.addActionListener(this);
		mi_check.addActionListener(this);
		mi_exit.addActionListener(this);
		this.addWindowListener(this);

	}

	public void reserve() {
		this.removeAll();
		this.setLayout(new BorderLayout(30, 30));
		Panel p_res = new Panel(new BorderLayout(30, 30));
		this.add(p_res, BorderLayout.CENTER);
		Label lb_res_title = new Label("방 예약하기", Label.CENTER);
		this.add(lb_res_title, BorderLayout.NORTH);
		Panel p_res_in = new Panel(new GridLayout(3, 3, 10, 10));
		this.add(p_res_in, BorderLayout.CENTER);

		Panel p_res_bot = new Panel(new BorderLayout(30, 30));
		this.add(p_res_bot, BorderLayout.SOUTH);

		tf_res = new TextField();
		// tf_res.setEnabled(false); //이경우 완전한 비활성화. 출력조차 못함.
		tf_res.setEditable(false);
		bt_res = new Button("예약");
		p_res_bot.add(tf_res, BorderLayout.CENTER);
		p_res_bot.add(bt_res, BorderLayout.EAST);

		for (int i = 0; i < 9; i++) {
			p_res_in.add(cb[i]); // 체크박스 삽입
			
			int room_num = Integer.parseInt(cb[i].getLabel()); //room_num에 체크박스 라벨추출
			if (hm_room.get(room_num).equals("예약됨")) {//HashMap의 value를 뽑아서 문장 비교
				cb[i].setEnabled(false); //체크박스 비활성화.
			}

		}

		bt_res.addActionListener(this);

	}

	public void cancel() {
		this.removeAll();
		this.setLayout(new BorderLayout(30, 30));
		Label lb_title = new Label("예약 취소", Label.CENTER);
		this.add(lb_title, BorderLayout.NORTH);
		Panel pn_cancel = new Panel(new FlowLayout());
		this.add(pn_cancel, BorderLayout.CENTER);
		Label lb_room = new Label("방번호");
		pn_cancel.add(lb_room);
		tf_cancel = new TextField(10);
		pn_cancel.add(tf_cancel);
		bt_cancel = new Button("예약 취소");
		pn_cancel.add(bt_cancel);
		bt_cancel.addActionListener(this);

		Panel pn_cancel_bot = new Panel(new BorderLayout(30, 30));
		this.add(pn_cancel_bot, BorderLayout.SOUTH);
		Label lb_cancel_msg = new Label("메시지");
		pn_cancel_bot.add(lb_cancel_msg, BorderLayout.WEST);
		tf_cancel_bot = new TextField();
		pn_cancel_bot.add(tf_cancel_bot, BorderLayout.CENTER);
		tf_cancel_bot.setEditable(false);

	}

	public void check() {
		this.removeAll();
		this.setLayout(new BorderLayout(30, 30));
		Label lb_check = new Label("예약현황", Label.CENTER);
		this.add(lb_check, BorderLayout.NORTH);
		TextArea ta_check = new TextArea();
		ta_check.setRows(hm_room.size());
		ta_check.setEditable(false);
		this.add(ta_check, BorderLayout.CENTER);

		for (int i : hm_room.keySet()) {
			ta_check.append(i + "번방:" + hm_room.get(i) + "\r\n");
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();

		if (obj == bt_res) {

			for (int i = 0; i < cb.length; i++) {
				if (cb[i].getState() == true) {
					cb[i].setEnabled(false); // 비활성화
					
					hm_room.put((int) Integer.parseInt(cb[i].getLabel()), "예약됨");
					tf_res.setText("예약완료");
					cb[i].setState(false); //체크해제
				}

			}

		}

		if (obj == bt_cancel) {
			try {
				int cancelroom_info = Integer.parseInt(tf_cancel.getText());

				if (hm_room.get(cancelroom_info).equals("예약됨")) {
					hm_room.put(cancelroom_info, "빈방");
					tf_cancel_bot.setText(cancelroom_info + "번방 예약 취소됨");
					for (int i = 0; i < hm_room.size(); i++) {//for
						if(cb[i].getLabel().equals(tf_cancel.getText())) {
							cb[i].setEnabled(true);
						}
					}
				}else if (hm_room.get(cancelroom_info).equals("빈방")) {
					tf_cancel_bot.setText("비어있는 방입니다.");
				}
			} catch (Exception ex) {
				tf_cancel_bot.setText("방 정보를 찾을 수 없습니다");
			}
		}

		if (obj == mi_reserve){
			this.reserve();
			this.validate();
		} else if (obj == mi_cancel) {
			this.cancel();
			this.validate();
		} else if (obj == mi_check) {
			this.check();
			this.validate();
		} else if (obj == mi_exit) {
			System.exit(0);
		}

	}
	
	@Override
	public Insets getInsets() {
		Insets i = new Insets(50, 30, 30, 30);
		return i;
	}
	


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

	public static void main(String[] args) { 			//main
		
		Room r = new Room();
		
		r.setSize(300, 300);
		r.setVisible(true);
		
	}
}
