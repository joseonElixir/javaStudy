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

			hm_room.put(num, "���");
			String num_s = "" + (num);
			cb[i] = new Checkbox(num_s);
		}

		this.setLayout(new BorderLayout(30, 30));
		Label lb_title = new Label("���� ���� Ver2.0", Label.CENTER);
		this.add(lb_title, BorderLayout.CENTER);
		MenuBar mb = new MenuBar();
		this.setMenuBar(mb);
		Menu m = new Menu("�޴�");
		mb.add(m);
		mi_reserve = new MenuItem("�����ϱ�");
		mi_cancel = new MenuItem("�������");
		mi_check = new MenuItem("������Ȳ");
		mi_exit = new MenuItem("����");
		m.add(mi_reserve);
		m.add(mi_cancel);
		m.add(mi_check);
		m.addSeparator(); // addSeparator(); ������.
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
		Label lb_res_title = new Label("�� �����ϱ�", Label.CENTER);
		this.add(lb_res_title, BorderLayout.NORTH);
		Panel p_res_in = new Panel(new GridLayout(3, 3, 10, 10));
		this.add(p_res_in, BorderLayout.CENTER);

		Panel p_res_bot = new Panel(new BorderLayout(30, 30));
		this.add(p_res_bot, BorderLayout.SOUTH);

		tf_res = new TextField();
		// tf_res.setEnabled(false); //�̰�� ������ ��Ȱ��ȭ. ������� ����.
		tf_res.setEditable(false);
		bt_res = new Button("����");
		p_res_bot.add(tf_res, BorderLayout.CENTER);
		p_res_bot.add(bt_res, BorderLayout.EAST);

		for (int i = 0; i < 9; i++) {
			p_res_in.add(cb[i]); // üũ�ڽ� ����
			
			int room_num = Integer.parseInt(cb[i].getLabel()); //room_num�� üũ�ڽ� ������
			if (hm_room.get(room_num).equals("�����")) {//HashMap�� value�� �̾Ƽ� ���� ��
				cb[i].setEnabled(false); //üũ�ڽ� ��Ȱ��ȭ.
			}

		}

		bt_res.addActionListener(this);

	}

	public void cancel() {
		this.removeAll();
		this.setLayout(new BorderLayout(30, 30));
		Label lb_title = new Label("���� ���", Label.CENTER);
		this.add(lb_title, BorderLayout.NORTH);
		Panel pn_cancel = new Panel(new FlowLayout());
		this.add(pn_cancel, BorderLayout.CENTER);
		Label lb_room = new Label("���ȣ");
		pn_cancel.add(lb_room);
		tf_cancel = new TextField(10);
		pn_cancel.add(tf_cancel);
		bt_cancel = new Button("���� ���");
		pn_cancel.add(bt_cancel);
		bt_cancel.addActionListener(this);

		Panel pn_cancel_bot = new Panel(new BorderLayout(30, 30));
		this.add(pn_cancel_bot, BorderLayout.SOUTH);
		Label lb_cancel_msg = new Label("�޽���");
		pn_cancel_bot.add(lb_cancel_msg, BorderLayout.WEST);
		tf_cancel_bot = new TextField();
		pn_cancel_bot.add(tf_cancel_bot, BorderLayout.CENTER);
		tf_cancel_bot.setEditable(false);

	}

	public void check() {
		this.removeAll();
		this.setLayout(new BorderLayout(30, 30));
		Label lb_check = new Label("������Ȳ", Label.CENTER);
		this.add(lb_check, BorderLayout.NORTH);
		TextArea ta_check = new TextArea();
		ta_check.setRows(hm_room.size());
		ta_check.setEditable(false);
		this.add(ta_check, BorderLayout.CENTER);

		for (int i : hm_room.keySet()) {
			ta_check.append(i + "����:" + hm_room.get(i) + "\r\n");
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();

		if (obj == bt_res) {

			for (int i = 0; i < cb.length; i++) {
				if (cb[i].getState() == true) {
					cb[i].setEnabled(false); // ��Ȱ��ȭ
					
					hm_room.put((int) Integer.parseInt(cb[i].getLabel()), "�����");
					tf_res.setText("����Ϸ�");
					cb[i].setState(false); //üũ����
				}

			}

		}

		if (obj == bt_cancel) {
			try {
				int cancelroom_info = Integer.parseInt(tf_cancel.getText());

				if (hm_room.get(cancelroom_info).equals("�����")) {
					hm_room.put(cancelroom_info, "���");
					tf_cancel_bot.setText(cancelroom_info + "���� ���� ��ҵ�");
					for (int i = 0; i < hm_room.size(); i++) {//for
						if(cb[i].getLabel().equals(tf_cancel.getText())) {
							cb[i].setEnabled(true);
						}
					}
				}else if (hm_room.get(cancelroom_info).equals("���")) {
					tf_cancel_bot.setText("����ִ� ���Դϴ�.");
				}
			} catch (Exception ex) {
				tf_cancel_bot.setText("�� ������ ã�� �� �����ϴ�");
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
