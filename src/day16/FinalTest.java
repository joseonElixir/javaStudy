package day16;
//final + class : 상속금지. 즉, 독립적 클래스.
//final + method : 오버라이딩(재정의) 금지.
//final + variable :  변수의 상수선언.
class Super{
	
	public static final int NUMBER=10; //상수의 명명 규칙은 대문자.
	//상수는 모두 대문자로 표기하며 바뀌면 안되므로 static final로 선언한다.
	public void test() {
		System.out.println("Test Method");
	}
	
}

class Sub extends Super{
	
	int b = 20;
	public void test2() {
		System.out.println("Test Method 2 ");
	}
	
	public void test() {
		System.out.println("a="+NUMBER);
		//NUMBER = 30;
		System.out.println("a="+NUMBER);
		System.out.println("Sub에서 재정의한 Test Method");
		
	}
	
}



public class FinalTest {

	public static void main(String[] args) {
	
		Super sp = new Super();
		System.out.println("sp.a = "+sp.NUMBER);
		sp.test();
		
		Sub sb = new Sub();
		System.out.println("sb.b = "+sb.b);
		sb.test2();
		sb.test();
		
		
		
	}
	
}
