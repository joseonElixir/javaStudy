package day04;

import java.io.*;

public class Day04_09_02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�̸�:");
		String name = br.readLine();
		System.out.print("����:");
		String age = br.readLine();
		//int num1 = Integer.parseInt(br.readLine());
		//�� ���� ��Ʈ�� �ʱ�ȭȭ ���ÿ� �Է¹��� ���� ����ȯ�ؼ� ������ ������ �� �ִ�.
		System.out.print("���� 1 :");
		String snum1 = br.readLine();
		System.out.print("���� 2 :");
		String snum2 = br.readLine();
		System.out.print("���� 3 :");
		String snum3 = br.readLine();

		int num1 = Integer.parseInt(snum1);
		int num2 = Integer.parseInt(snum2);
		int num3 = Integer.parseInt(snum3);

		int sum = num1 + num2 + num3;
		int avg = (num1 + num2 + num3) / 3;
		System.out.println("���� ����");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("");
		System.out.println("���� 1 : " + num1);
		System.out.println("���� 2 : " + num2);
		System.out.println("���� 3 : " + num3);
		System.out.println("��� : " + avg);
		System.out.println("���� : " + sum);

	}

}
