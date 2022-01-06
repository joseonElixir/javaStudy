package day13;

public class Bank {
	String userName; //멤버변수
	int userNum;
	private int money ;
	static double incm = 1.07; //스테틱변수(=클래스변수)는 선언과 동시에 초기화를 해준다.
	
	public Bank(){ //생성자 , 변칙메소드. 멤버변수를 초기화하는 역할.
		userName = "";
		money = 0;
		
	}
	
	//call by value.
	//
	//setter -- 반환 x 매개변수 o
	
	public void setMoney(int money) { 
		this.money= money;
	}
	
	//getter -- 반환 o 매개변수 x
	public int getMoney() {
		return this.money;
	}
	
	
	public void sBank(int getm) { 
		// 모든 동작을 멤버변수가 받아서 처리하기 때문에 굳이 리턴값을 줄 필요 없다.
		//쓸모도 없고.
		System.out.println("----------------------");
		System.out.println(getm+"원을 입금했습니다.");
		money+=getm;
		System.out.println("잔액 : "+money);
		System.out.println("----------------------");
		
		
	}
	
	public void lBank(int betm) {
		System.out.println("----------------------");
		if((money-betm)<0) {
			System.out.println("잔액이 부족합니다");
			System.out.println("잔액 : "+money);
			System.out.println("----------------------");	
			return;
		}else {
			
		System.out.println(betm+"원을 출금했습니다.");
		money-=betm;
		System.out.println("잔액 : "+money);
		System.out.println("----------------------");		
		}
	}
	
	public int getInfo(){
		System.out.println("----------------------");
		System.out.println("예금주 :\t"+ userName);
		System.out.println("계좌번호 :\t"+userNum );
		System.out.println("이자율 :\t"+(incm*100-100)+"%");
		money=(int)(money*incm); 
		//데이터 간의 연산은 데이터 타입이 큰 쪽으로 계산이 된다. 즉 int와 double을 계산하면
		//자동으로 double 타입으로 변환된다. promotion
		//즉 따로 캐스팅해줄 필요가 없다.
		System.out.println("잔액 :\t"+money);
		System.out.println("----------------------");
		return money;
	}
	
}
