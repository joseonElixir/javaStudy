package day19;

class Outer{
	
	int a=10;
	
	public void test1() {
		System.out.println("�׽�Ʈ 1 �޼ҵ忡�� �����.");
	}
	
	class Inner{ //inner member class. 
		int b = 20;
		
		public void test2() {
			System.out.println("�׽�Ʈ 2 �޼ҵ忡�� �����");
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
		
		Outer.Inner oi = o.new Inner(); //�̳�Ŭ���� ����ϴ� ��. �ſ� �߿���.
		//non-static inner member class
		//��ü�� ��������� �������� ���赵�� ��������� ������ �Ҵ�޴� ���� �� �˾Ƶ� ��.
		System.out.println(oi.b);
		oi.test2();
		
		Outer.SInner os = new Outer.SInner();
		//static inner member class
		System.out.println(os.c);
		os.Test3();
		
		Outer.SInner.test4();
		//�̹� �޸𸮿� �Ҵ�� static inner member class static method ��� ���.
		
		
		
	}
	
	
	
	
	
}
