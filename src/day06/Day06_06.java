package day06;

public class Day06_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;

		for (int count = 0; count <= 50; count++) {
			// 5�� ����� ã�°Ŵϱ� ���ʿ� ����ġ�� count+=5�� �ϴ� ��ĵ� ����.
			// ���������� count�� for���� ���� ������ ������ �����.
			if (count % 5 == 0) {
				sum += count; // fiv= fiv+count;
				System.out.println("5�� ��� :" + count);
			}
		}
		System.out.println("50������ �� �߿� 5�� ����� �� : " + sum);
	}

}
