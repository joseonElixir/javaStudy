package day13;

public class BankTest {
	
	public static void main(String[] args) {
		
		Bank bn= new Bank(); //Ŭ���� ���� ����, �����޸� �Ҵ�, ������ ȣ��.
		
		bn.userName="ȫ�浿"; //������� ȣ��
		bn.userNum = 123456; 
		bn.getInfo();
		bn.getMoney(1000);//����޼ҵ� ȣ��
		bn.betMoney(20000000);
		bn.betMoney(20000);
		bn.getInfo();
		
		
		
	}
	
	
}
