package day13;

public class Bank {
	String userName; //�������
	int userNum;
	private int money ;
	static double incm = 1.07; //����ƽ����(=Ŭ��������)�� ����� ���ÿ� �ʱ�ȭ�� ���ش�.
	
	public Bank(){ //������ , ��Ģ�޼ҵ�. ��������� �ʱ�ȭ�ϴ� ����.
		userName = "";
		money = 0;
		
	}
	
	//call by value.
	//
	//setter -- ��ȯ x �Ű����� o
	
	public void setMoney(int money) { 
		this.money= money;
	}
	
	//getter -- ��ȯ o �Ű����� x
	public int getMoney() {
		return this.money;
	}
	
	
	public void sBank(int getm) { 
		// ��� ������ ��������� �޾Ƽ� ó���ϱ� ������ ���� ���ϰ��� �� �ʿ� ����.
		//���� ����.
		System.out.println("----------------------");
		System.out.println(getm+"���� �Ա��߽��ϴ�.");
		money+=getm;
		System.out.println("�ܾ� : "+money);
		System.out.println("----------------------");
		
		
	}
	
	public void lBank(int betm) {
		System.out.println("----------------------");
		if((money-betm)<0) {
			System.out.println("�ܾ��� �����մϴ�");
			System.out.println("�ܾ� : "+money);
			System.out.println("----------------------");	
			return;
		}else {
			
		System.out.println(betm+"���� ����߽��ϴ�.");
		money-=betm;
		System.out.println("�ܾ� : "+money);
		System.out.println("----------------------");		
		}
	}
	
	public int getInfo(){
		System.out.println("----------------------");
		System.out.println("������ :\t"+ userName);
		System.out.println("���¹�ȣ :\t"+userNum );
		System.out.println("������ :\t"+(incm*100-100)+"%");
		money=(int)(money*incm); 
		//������ ���� ������ ������ Ÿ���� ū ������ ����� �ȴ�. �� int�� double�� ����ϸ�
		//�ڵ����� double Ÿ������ ��ȯ�ȴ�. promotion
		//�� ���� ĳ�������� �ʿ䰡 ����.
		System.out.println("�ܾ� :\t"+money);
		System.out.println("----------------------");
		return money;
	}
	
}
