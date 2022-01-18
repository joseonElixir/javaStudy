package day22;

class TA extends Thread{
	@Override
	public void run() {
		System.out.println("������A�� ������");
		for(int i=1;i<10;i++) {
			System.out.println("6*"+i+"="+(i*6));
		}
	}
}

class TB implements Runnable{
	@Override
	public void run() {
		System.out.println("������B�� ������");
		for(int i=1;i<10;i++) {
			System.out.println("9*"+i+"="+(i*9));
		}
	
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		
		TA ta = new TA();
		TB tb = new TB(); //�̹� �ְ� �Ǵ� ���ü�� ������ ��� runnable Interface�� ��ӹ޴´�.
		Thread tc = new Thread(tb); // �� �� Thread ��ü�� �����Ͽ� ���ڰ����� Runnable�� ��ӹ��� ��ü�� �Ѱ��ش�.
		
		
		ta.start();
		tc.start();
		
		System.out.println("������ ������");
		for(int i=1;i<10;i++) {
			System.out.println("3*"+i+"="+(i*3));
		}
		
	}
	
}
