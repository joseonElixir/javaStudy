package day14;

public class TestA {
	
	static int sum = 0; //스테틱 변수 혹은 클래스변수.
	//클래스명으로 호출할 수 있기 때문에 스태틱변수와 스태틱 메소드를 클래스변수, 클래스 메소드라고 부른다.
	
	public TestA() {
		sum++;
	}
	
	public static void getInfo() { // 스테틱메소드(& class method). class명으로 호출할 수 있다.
		//스테틱 메소드 또한 독립적인 메소드가 된다.
		System.out.println("현재까지 만들어진 객체는 "+sum+"개 입니다.");
	}
	
}
