package day08;

import java.io.*;

public class Day08_05 {

	public static void main(String[] args) throws IOException {

		while (true) {

			System.out.println("=���� �Է� â= ");
			int user = 0;
			do {// �ϴ� �ѹ��̶� ������ �ڵ带 ���´�.
				System.out.print("���� �Է� (���� : 0) : ");
				user = System.in.read();
				System.in.skip(2);// enter�� ���� �޸� ��ŵ
			} while (!(48<=user && user<=57)); 
			// user�� 48~57 ���̿� �ִٴ� ���� 48<user<57�� ���ؼ� ���������� ������.
			// ���ǰ��� �־ ��ȿ�� �˻縦 �Ѵ�.
			// �� ���� �����ڸ� ���� ������ ������ false�� ��´�.
			//user�� 48~57�϶� true�� ��ȯ�ϴ� �Ŀ� �������� �ؼ�
			//���ڰ� �ԷµǸ� false�� ��ȯ�ϰ� �Ѵ�. = do while���� ���.
			//
			
			if (user == '0') {
				System.out.println("���α׷� ����.");
				System.exit(0);
				
			}

			System.out.println("�Է��� ���ڴ� " + (char) user + "�Դϴ�.");

		}

	}

}
