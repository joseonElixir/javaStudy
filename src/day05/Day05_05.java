package day05;

import java.io.IOException;

public class Day05_05 {

	public static void main(String[] args) 
	throws IOException{
		
		System.out.print("���� �Է� :");
		int num1 = System.in.read()-'0';
		
		if(num1!=0 && num1%2==0) { //%�� �����ڵ�(2���� ���)�� ���Ҷ� ���.
			System.out.println("�� ���� ¦���Դϴ�.");
			
		}else if(num1!=0 && num1%2==1){
			System.out.println("�� ���� Ȧ���Դϴ�.");
		}
		System.in.skip(2);
		//���׿����ڷ� �Ȱ��� �� ���.
		System.out.print("���� �Է� :");
		int num2 = System.in.read()-'0';
		
		String st=""; 
		st = num2%2==0 ? "�� ���� ¦���Դϴ�." : "�� ���� Ȧ���Դϴ�." ;
		System.out.println(st);
		
	}

}
