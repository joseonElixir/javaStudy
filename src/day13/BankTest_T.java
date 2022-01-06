package day13;

public class BankTest_T {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		Bank_T b1 = new Bank_T();
		
		b1.acname ="홍길동";
		b1.acnum = "111-123";
		b1.bSave(10000);
		b1.bLoad(1000);
		b1.getInfo();
		
		System.out.println("-----------------------------");
		Bank_T b2 = new Bank_T();
		b2.acname = "둘리";
		b2.acnum = "222-234";
		b2.bSave(50000);
		b2.bLoad(5000);
		b2.getInfo();
		System.out.println("-----------------------------");
		b1.bLoad(200000);
		b1.getInfo();
		System.out.println("-----------------------------");
		b1.iyul = 0.1; //static : 정적 메모리할당 키워드, 모든 객체들이 같은 값을 공유할 때 필요.
		b1.getInfo();
		b2.getInfo();
		System.out.println("-----------------------------");
		
		Bank_T.iyul = 0.1; // class이름으로 호출할 수 있다. 
		b1.getInfo();
		//b2.money=10;//money의 접근 지정자가 private이기 때문에 호출하지 못한다.
		b2.getInfo();
		
		System.out.println("프로그램 끝");
		
		
	}

}
