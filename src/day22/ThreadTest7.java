package day22;

class Bank{
	
	private int money;
	
	
	synchronized public void bSave(String name, int m) {
		money = money +m;
		System.out.println(name+"�� "+m+"���� �Ա��Ͽ� "+money+"�� ���ҽ��ϴ�.");
		
	}
	synchronized public void bLoad(String name,int money) {
		if(this.money<money) {
			System.out.println("�ܾ׺���");
			return;
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.money=this.money-money;
		System.out.println(name+"�� "+money+"���� ����Ͽ� "+this.money+"�� ���ҽ��ϴ�.");
	}
	
}


class Parent extends Thread{
	
	String name;
	Bank bank; //����ȭ ���
	
	public Parent(String name, Bank b) {
		this.bank = b; // ����ȭ. (��ü�� ��¹޴´�. �����ڸ� ����� �ȵ�.)
		this.name = name;
	}
	
	@Override
	public void run() {
	
		for(int i=1;i<=5;i++) {
			int savemoney = (int)(Math.random()*5+1)*100;
			int loadmoney = (int)(Math.random()*5+1)*100;
			bank.bSave(name, savemoney);
			bank.bLoad(name, loadmoney);
		}
	
	}
}


public class ThreadTest7 {
		
	public static void main(String[] args) {
		
		Bank b = new Bank(); 
		//���⼭ ������ �� �Ѱ��� �����ڸ� ���� �Ʒ��� �ΰ��� �������� ������ ó����.
		//�װ� ���� Parent ������ Ŭ������ Bank�� ������ �Է¹�������
		//�Ѱ��� ��ü�� ���� �������� �۾��� ó���ϰԲ� ��.
		//synchronized �� ���� �������� ����ó���� �� �� �ִ�.
		//������ ���� ����
		//������ Ŭ�������� Bank Ŭ������ ����ȭ�ϴ� ��������
		//����ȭ�� �ƴ� �����ڸ� ���� ���� �ٸ� Bank Ŭ���� �޼ҵ�� ������ �Ǿ
		//����ε� ó���� ���̷������ ��.
		
		
		Parent mama = new Parent("����", b);
		Parent papa = new Parent("�ƺ�", b);
		
		mama.start();
		papa.start();
		
		
		//�����忡 ������ Ŭ������ ����ȭ�Ѵ�.
		//����ȭ �� ���� ���� �ؾ��ϸ�, �Է°����� �ش� Ŭ������ ������ �޾ƾ� �Ѵ�.
		//���࿡ �����ڸ� ���� ������ �����ϸ� ���� �ٸ� ������ ������ ���� �ٸ� ������ ��ü����
		//����� �Ǳ� ������ ���� ������ �̷����� �ʴ´�. 
		//���Ͽ����� �̷��� ��� synchronized�� ���� ���� ������ �Ͼ �� �ִ� �������
		//��������ȭ �Ѵ�. 
		
	}
	
}
