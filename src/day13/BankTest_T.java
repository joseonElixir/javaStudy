package day13;

public class BankTest_T {

	public static void main(String[] args) {
		
		System.out.println("���α׷� ����");
		
		Bank_T b1 = new Bank_T();
		
		b1.acname ="ȫ�浿";
		b1.acnum = "111-123";
		b1.bSave(10000);
		b1.bLoad(1000);
		b1.getInfo();
		
		System.out.println("-----------------------------");
		Bank_T b2 = new Bank_T();
		b2.acname = "�Ѹ�";
		b2.acnum = "222-234";
		b2.bSave(50000);
		b2.bLoad(5000);
		b2.getInfo();
		System.out.println("-----------------------------");
		b1.bLoad(200000);
		b1.getInfo();
		System.out.println("-----------------------------");
		b1.iyul = 0.1; //static : ���� �޸��Ҵ� Ű����, ��� ��ü���� ���� ���� ������ �� �ʿ�.
		b1.getInfo();
		b2.getInfo();
		System.out.println("-----------------------------");
		
		Bank_T.iyul = 0.1; // class�̸����� ȣ���� �� �ִ�. 
		b1.getInfo();
		//b2.money=10;//money�� ���� �����ڰ� private�̱� ������ ȣ������ ���Ѵ�.
		b2.getInfo();
		
		System.out.println("���α׷� ��");
		
		
	}

}
