package day12;

public class Day12_02 {
//CallByValue ����
	public static void valueTest(int a, int b) { 
		int temp=a;
		a=b;
		b=temp;
		//stack�� �Ҵ�� valueTest ���������� a,b
		System.out.println("a="+a+", b="+b);
	}
	
	
	public static void main(String[] args) {

		int a=10;
		int b=20;
		//stack�� �Ҵ�� main ���������� a,b 
		//(valueTest�� a,b�ʹ� ����.)
		System.out.println("a:"+a+", b:"+b);
		valueTest(a,b);
		System.out.println("a:"+a+", b:"+b);
		
	}

}
