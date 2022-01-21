package day24;
import java.awt.*;
import java.awt.event.*;


public class MenuTest extends Frame implements ActionListener ,WindowListener{
	
	MenuBar mb; //�޴��� ��ġ�� �� �ִ� ����
	Menu m_file, m_color,m_color2; // �޴� 
	MenuItem mi_save,mi_load,mi_close,mi_red,mi_blue,mi_yell,mi_gray; //�޴� �ȿ� �� �׸��
	Panel pn_center;
	Label lb_south;
	public MenuTest() {
		
		this.setLayout(new BorderLayout(10,10)); //frame�� layout ����
		
		Panel pn_south = new Panel(new BorderLayout(10,10));//�гμ���� ���ÿ� ���̾ƿ� ����
		pn_center = new Panel(); //�� ���̾ƿ��� �г� ����
		this.add(pn_south,"South");
		this.add(pn_center,BorderLayout.CENTER);
		pn_south.setBackground(Color.blue);
		
		lb_south = new Label("����");  //
		lb_south.setForeground(Color.red);
		//pn_south.setLayout(new BorderLayout(10,10));//�гο� ���̾ƿ� ����
		pn_south.add(lb_south,"West"); // �г��� Ư�� ������ �� ����
		
		
		mb = new MenuBar();
		this.setMenuBar(mb); //frame�� �޴��� ����
		m_file = new Menu("����");
		mb.add(m_file);//�޴��ٿ� �޴� ����
		
		mi_save = new MenuItem("�����ϱ�");
		m_file.add(mi_save);//�Ŵ��� �� �׸�(menuItem)�� �޴��� ����
		mi_load = new MenuItem("�ҷ�����");
		m_file.add(mi_load);
		m_file.addSeparator();// ������.
		mi_close = new MenuItem("�ݱ�");
		m_file.add(mi_close); 
		
		
		//
		
		m_color = new Menu("����");
		mb.add(m_color); //���ο� �޴� ����
		
		mi_red = new MenuItem("����");
		mi_blue = new MenuItem("�Ķ�");
		m_color.add(mi_blue);
		m_color.add(mi_red);
		
		m_color2 = new Menu("�ٸ� ����");
		m_color.add(m_color2);//�޴� �ȿ� �޴� ����.
		mi_yell = new MenuItem("���");
		mi_gray = new MenuItem("ȸ��");
		m_color2.add(mi_yell);
		m_color2.add(mi_gray);
		
		
		
		
		mi_save.addActionListener(this);//�̺�Ʈ�� �ٿ��� mi_save�� �̺�Ʈ�� ó���� ��ü this�� ����
		mi_load.addActionListener(this);
		mi_close.addActionListener(this);
		mi_red.addActionListener(this);
		mi_blue.addActionListener(this);
		mi_gray.addActionListener(this);
		mi_yell.addActionListener(this);
		this.addWindowListener(this);//�ڽſ��Լ� �߻��ϴ� �̺�Ʈ�� ó���ϴ� ��ü (�ڽ�)�� ����
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object ob = e.getSource();
		
		if(ob==mi_save) {
			FileDialog fd = new FileDialog(this,"��������ھƾƾƾ�",FileDialog.SAVE);
			//�����츦 ��ӹ޴� �ֵ��� ���� ��Ȱ��ȭ�� �����ϱ� ������ setvisible�� �������
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

	// WindowListener �������̽��� ��ӹ޾ұ� ������ �ʼ������� �������̵� ����� �ϴ� �͵�.
	//�������̵����� ������ abstract class(�ҿ��� Ŭ����)�� �ȴ�.
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
