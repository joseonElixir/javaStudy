package day16;
//final + class : ��ӱ���. ��, ������ Ŭ����.
//final + method : �������̵�(������) ����.
//final + variable :  ������ �������.
class Super{
	
	public static final int NUMBER=10; //����� ��� ��Ģ�� �빮��.
	//����� ��� �빮�ڷ� ǥ���ϸ� �ٲ�� �ȵǹǷ� static final�� �����Ѵ�.
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
		System.out.println("Sub���� �������� Test Method");
		
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
