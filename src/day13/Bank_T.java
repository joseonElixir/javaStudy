package day13;

public class Bank_T {

	//속성 (멤버변수)
	String acname; //멤버변수
	String acnum;
	int money;
	static double iyul = 0.07;; //static 변수 or class 변수 프로그램이 시작하는 시점에서 메모리에 올려둠.
	//즉, 메소드가 만들어지기도 전에 메모리에 올라감.(단 1회) 
	//그렇기 때문에 모든 객체들은 이 static 변수를 참조한다.
	//또한 이 static 변수를 공유한다.
	//그렇기 때문에 특정 객체에서 이 변수의 값을 바꾸면 이 static 변수의 값이 바뀌고
	//모든 객체에 적용된다.
	//또한 클래스이름으로 호출할 수 있기 때문에 클래스변수라고도 한다.
	//스테틱 변수의 경우 선언과 동시에 초기화를 해준다.
	
	
	
	
	//초기화 (생성자, 변칙 메소드)
	public Bank_T() { 
		acname = "미정";
		acnum = "000-0000";
		
		money=0;
		
	}
	
	
	//기능
	public void bSave(int m) {
		money+=m;
		System.out.println(m+"원이 입금되었습니다");
		System.out.println("잔액 : "+money);
	}
	
	public void bLoad(int money) {//지역변수와 멤버변수는 중복될 수 있다.
		
		if(money>this.money) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		this.money = this.money - money; 
		//this는 나 자신, 나의 객체, 나의 클래스, 즉 Bank를 가리킨다.
		System.out.println(money+"원이 출금되었습니다.");
		System.out.println("잔액 : "+this.money);
	}
	
	public void getInfo() {
		
		System.out.println("예금주 : "+acname);
		System.out.println("계좌번호 : "+acnum);
		System.out.println("이자율 : "+iyul);
		
		System.out.println("잔액 : "+(int)(money+(money*iyul))+"원");
		//크기가 다른 자료형끼리 계산을 하면 크기가 큰 자료형으로 형변환됨
	
	}
	
	
}
