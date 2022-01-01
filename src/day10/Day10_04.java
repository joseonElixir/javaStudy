package day10;

import java.io.*;

public class Day10_04 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));

		int stu[][] = new int[5][5];
		for (int i = 0; i < stu.length; i++) { // �׷�(��)�� ���� for
			int sum = 0;
			int avg = 0;
			for (int j = 0; j < stu[i].length; j++) { // ������(��)�� ���� for
				// ������ length -2�� ���� �� �ִ�.
				// �� �� �Ʒ��� ��ü if���� �����(������ length-2�� 3�̱� ����)
				// stu[i][3] = sum
				// stu[i][4] = avg �� �ָ� �ȴ�.(j�� ���� ��� �̷��� ����������)

				if (j < 3) {
					System.out.println("�л� "+(i+1)+"�� "+(j+1)+"��° ������ �Է��Ͻÿ�");
					System.out.print("> ");
					stu[i][j] = (int) (Math.random() * 60 + 40);
					// Integer.parseInt(br.readLine());
					System.out.println();
					sum += stu[i][j];
					//arr[i][3]+=arr[i][j]; //�̷��� ������ �� �ִ�.
					//�׾߸��� ����.
					avg = sum / 3;
				} else if (j == 3) {
					stu[i][j] = sum;
				} else if (j == 4) {
					stu[i][j] = avg;
				}
			}
			//arr[i][4]=arr[i][3]/3; 
			//�̷��� ������ �Էµ� ���� ������ �Է��� �� �ִ�.
			System.out.println();

		} // for 1 2�����迭�� ���� �Է�, �հ�� ��� ����.
			// stu[n][3]==sum
			// stu[n][4]==avg

		for (int i = 0; i < stu.length; i++) {
			System.out.println("�л�" + (i + 1));
			for (int j = 0; j < stu[i].length; j++) {
				if (0 <= j && j <= 2) {
					System.out.print("���� " + (j + 1) + ": ");
				} else if (j == 3) {
					System.out.print("�հ� : ");
				} else {
					System.out.print("��� : ");
				}
				System.out.print(stu[i][j] + "  ");
			}

			System.out.println();
		} // for end. ���
		System.out.println();

		for (int i = 0; i < stu.length - 1; i++) {//�� �����
			for (int j = i + 1; j < stu.length; j++) {//�� �����
				if (stu[i][4] < stu[j][4]) {
					int temp[] = stu[i]; // int[] temp��� �ᵵ��.
					stu[i] = stu[j];
					stu[j] = temp;
				}
			}
		} // for end. avg ���� �������� ����.

		System.out.println("�������� ����");

		for (int i = 0; i < stu.length; i++) {
			System.out.println("�л�" + (i + 1));
			for (int j = 0; j < stu[i].length; j++) {
				if (0 <= j && j <= 2) {
					System.out.print("���� " + (j + 1) + ": ");
				} else if (j == 3) {
					System.out.print("�հ� : ");
				} else {
					System.out.print("��� : ");
				}
				System.out.print(stu[i][j] + "  ");
			}

			System.out.println();
		}

	}

}
