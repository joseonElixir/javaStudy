package day22;

class Bank{
	
	private int money;
	
	
	synchronized public void bSave(String name, int m) {
		money = money +m;
		System.out.println(name+"가 "+m+"원을 입금하여 "+money+"원 남았습니다.");
		
	}
	synchronized public void bLoad(String name,int money) {
		if(this.money<money) {
			System.out.println("잔액부족");
			return;
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.money=this.money-money;
		System.out.println(name+"가 "+money+"원을 출금하여 "+this.money+"원 남았습니다.");
	}
	
}


class Parent extends Thread{
	
	String name;
	Bank bank; //동기화 대상
	
	public Parent(String name, Bank b) {
		this.bank = b; // 동기화. (객체를 계승받는다. 생성자를 만들면 안됨.)
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
		//여기서 생성된 단 한개의 생성자를 통해 아래의 두개의 스레드의 연산이 처리됨.
		//그걸 위해 Parent 스레드 클래스에 Bank의 변수를 입력받음으로
		//한개의 객체가 여러 스레드의 작업을 처리하게끔 함.
		//synchronized 를 통해 순차적인 연산처리를 할 수 있다.
		//에러가 났던 이유
		//스레드 클래스에서 Bank 클래스를 동기화하는 과정에서
		//동기화가 아닌 생성자를 통해 서로 다른 Bank 클래스 메소드로 연산이 되어서
		//제대로된 처리가 안이루어졌던 것.
		
		
		Parent mama = new Parent("엄마", b);
		Parent papa = new Parent("아빠", b);
		
		mama.start();
		papa.start();
		
		
		//스레드에 연산자 클래스를 동기화한다.
		//동기화 시 변수 선언만 해야하며, 입력값으로 해당 클래스의 변수를 받아야 한다.
		//만약에 생성자를 통해 변수를 생성하면 서로 다른 스래드 변수가 서로 다른 연산자 객체에서
		//계산이 되기 때문에 단일 연산이 이뤄지지 않는다. 
		//단일연산이 이뤄질 경우 synchronized를 통해 값의 오류가 일어날 수 있는 연산들을
		//순차연산화 한다. 
		
	}
	
}
