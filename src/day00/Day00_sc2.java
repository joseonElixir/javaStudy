package day00;

import java.util.Scanner;

public class Day00_sc2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		System.out.println("�Է¹��� �� : " + num);

		String res = "";
		//���׿������� Ȱ��
		res = num >= 0 && num < 10 ? "1�ڸ���"
			: (num >= 10 && num < 100 ? "2�ڸ���"
				: (num >= 100 && num < 1000 ? "3�ڸ���" 
					: (num >= 1000 && num < 10000 ? "4�ڸ���" : "4�ڸ��� �̻�")));

		System.out.println("�Է¹��� �� " + num + ", " + res);

	}

}
