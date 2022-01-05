package day13;

public class BankTest {
	
	public static void main(String[] args) {
		
		Bank bn= new Bank(); //클래스 변수 선언, 동적메모리 할당, 생성자 호출.
		
		bn.userName="홍길동"; //멤버변수 호출
		bn.userNum = 123456; 
		bn.getInfo();
		bn.getMoney(1000);//멤버메소드 호출
		bn.betMoney(20000000);
		bn.betMoney(20000);
		bn.getInfo();
		
		
		
	}
	
	
}
