package day04;

import java.io.*;

public class Day04_09_01 {
	public static void main(String[] args)
	throws IOException{
		BufferedReader br = new BufferedReader
		(new InputStreamReader(System.in));
		
		System.out.print("���� �Է��Ͻÿ� :");
		String str = br.readLine();
		
		int i = Integer.parseInt(str);
		System.out.println("�Էµ� �� : "+i);
		System.out.println("�Էµ� ���� ���� Ÿ���̸� 2�� : "+(i+i));
		
		
	}
}
