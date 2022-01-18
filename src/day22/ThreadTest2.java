package day22;

class TA extends Thread{
	@Override
	public void run() {
		System.out.println("쓰레드A의 구구단");
		for(int i=1;i<10;i++) {
			System.out.println("6*"+i+"="+(i*6));
		}
	}
}

class TB implements Runnable{
	@Override
	public void run() {
		System.out.println("쓰레드B의 구구단");
		for(int i=1;i<10;i++) {
			System.out.println("9*"+i+"="+(i*9));
		}
	
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		
		TA ta = new TA();
		TB tb = new TB(); //이미 주가 되는 상속체가 존재할 경우 runnable Interface를 상속받는다.
		Thread tc = new Thread(tb); // 그 후 Thread 객체를 생성하여 인자값으로 Runnable을 상속받은 객체를 넘겨준다.
		
		
		ta.start();
		tc.start();
		
		System.out.println("메인의 구구단");
		for(int i=1;i<10;i++) {
			System.out.println("3*"+i+"="+(i*3));
		}
		
	}
	
}
