package day13;

public class BankTest {
	
	public static void main(String[] args) {
		
		Bank bn= new Bank(); //Ŭ���� ���� ����, �����޸� �Ҵ�, ������ ȣ��.
		
		bn.userName="ȫ�浿"; //������� ȣ��
		bn.userNum = 123456; 
		bn.getInfo();
		bn.sBank(1000);//����޼ҵ� ȣ��
		bn.lBank(20000000);
		bn.lBank(20000);
		bn.getInfo();
		
		
		
	}
	
	
}
