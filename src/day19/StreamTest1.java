package day19;

public class StreamTest1 {

	public static void main(String[] args) {
		
		String str = "java";
		String str2 = "java";
		//equal�� ���� String�� ���ڿ��� �Է��ϸ�
		//heap�� ������ ��ĵ�� �� �����Ϸ��� �Ͱ� ������ ���� ������ ������
		//���ο� �޸𸮰� �ƴ� ���� ������ �ּҰ��� stack�� ���δ�.
		String str3 = new String("java");
		
		if (str.equals(str2)) {
			System.out.println("str.equals(str2) : ����");
		}else {			
			System.out.println("str==str2 : �����ʴ�");
		}
		
		if (str==str2) {
			System.out.println("str==str2 : ����");
		}else {			
			System.out.println("str==str2 : �����ʴ�");
		}
		String res = str==str3?"����":"�����ʴ�";
		System.out.println("str.equals(str3) : "+res);
		
		String res2 = str.equals(str3)?"����":"�����ʴ�";
		System.out.println("str==str3 : "+res2);
	}
	
	
}
