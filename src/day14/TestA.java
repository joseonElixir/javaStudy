package day14;

public class TestA {
	
	static int sum = 0; //����ƽ ���� Ȥ�� Ŭ��������.
	//Ŭ���������� ȣ���� �� �ֱ� ������ ����ƽ������ ����ƽ �޼ҵ带 Ŭ��������, Ŭ���� �޼ҵ��� �θ���.
	
	public TestA() {
		sum++;
	}
	
	public static void getInfo() { // ����ƽ�޼ҵ�(& class method). class������ ȣ���� �� �ִ�.
		//����ƽ �޼ҵ� ���� �������� �޼ҵ尡 �ȴ�.
		System.out.println("������� ������� ��ü�� "+sum+"�� �Դϴ�.");
	}
	
}
