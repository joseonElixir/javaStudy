package day15;

public class Guardian extends BaseCar { // ���(����� ���)
		
	String item;
	
	//���� ������
	public Guardian(String carName, int speed, String item) {
		//super(); //��ӹ޴� �ڽ��� �����ڿ��� ������ (�ڵ����� �Ⱥ��̰�) �� super�� �ԷµǾ��ִ�.
		
		this.carName = carName;
		this.maxSpeed = speed;
		this.item = item;
	}
	
	public void getInfo() { //�������̵�. �̹� ��ӹ��� getInfo��� �޼ҵ尡 ������,
		
						//���� �̸����� �� ����� ���Ӱ� �������ؼ� �� �� �ִ�.
		super.getInfo();//��ӹ��� �޼ҵ��� ���� �ҷ��´�.
		System.out.println("������ : "+item);
	}
	
	public void getInfo(String title) { //�����ε�
		System.out.println(title);
		this.getInfo();
	}
	
	
	
	
}
