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
		menu = new Menu("�޴�");
		this.setMenuBar(mb);
		mb.add(menu);
		mi_reserv = new MenuItem("����");
		menu.add(mi_reserv);
		mi_cancel = new MenuItem("�������");
		menu.add(mi_cancel);
		mi_state = new MenuItem("��ȸ");
		menu.add(mi_state);
		mi_exit = new MenuItem("����");
		menu.add(mi_exit);
		
		Label lb_main = new Label("ȣ�� ���� Ver2.0",Label.CENTER);
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
			str=""+num+"ȣ";
			hm_room.put(getWarningString(), "");
			cb[i] = new Checkbox(str);
		}
		
		
		
		mi_reserv.addActionListener(this);
		mi_cancel.addActionListener(this);
		mi_state.addActionListener(this);
		mi_exit.addActionListener(this);
		
		
		
	}
	
	public void reserv() {
		//���̾ƿ�
		p_main = new Panel(new BorderLayout());
		this.add(p_main);
		//���
		Label lb_reser_title = new Label("�� �����ϱ�");
		p_main.add(lb_reser_title,BorderLayout.NORTH);
		//�ߴ�
		Panel p_reser_center = new Panel(new GridLayout(3,3,10,10));
		p_main.add(p_reser_center,BorderLayout.CENTER);
		
		for(int i =0;i<cb.length;i++) {
			p_reser_center.add(cb[i]);
		}
		
		//�ϴ�
		Panel p_reser_south = new Panel(new BorderLayout());
		p_main.add(p_reser_south,BorderLayout.SOUTH);
		Label lb_reser_msg = new Label("�޽���:",Label.LEFT);
		p_reser_south.add(lb_reser_msg,BorderLayout.CENTER);
		bt_reser = new Button("����Ȯ��");
		p_reser_south.add(bt_reser,BorderLayout.EAST);
		
	}
	
	public void cancel() {
		p_main = new Panel(new BorderLayout());	
		this.add(p_main);
		
		Label lb_cancel_title = new Label("���� ����ϱ�");
		p_main.add(lb_cancel_title,BorderLayout.NORTH);
		
		Panel p_cancel = new Panel(new BorderLayout());
		p_main.add(p_cancel,BorderLayout.CENTER);
		
		Panel p_cancel_west = new Panel();
		p_cancel.add(p_cancel_west,BorderLayout.WEST);
		lb_cancel = new Label("�Է� : ");
		p_cancel_west.add(lb_cancel);
		
		
		Panel p_cancel_center = new Panel();
		p_cancel.add(p_cancel_center,BorderLayout.CENTER);
		tf_cancel = new TextField(20);
		p_cancel_center.add(tf_cancel);
		
		
		Panel p_cancel_east = new Panel();
		p_cancel.add(p_cancel_east,BorderLayout.EAST);
		bt_cancel= new Button("�������");
		p_cancel_east.add(bt_cancel);
	}
	
	public void state() {
		p_main = new Panel(new BorderLayout());	
		this.add(p_main);
		Label lb_state = new Label("������Ȳ",Label.CENTER);
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
		
		String str = "301ȣ"; //String Ÿ������ ���� �޴´� 
		str = str.substring(0,str.length()-1);
		System.out.println(str);
	}

}
