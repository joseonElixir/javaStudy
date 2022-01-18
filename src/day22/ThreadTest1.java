package day22;


class ThreadA extends Thread{ //Thread Ŭ������ ���� ��ӹޱ�.
	@Override
	public void run() {
		//run�̶�� ���� main�̶� �о��.
		Thread tmp2 = Thread.currentThread();
		setPriority(Thread.MAX_PRIORITY);
		System.out.println("tmp2"+tmp2.toString());
		//currentThread�� ��� ���� : Thread�� �ο��� �̸�(�ʱⰪ�� �ε���), �켱���� (�⺻ ��:5, �ֿ켱 : 10), ȣ���� Thread(main)
		
		System.out.println("#### TheadA�� ����####");
		
		for(int i=1;i<=10;i++) {
			System.out.println("ThreadA�� ��:"+i);
		}
		System.out.println("#### TheadA�� ��####");
	}
	
}

class ThreadB implements Runnable{// Thread Ŭ������ ���� ��� ���� �� ���� ���
								// Runnable �������̽��� ��ӹޱ�.

	@Override
	public void run() {
		System.out.println("***ThreadB�� ����****");
		for(int i=1;i<=10;i++) {
			System.out.println("ThreadB�� ��:"+i);
		}
		System.out.println("***ThreadB�� ��****");
		
		
	}

	
	
}



public class ThreadTest1 {
	
	public static void main(String[] args) {
		//main ���� ������
		//���� ������ �����
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		Thread tc = new Thread(tb);
		//Runnable �������̽��� ��ӹ��� ThreadB�� ���ڰ����� �� Thread Ŭ���������� ����
		//ThreadB�� ���������� ����.
		
		//ta.setPriority(Thread.MAX_PRIORITY);
		ta.start();
		tc.start();
		Thread tmp1 = Thread.currentThread();
		System.out.println("tmp1"+tmp1.toString());
		ta.currentThread();
//		
//		ta.setName("firstThread");
//		System.out.println("���� �����ִ� ������ ����:"+Thread.activeCount()); //����ƽ�޼ҵ�
//			
//		System.out.println("ta�� �̸� : "+ta.getName());
//		
		//ta.yield();
		//tc.yield();
		
		try {
			ta.join();
			tc.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("���� ����");
		
		for(int i =1; i<=10;i++) {
			System.out.println("���� �� : "+i);
		}
		
		System.out.println("���� ��");
		
	}

}
