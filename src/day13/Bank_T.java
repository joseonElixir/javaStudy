package day13;

public class Bank_T {

	//�Ӽ� (�������)
	String acname; //�������
	String acnum;
	int money;
	static double iyul = 0.07;; //static ���� or class ���� ���α׷��� �����ϴ� �������� �޸𸮿� �÷���.
	//��, �޼ҵ尡 ��������⵵ ���� �޸𸮿� �ö�.(�� 1ȸ) 
	//�׷��� ������ ��� ��ü���� �� static ������ �����Ѵ�.
	//���� �� static ������ �����Ѵ�.
	//�׷��� ������ Ư�� ��ü���� �� ������ ���� �ٲٸ� �� static ������ ���� �ٲ��
	//��� ��ü�� ����ȴ�.
	//���� Ŭ�����̸����� ȣ���� �� �ֱ� ������ Ŭ����������� �Ѵ�.
	//����ƽ ������ ��� ����� ���ÿ� �ʱ�ȭ�� ���ش�.
	
	
	
	
	//�ʱ�ȭ (������, ��Ģ �޼ҵ�)
	public Bank_T() { 
		acname = "����";
		acnum = "000-0000";
		
		money=0;
		
	}
	
	
	//���
	public void bSave(int m) {
		money+=m;
		System.out.println(m+"���� �ԱݵǾ����ϴ�");
		System.out.println("�ܾ� : "+money);
	}
	
	public void bLoad(int money) {//���������� ��������� �ߺ��� �� �ִ�.
		
		if(money>this.money) {
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
		this.money = this.money - money; 
		//this�� �� �ڽ�, ���� ��ü, ���� Ŭ����, �� Bank�� ����Ų��.
		System.out.println(money+"���� ��ݵǾ����ϴ�.");
		System.out.println("�ܾ� : "+this.money);
	}
	
	public void getInfo() {
		
		System.out.println("������ : "+acname);
		System.out.println("���¹�ȣ : "+acnum);
		System.out.println("������ : "+iyul);
		
		System.out.println("�ܾ� : "+(int)(money+(money*iyul))+"��");
		//ũ�Ⱑ �ٸ� �ڷ������� ����� �ϸ� ũ�Ⱑ ū �ڷ������� ����ȯ��
	
	}
	
	
}
