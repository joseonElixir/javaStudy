package day14;

public class Year {

	private int year;

	public Year() { // ������ �����ε带 �� ��쿡 �⺻�����ڸ� �ۼ����� ���� ��쿡
		// ���� �Է¹޴� �����ڰ� �⺻ �����ڰ� ��. �׷��� ������ �⺻ �����ڸ� �����
		// �� �Ŀ� �����ε带 ����� ��.
		year = 0;
	}

	public Year(int year) { // ������ �����ε�
		this();
		this.year = year;
	}

	public void getInfo() {
		if ((year % 4 != 0 || year % 100 == 0) && year % 400 != 0) {
			System.out.println(year + "���� ����Դϴ�.");
		} else {
			System.out.println(year + "���� �����Դϴ�.");
		}
	}

	public void getInfo(int year) { // �޼ҵ� �����ε�
		this.year = year;
		this.getInfo();
	}

}
