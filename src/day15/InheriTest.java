package day15;

class Super{
	
	int a=10;
	double b=20.2; //�׽�Ʈ�� ��������� ���ÿ� �ʱ�ȭ.
				//��Ģ�� �����ڸ� ���ؼ� �ʱ�ȭ.
				//�̷��� �ϴ°� ����ƽ������ �� �� �ִ�.
	
	public void test() {
		System.out.println("test()�޼ҵ� �����.");
	
	}
}

class Sub extends Super{
	int a=100;
	int c=30;
	
	public void test2() {
		System.out.println("test2()�޼ҵ� �����.");
	}

	public void test()	{//�������̵� 
		System.out.println("test()�޼ҵ� ������.");
		System.out.println("c="+c);
	}


}


//


public class InheriTest {

	public static void main(String[] args) {
	
		
		Sub sb = new Sub();
		sb.test2();
		sb.test();
		
		System.out.println("sb.c : "+ sb.c);
		System.out.println("sb.b : "+sb.b);
		System.out.println("sb.a : "+sb.a); // Sub�� a�� ȣ���.
		
		//�θ��� �̸����� �ڽ��� ����.
		Super sp = new Sub(); 
		//��ø ������ �θ��� ��, ��ø �޼ҵ�� �����ε�� ��.
		
		System.out.println("sp.a :" +sp.a); //Super�� a�� ȣ���.
		System.out.println("sp.b :" +sp.b);
		//System.out.println("sp.c : "+sp.c);
		//�ڽİ����� �θ�ü�� �̸��� ��ø�Ǵ� ���������� ���� ����.
		sp.test();
		Sub sb2 = (Sub)sp; //ĳ����; 
		//
		System.out.println("sb2.c : "+sb2.c);
		sb2.test(); 
		sp.test(); 
		
		System.out.println(sp);
		System.out.println(sb2);
		
		
		
		
		
		
//		Super sp= new Super();
//		System.out.println("a :"+sp.a);
//		System.out.println("b :"+sp.b);
//		sp.test();
//		Super arr[] = new Super[3];
//		//arr[1].test(); //NullPointerEXception.
//		
//		arr[0] = new Super();
//		arr[1] = new Super();
//		arr[2] = new Super();
//		arr[1].test();
//		
//		Sub arr2[] = new Sub[30]; //��ü�迭�� �����Ͱ� ����(null) ������ ����� ����.
//		
//		for(int i=0; i<arr2.length;i++) {
//			arr2[i]= new Sub();
//		}//�迭�� �迭�̱�.. ���ÿ� �ּҰ��� �����ϰ�, ������ �����͸� �־��ش�.
//		// ��� ���۷���Ÿ���� ���Ⱚ�� null�̱� ������ �ʱ�ȭ�� �������.
//		
//		
//		arr2[20].test2();;
//		
		
	}
	
}
