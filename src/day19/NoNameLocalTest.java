package day19;

class NoName{
	
	int num = 10;
	
	public NoName() {
		getInfo();
	}
	
	public void test() {
		System.out.println("test1() Method ok!");
	}
	public void getInfo() {
		
	}
	
	
}

public class NoNameLocalTest /*extends NoName*/{

//	@Override
//	public void getInfo() {
//	System.out.println("���ο� ��� ");
//	}
	
	public static void main(String[] args) {
		
		//NoName nn = new NoName();
		//nn.test();
		new NoName() {
			@Override
			public void getInfo() {
			System.out.println("anonymus class override method");	
			}
		}; //�߰�ȣ�� �� �������� NoName�� ��ӹ��� �̸����� �ڽİ�ü�� ��.
	}
	
}
