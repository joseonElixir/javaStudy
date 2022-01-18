package day22;


class ThreadA extends Thread{ //Thread 클래스를 직접 상속받기.
	@Override
	public void run() {
		//run이라고 쓰고 main이라 읽어라.
		Thread tmp2 = Thread.currentThread();
		setPriority(Thread.MAX_PRIORITY);
		System.out.println("tmp2"+tmp2.toString());
		//currentThread의 출력 내용 : Thread에 부여된 이름(초기값은 인덱스), 우선순위 (기본 값:5, 최우선 : 10), 호출한 Thread(main)
		
		System.out.println("#### TheadA의 시작####");
		
		for(int i=1;i<=10;i++) {
			System.out.println("ThreadA의 값:"+i);
		}
		System.out.println("#### TheadA의 끝####");
	}
	
}

class ThreadB implements Runnable{// Thread 클래스를 직접 상속 받을 수 없는 경우
								// Runnable 인터페이스를 상속받기.

	@Override
	public void run() {
		System.out.println("***ThreadB의 시작****");
		for(int i=1;i<=10;i++) {
			System.out.println("ThreadB의 값:"+i);
		}
		System.out.println("***ThreadB의 끝****");
		
		
	}

	
	
}



public class ThreadTest1 {
	
	public static void main(String[] args) {
		//main 단일 스레드
		//다중 쓰레드 만들기
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		Thread tc = new Thread(tb);
		//Runnable 인터페이스를 상속받은 ThreadB를 인자값으로 한 Thread 클래스변수를 통해
		//ThreadB를 간접적으로 접근.
		
		//ta.setPriority(Thread.MAX_PRIORITY);
		ta.start();
		tc.start();
		Thread tmp1 = Thread.currentThread();
		System.out.println("tmp1"+tmp1.toString());
		ta.currentThread();
//		
//		ta.setName("firstThread");
//		System.out.println("현재 돌고있는 스레드 개수:"+Thread.activeCount()); //스태틱메소드
//			
//		System.out.println("ta의 이름 : "+ta.getName());
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
		
		
		
		
		System.out.println("메인 시작");
		
		for(int i =1; i<=10;i++) {
			System.out.println("메인 값 : "+i);
		}
		
		System.out.println("메인 끝");
		
	}

}
