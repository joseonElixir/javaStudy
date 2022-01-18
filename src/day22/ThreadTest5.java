package day22;

class ThreadTest6 extends Thread{
	
	@Override
	public void run() {
		System.out.println("###ThreadTest6 start###");
		
		for(int i=1;i<=500;i++) {
			System.out.println("ThreadTest6 값 :"+i);
		}
		System.out.println("###ThreadTest6 end###");
	}
}


public class ThreadTest5 {

	public static void main(String[] args) {
		
		//독립 Thread
		ThreadTest6 tt = new ThreadTest6();
		tt.setDaemon(true);// 이 시점부터 데몬스레드(종속 스레드)
		tt.start();
		
		//daemon Thread의 경우 주가 되는 스레드가 끝나는경우 자신의 실행 완료 여부에 상관없이 같이 끝난다.
		
		System.out.println("===메인시작===");
		for(int i=1;i<=10;i++) {
			System.out.println("main 값 :"+i);
		}
		System.out.println("===메인 끝===");
		
	}
	
}
