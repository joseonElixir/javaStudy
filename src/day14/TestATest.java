package day14;

public class TestATest {

	public static void main(String[] args) {
		
		TestA t1 = new TestA();
		TestA t2 = new TestA();
		TestA t3 = new TestA();
		TestA t4 = new TestA();
		
		
		
		TestA.getInfo();
		//스테틱 메소드이기 때문에 클래스명으로 호출할 수 있다.
		t1.getInfo();
		//기본적인 변수로 호출하는 방식.
		
	}
	
}
