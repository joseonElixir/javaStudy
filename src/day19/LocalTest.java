package day19;

class Outer2 {
	String str = "###";

	public void test() {
		String str2 = "$$$";
		System.out.println("str :" + str);
		System.out.println("str2:" + str2);

		class Local {
			String str3 = "***"; // �������

			public void test2() {
				System.out.println("str3=" + str3);
				System.out.println("str="+str); //���� ǰ�� �޼ҵ��� Ŭ������ ��������� ���� ����
				System.out.println("str2="+str2);//���� ǰ�� �޼ҵ��� ���������� ���� ����
			}
		}
		
		Local lo = new Local();
		lo.test2(); //���⼭ ����Ǵ� ���� test �޼ҵ尡 ����Ǵ� ���� ���� �� �����.

	}
	
	public void test3() {
		//Local lo2 =new Local(); 
		//����Ŭ����
	}
	
	
}



public class LocalTest {

	public static void main(String[] args) {

		Outer2 o2 = new Outer2();
		o2.test();
		

	}

}
