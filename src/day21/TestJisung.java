package day21;

public class TestJisung {

	public static void main(String[] args) {
		
		Integer a = new Integer(10);
		
		Integer b = new Integer(20);
		System.out.println(a);
		System.out.println(b);
		Integer c = a+b;
		System.out.println(c);
		if(a==b) { // �Ѵ� Integer a = 10; ���� �Է��ϸ� Ʈ�簡, �Ѵ� new Integer(10);���� �Է��ϸ� �Ƚ��� ��.
			//�� ��� heap�� �ߺ��Ǵ� �����Ͱ� ���̴� ���� �����ϱ� ���ؼ� �������� ��ĵ�ؼ� ���� ���̸� ���� ��ġ�� �����Ѵ�.
			System.out.println("Ʈ��");
		}else {
			System.out.println("�Ƚ�");
		}
		
	}
}
