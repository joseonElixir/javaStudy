package day12;

import java.io.*;

public class Day12_06 {

	public static int[] getLotto() {
		int lot[] = new int[6];
		for (int i = 0; i < lot.length; i++) {
			lot[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (lot[i] == lot[j]) {
					i--;
				}
			}
		}
		return lot;
	}

	public static int cal(int num1, int num2, char add) {
		//����� ������ �ڵ��� �и�ȭ.
		
		// ==��ȣ�δ� ���ڿ��� ���� �� ����.

		// String ad="";
		// ad.equals("+"); //���ڿ��� ���ϴ� ���.
		//switch case���� ���°� ȿ�����̴�.
		//�����ؾ� �ϴ� ���� ��Ȯ�� ��.
		double result =0;
		
		switch(add) {
		case '+':
			result = num1+num2;
			System.out.print(num1 + " + " + num2 + " = " + result);
			break;
		case '-':
			result = num1-num2;
			System.out.print(num1 + " - " + num2 + " = " + result);
			break;
		case '*':
			result = num1*num2;
			System.out.print(num1 + " * " + num2 + " = " + result);
			break;
		case '/':
			result = (double)num1/(double)num2;
			System.out.print(num1 + " / " + num2 + " = " + result);
			break;
			
		}
		
		return (int)result;
		
//		if (add == '+') {
//			System.out.print(num1 + " + " + num2 + " = " + (num1 + num2));
//		} else if (add == '-') {
//			System.out.print(num1 + " - " + num2 + " = " + (num1 - num2));
//		} else if (add == '*') {
//			System.out.print(num1 + " * " + num2 + " = " + (num1 * num2));
//		} else if (add == '/') {
//			System.out.print(num1 + " / " + num2 + " = " + ((double) num1 / (double) num2));
//
//		} else {
//
//		}

	}

	public static void main(String[] args) throws IOException {
		// �޼ҵ��� ����.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a[] = getLotto();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println();
		System.out.println("��Ģ����");
		System.out.print("ù��° ���� :");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("�ι�° ���� :");
		int num2 = Integer.parseInt(br.readLine());
		System.out.print("������ :");
		char cul = (char) br.read();
		//char cul = (char) System.in.read();
		System.in.skip(2);

		cal(num1, num2, cul);
		System.out.println();
		// System.out.println("�� : "+num1+(char)cal+num2+"");
		// System.out.println("����"+1+2);
		// System.out.println(1+2);
		// System.out.println�� Ư¡�� ���ڿ��� ����ϱ� ���� ���������.
		// �׷��� ������ �տ� ���ڿ��� ������� �ʰ� ������ ����� ��� ����� �ع���.
		// ���ڿ��� ����Ǹ� ���� ������ ���� ���ڷ� �ν��ؼ� ����� ���� ����.
		// �װ� ���� ���ؼ� ��ȣ�� ģ��.
		// �⺻�� �߿伺.

		
		
		
	}

}
