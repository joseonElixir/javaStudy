package day00;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day00_ex01 {

	public static void main(String[] args) 
	throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));

		System.out.println("��� ����� �Է��Ͻÿ�.");
		System.out.println("1.���� 2.���� 3.���� 4.������");
		System.out.print("�Է� : ");
		int cal = Integer.parseInt(br.readLine());

		System.out.print("����� ���� �Է� : ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = Integer.parseInt(br.readLine());

		if (cal == 1) {
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		} else if (cal == 2) {
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));

		} else if (cal == 3) {
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));

		} else if (cal == 4) {
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));

		} else {
			System.out.println("�߸��� �Է��Դϴ�.");

		}

	}

}
