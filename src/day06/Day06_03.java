package day06;

import java.io.IOException;

public class Day06_03 {

	public static void main(String[] args) 
	throws IOException {
		
		for (int i=0; i < 4; i++) { 
		//i < 4�� ���ȿ� ����, for���� ����ǰ��� i+1�� ����ȴ�.
			System.out.print(i+"��° �ݺ����Դϴ�. �Է� : ");
			
			int num = System.in.read();
			System.in.skip(2);
			switch (num) {
			case '1':
				System.out.println("1���� �ԷµǾ���!");
				break;
			case '2':
				System.out.println("2���� �ԷµǾ���!");
				break;
			case '3':
				System.out.println("3���� �ԷµǾ���!");
				break;
			default:
				System.out.println("���� �� ���� �ԷµǾ���!");
				break;// if�� ������ ��� ����� �����Ű�� ��ɾ�.
			}
		}

	}

}
