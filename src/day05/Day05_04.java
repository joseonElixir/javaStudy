package day05;

import java.io.*;

public class Day05_04 {

	public static void main(String[] args) 
	throws IOException{
		
		System.out.print("ù��° �� :");
		int num1 = System.in.read()-48;
		System.in.skip(2);
		System.out.print("�ι�° ��:");
		int num2 = System.in.read()-'0';
		
		if(num1>num2) {
			System.out.println("ù��° ���� ū ��. �� : " +num1);
		
		}else {
			System.out.println("�ι�° ���� ū ��. �� : "+num2);
			
			
		}
		
		
		

	}

}
