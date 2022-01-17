package day19;

class Outer{
	
	int a=10;
	
	public void test1() {
		System.out.println("테스트 1 메소드에서 수행됨.");
	}
	
	class Inner{ //inner member class. 
		int b = 20;
		
		public void test2() {
			System.out.println("테스트 2 메소드에서 수행됨");
		}
	}
	
	
	static class SInner{ // static inner member class
		//
		int c = 30;
		
		public void Test3() {
			System.out.println("test3 ok");
		}
		static public void test4() {
			System.out.println("test4 ok");
		}
	}
	
}




public class InnerClassTest {

	public static void main(String[] args) {
		
		Outer o = new Outer();
		System.out.println(o.a);
		o.test1();
		
		Outer.Inner oi = o.new Inner(); //이너클래스 사용하는 법. 매우 중요함.
		//non-static inner member class
		//객체가 만들어지는 시점에서 설계도가 만들어지기 때문에 할당받는 법을 잘 알아둘 것.
		System.out.println(oi.b);
		oi.test2();
		
		Outer.SInner os = new Outer.SInner();
		//static inner member class
		System.out.println(os.c);
		os.Test3();
		
		Outer.SInner.test4();
		//이미 메모리에 할당된 static inner member class static method 즉시 사용.
		
		
		
	}
	
	
	
	
	
}
