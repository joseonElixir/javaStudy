package day18;

public class ExceptTest2 {

	public static void main(String[] args) {
		System.out.println("����");
		try {
			
			String fruit[] = {"���", "��", "����", "����"};
			
			for(int i =0; i<=fruit.length;i++) {
				System.out.println(fruit[i]);
			}
		}catch(Exception e) {
			e.printStackTrace();//���ܻ��� ���
			System.out.println(e);
			System.out.println("���� �ʰ�");
		}
		
		
		System.out.println("��");
		
	}
	
}
