package day18;

class Test{
	int a;
	public void test() {
		System.out.println("�̰��� �׽�Ʈ �޼ҵ��Դϴ�.");
	}
	
}


public class ExceptTest {

	public static void main(String[] args) {
		try {
			System.out.println("======����=======");
		Test test= null;//���������� ����� ���� �ʱ�ȭ
		test.test();
		} catch (NullPointerException e) { //NullPointerException : ������ ������ ����ִ� ���� Ŭ����.
			//���������ͼ��� Ŭ���� ������ �����Ѱ���.
			System.out.println("����ִ� ��ä�� ����Ϸ� �Ͽ���");
			//System.out.println(e);
			e.printStackTrace(); //���������� ����� �� ����.
			
		}
		System.out.println("=======��======");
	}
	
}


