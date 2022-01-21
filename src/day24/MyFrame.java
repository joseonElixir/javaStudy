package day24;
import java.awt.*;
public class MyFrame extends Frame{
	
	public MyFrame() {
		super("메세지 보내기"); // 타이틀을 입력받는 생성자를 호출
		
		BorderLayout  bl = new BorderLayout(5,5);
		this.setLayout(bl); //프레임 영역을 세분화하기 위해서 BorderLayout으로 영역을 나눈다.
		
		//상단
		Panel p_north = new Panel(new GridLayout(2,2,5,5)); 
		//상단의 영역을 세분화하기 위해서 gridLayout으로 영역을 나눈다.
		this.add(p_north,"North");
		Label lb_from = new Label("보내는 이",Label.LEFT);
		Label lb_to = new Label("받는 이",Label.LEFT);
		TextField tx_from = new TextField();
		TextField tx_to = new TextField();
		p_north.add(lb_from); p_north.add(tx_from);
		p_north.add(lb_to); p_north.add(tx_to);
		
		//중단
		Panel p_center = new Panel(new BorderLayout(5,5));
		//중단읭 영역을 세분화하기 위해서 BorderLayout으로 영역을 나눈다.
		this.add(p_center);
		Label lb_title= new Label("아래에 메시지를 작성하시오.",Label.CENTER);//alignment를 Center로 잡아준다.
		Label lb_msg = new Label("메시지");
		TextArea ta_content = new TextArea();
		p_center.add(lb_title,"North");
		p_center.add(ta_content,"Center");
		p_center.add(lb_msg,"West");
		
		
		
		
		
		
		//하단
		Panel p_south =new Panel(); //Panel의 기본 Layout은 FlowLayout.
		this.add(p_south,"South");
		Button bt_send = new Button("보내기");
		Button bt_cancel = new Button("취소");
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
