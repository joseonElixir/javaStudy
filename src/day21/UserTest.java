package day21;

class User<T>{ //���� �ȿ� T�� �������ν� ������ ���� Ÿ���� ����� ����(object)���� ���� �� ����.
				//���ο��� Ŭ������ ȣ���� �� ���׸����� ����Ÿ���� ������ �� �ִ�.
	T tmp; 
	
	
	
}

public class UserTest {

	public static void main(String[] args) {
	
		User u1 = new User();
		//u1.tmp; // ������ ������Ʈ Ÿ��
		User<String> u2 = new User<String>();
		//u2.tmp; // ������ ��Ʈ�� Ÿ��
		
	}
	
}
