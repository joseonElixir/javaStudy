package day22;

class ThreadTest6 extends Thread{
	
	@Override
	public void run() {
		System.out.println("###ThreadTest6 start###");
		
		for(int i=1;i<=500;i++) {
			System.out.println("ThreadTest6 �� :"+i);
		}
		System.out.println("###ThreadTest6 end###");
	}
}


public class ThreadTest5 {

	public static void main(String[] args) {
		
		//���� Thread
		ThreadTest6 tt = new ThreadTest6();
		tt.setDaemon(true);// �� �������� ���󽺷���(���� ������)
		tt.start();
		
		//daemon Thread�� ��� �ְ� �Ǵ� �����尡 �����°�� �ڽ��� ���� �Ϸ� ���ο� ������� ���� ������.
		
		System.out.println("===���ν���===");
		for(int i=1;i<=10;i++) {
			System.out.println("main �� :"+i);
		}
		System.out.println("===���� ��===");
		
	}
	
}
