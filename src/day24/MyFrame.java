package day24;
import java.awt.*;
public class MyFrame extends Frame{
	
	public MyFrame() {
		super("�޼��� ������"); // Ÿ��Ʋ�� �Է¹޴� �����ڸ� ȣ��
		
		BorderLayout  bl = new BorderLayout(5,5);
		this.setLayout(bl); //������ ������ ����ȭ�ϱ� ���ؼ� BorderLayout���� ������ ������.
		
		//���
		Panel p_north = new Panel(new GridLayout(2,2,5,5)); 
		//����� ������ ����ȭ�ϱ� ���ؼ� gridLayout���� ������ ������.
		this.add(p_north,"North");
		Label lb_from = new Label("������ ��",Label.LEFT);
		Label lb_to = new Label("�޴� ��",Label.LEFT);
		TextField tx_from = new TextField();
		TextField tx_to = new TextField();
		p_north.add(lb_from); p_north.add(tx_from);
		p_north.add(lb_to); p_north.add(tx_to);
		
		//�ߴ�
		Panel p_center = new Panel(new BorderLayout(5,5));
		//�ߴܟ� ������ ����ȭ�ϱ� ���ؼ� BorderLayout���� ������ ������.
		this.add(p_center);
		Label lb_title= new Label("�Ʒ��� �޽����� �ۼ��Ͻÿ�.",Label.CENTER);//alignment�� Center�� ����ش�.
		Label lb_msg = new Label("�޽���");
		TextArea ta_content = new TextArea();
		p_center.add(lb_title,"North");
		p_center.add(ta_content,"Center");
		p_center.add(lb_msg,"West");
		
		
		
		
		
		
		//�ϴ�
		Panel p_south =new Panel(); //Panel�� �⺻ Layout�� FlowLayout.
		this.add(p_south,"South");
		Button bt_send = new Button("������");
		Button bt_cancel = new Button("���");
		p_south.add(bt_send);
		p_south.add(bt_cancel);
		
		
	}
	
	@Override
	public Insets getInsets() {

		Insets i = new Insets(45,20,20,20);
		return i;
	}
	
	public static void main(String[] args) {
		
		MyFrame mf = new MyFrame();
		
		mf.setSize(360,300);
		mf.setVisible(true);
	}

}
