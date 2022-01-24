package day25;

import java.util.*;
import java.awt.*;
import java.awt.event.*;


public class HotelReserTest_T extends Frame implements ActionListener{
	
	//�⺻ ������Ʈ
	MenuBar mb;
	Menu m_menu;
	MenuItem mi_reser, mi_can, mi_state, mi_close;
	Label lb_main_title, lb_reser_msg;
	Panel p_main;
	HashMap<String, Boolean> map;
	
	//������� ������Ʈ
	Label lb_reser_title, lb_msg;
	Button bt_reser_result;
	Checkbox [] cbs ;
	
	//��� ���� ������Ʈ
	Label lb_can_title, lb_can_room,lb_can_msg;
	TextField tf_can_room;
	Button bt_can_result;
	
	//��Ȳ ���� ������Ʈ
	Label lb_state_title;
	TextArea ta_state_content;
	
	
	public HotelReserTest_T() {
		
		mb= new MenuBar();
		this.setMenuBar(mb);
		m_menu =  new Menu("�޴�");
		mb.add(m_menu);
		mi_reser = new MenuItem("�� �����ϱ�");
		mi_can = new MenuItem("�� ����ϱ�");
		mi_state = new MenuItem("���� ��Ȳ����");
		mi_close = new MenuItem("����"); 
		m_menu.add(mi_reser);
		m_menu.add(mi_can);
		m_menu.add(mi_state);
		m_menu.addSeparator();
		m_menu.add(mi_close);
		
		mi_reser.addActionListener(this);
		mi_can.addActionListener(this);
		mi_state.addActionListener(this);
		mi_close.addActionListener(this);
		
		
		
		lb_main_title = new Label("ȣ�� ���� ���� ���α׷� Ver2.0", Label.CENTER);
		p_main = new Panel(new BorderLayout());
		p_main.add(lb_main_title);//borderLayout�� ������ ��ġ�������ϸ� default�� center
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
	
	/**���� ȭ�� ���� �޼���*/
	public void makeReserView() {
		p_main = new Panel(new BorderLayout(5,5));
		//���
		lb_reser_title = new Label("�� �����ϱ�", Label.CENTER);
		p_main.add(lb_reser_title);
		//�ߴ�
		Panel p_temp_center = new Panel(new GridLayout(3,3,10,10));
		p_main.add(p_temp_center,BorderLayout.CENTER);
		
		cbs = new Checkbox[9];
		
		Iterator<String> keys = map.keySet().iterator(); // �����κ��� Ű���� �������� ���� �������� �ڵ�.
		
		int count=0;
		while(keys.hasNext()) {
			String key = (String) keys.next(); //Iterator�� generic�� ������ ����, ���� casting�� �� ���� �ִ�.
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
		
		
		
		//�ϴ�
		Panel p_temp_south = new Panel(new BorderLayout(5,5));
		lb_reser_msg  = new Label("�޽���:",Label.LEFT);
		bt_reser_result = new Button("�����ϱ�");
		p_temp_south.add(lb_reser_msg,BorderLayout.CENTER);
		p_temp_south.add(bt_reser_result,BorderLayout.EAST);
		p_main.add(p_temp_south,BorderLayout.SOUTH);
		
		bt_reser_result.addActionListener(this);
		
	}
	
	/**���ȭ�� ���� �޼ҵ�*/
	public void makeCancelView() {
		p_main = new Panel(new BorderLayout(5,5));
		//���
		Label lb_can_title = new Label("���� ����ϱ�",Label.CENTER);
		p_main.add(lb_can_title,BorderLayout.NORTH);
		
		
		//�ߴ�
		Panel p_temp1 = new Panel(new BorderLayout(5,5));
		p_main.add(p_temp1,BorderLayout.CENTER);
		Panel p_temp2 = new Panel(new BorderLayout(5,5));
		p_temp1.add(p_temp2,BorderLayout.NORTH);
		lb_can_room	= new Label("�� ��ȣ");
		tf_can_room = new TextField();
		bt_can_result = new Button("�������");
		
		p_temp2.add(lb_can_room,BorderLayout.WEST);
		p_temp2.add(tf_can_room,BorderLayout.CENTER);
		p_temp2.add(bt_can_result,BorderLayout.EAST);
		
		//�ϴ�
		lb_can_msg = new Label("�޽���",Label.LEFT);
		p_main.add(lb_can_msg,BorderLayout.SOUTH);
		
		bt_can_result.addActionListener(this);
		
	}
	
	
	/**��Ȳ���� ���� �޼ҵ�*/
	public void makeStateView() {
		p_main = new Panel(new BorderLayout(5,5));
		lb_state_title = new Label("���� ��Ȳ ����",Label.CENTER);
		ta_state_content = new TextArea();
		p_main.add(lb_state_title,BorderLayout.NORTH);
		p_main.add(ta_state_content,BorderLayout.CENTER);
		
		Iterator <String> keys = map.keySet().iterator();//�и��� ����Ǵ� ����
		
		String str="";
		while (keys.hasNext()) {
			String key = keys.next();
			boolean state = map.get(key);
			str+=key+"ȣ�� : "+(state?"�����":"���")+"\n";
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
				boolean state = cbs[i].getState(); // üũ�ڽ� ���� 
				map.put(key, state);
			}
			lb_reser_msg.setText("�޼��� : ���� �Ϸ��.");
		}else if(obj==bt_can_result) {
			String key = tf_can_room.getText();
			boolean state = map.get(key);
			if(state) {
				map.put(key, false);
				lb_can_msg.setText("�޽��� :"+key+" ȣ�� ��ҵ�");
			}else {
				lb_can_msg.setText("�޽��� : "+key+" ȣ���� �̹� ����Դϴ�.");
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		HotelReserTest_T hrt = new HotelReserTest_T();
		hrt.setSize(300,300);
		hrt.setVisible(true);
		
	}
	
}
