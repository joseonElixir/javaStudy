package day04;

import java.io.*;

public class Day04_07 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// System.in : 1byte
		// + new InputStreamReader : 2byte
		// + new BufferedReader : ���ڿ��� �Է��ϰ� ����.
		System.out.println("����� �̸��� �Է��ϼ���");
		System.out.print("�̸� : ");
		String str = br.readLine();
		System.out.println("��!" + str + " ���̽ñ���!");
		System.in.skip(100);

		// 2�ڸ����� ���
		// ��ſ� ������ ^��^
		System.out.print("���� 1 :");
		int num1 = System.in.read();
		int num2 = System.in.read();
		System.in.skip(10);
		int res = num2 == 13 || num2 == 10 ? 
			num1 - 48 : ((num1 - '0') * 10) + (num2 - 48);
		/*
		 * ���׿����ڸ� ���� num 2�� �Է¹޴� ���� 
		 * ������ ascii �ڵ尪�� \n+\r�� 13 Ȥ�� 10�� ���
		 *  ������� 1�ڸ����� �ν��ϰ� �ϰ� 
		 *  num1�� �Է¹��� �ƽ�Ű �ڵ� ���� �������� ����ȭ��Ű��
		 *  �۾��� ������
		 *  ���Ͱ��� �ƴ� �ٸ� ���� �Է¹޴� ���, num1�� 10�� �ڸ�����,
		 *  num2�� 1�� �ڸ����� ����Ͽ� �۾��� ������.
		 *  
		 */
		System.out.print("���� 2 :");
		int num3 = System.in.read();
		int num4 = System.in.read();
		System.in.skip(10);
		int res2 = num4 == 13 || num4 == 10 ?
			num3 - 48 : ((num3 - 48) * 10) + (num4 - 48);
		int sum = res + res2;

		System.out.println(res + "+" + res2 + "=" + sum);

	}
}
