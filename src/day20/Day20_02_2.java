package day20;

import java.util.Scanner;

public class Day20_02_2 {
//T
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] arr = {"java ������","java�� ����","�ڹ� ������","jsp ����","jsp �ʺ�"};
		
		System.out.print("�˻��� �Է� :");
		String user = sc.nextLine();
		for(int i=0; i<arr.length;i++) {
			if(arr[i].startsWith(user)) { 
				//startWith�� ��ȣ���� Ű���尡 ����ִ����� boolean������ ��ȯ�ϴ� �޼ҵ�.
				System.out.println(arr[i]);
			}
		}

	}


}
