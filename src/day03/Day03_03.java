package day03;

public class Day03_03 {
	public static void main(String[] args) {

		byte num = 1;

		for (int i = 0; i < 300; i++) {

			System.out.println("num = " + num);
			num++;
		}

		int i = 1;
		int j = i++;// j�� ������ i���� 1�� ���Ե� �ڿ� i�� ++�۾��� ����.(��������������)
					
		//�� Ÿ�ֿ̹��� i= 2 j=2
		i = ((i > ++j) // i= 1, j=3 ����? ���������������̱� ������ ������ �Ŀ���.
				&&		// i > ++ j �� �������� ���ϵǴ� ���� false�̱� ������
						//�������� && �� ���� �ڵ带 �������� ����.
				(i++ == j)) ?  // ������� �ʴ� �ڵ�.
						i += j : i; //���ǽ��� false�̱� ������ �� ���� ������� �ʴ´�.
					//�ٸ� (i++ == j)�� ������� �ʴ� ������ �ٸ��ٴ� ���� ����.
		
		System.out.println("i=" + i);
		System.out.println("j=" + j);
		
		
	}
}