package day08;

public class Day08_08 {

	public static void main(String[] args) {
		
		for(int j=1;j<=5;j++) {
			
			for(int i=1;i<=10;i++) {
				if(i==5)
					continue;//continue�� ������ �������� �ݺ����� �ʱ�� ���ư�.
				//�ݺ����� Ư�� ȸ������ continue�� ���� �ڵ带 �������� ����.
				System.out.println(i);
			}

		}

	}

}
