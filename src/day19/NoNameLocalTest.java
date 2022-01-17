package day19;

class NoName{
	
	int num = 10;
	
	public NoName() {
		getInfo();
	}
	
	public void test() {
		System.out.println("test1() Method ok!");
	}
	public void getInfo() {
		
	}
	
	
}

public class NoNameLocalTest /*extends NoName*/{

//	@Override
//	public void getInfo() {
//	System.out.println("새로운 기능 ");
//	}
	
	public static void main(String[] args) {
		
		//NoName nn = new NoName();
		//nn.test();
		new NoName() {
			@Override
			public void getInfo() {
			System.out.println("anonymus class override method");	
			}
		}; //중괄호를 연 순간부터 NoName을 상속받은 이름없는 자식객체가 됨.
	}
	
}
