package day07;

import java.io.*;

public class Day07_04 {

	public static void main(String[] args) throws IOException {
		int sum =0; //for���� ���� ���� ���� ���� ����Ǵ� ���ú���
		
		for (int i = 1; i <= 10; i++) {
			if (i!= 1) {// ������ 1ȸ�� + ��ȣ�� ǥ������ �ʱ� ���� 

				if (i % 2 == 0) {
					sum -= i; 
					System.out.print("-");
				} else {
					sum += i; //���� if���� ���� �߻��ϴ� ����.
					System.out.print("+");
				}
			} else { // �װ��� ������ ��.
				sum+=1; // for���� 1ȸ������ ��ȣ�� �ȱ׸��� ���� �� �ٱ� if������ �߻���
				//���� ���� ����.
			}
			System.out.print(i); //
		}
		
		System.out.println("=" + sum);
	}

}
