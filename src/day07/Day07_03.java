package day07;

import java.io.*;

public class Day07_03 {

	public static void main(String[] args) 
	throws IOException {

		BufferedReader br = new BufferedReader
		(new InputStreamReader(System.in));

		System.out.print("���� �Է� :");
		int num = Integer.parseInt(br.readLine());
		int fec = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				fec++;
				System.out.println(num + "%" + i + "==" + (num % i));
				// for���� ������ (i=2; i<num ; i++) �� �ְ� 
				//if���� ���ǿ� �����ϸ� 
				//System.ou.println(num+"�� �Ҽ��� �ƴմϴ�"); �� �˸� ��
				//System.exit(0);���� �ý����� �����ϴ� ��ĵ� �ִ�.
				//Ȥ�� for���� i�� for�� ������ ����
				//���� ���ǿ��� break;�� �������� �� if(num==i)�� �Ҽ��� �ִ� ����� �ִ�. 
				//�̸� ���� ���ԵǴ� ������ ���ʿ��� ������ ���� �� �ִٴ� ���̴�.
			}
		}

		if (fec == 2) {
			System.out.println(num + "�� �Ҽ��Դϴ�.");
		} else {
			System.out.println(num + "�� �Ҽ��� �ƴմϴ�.");
		}

	}

}
