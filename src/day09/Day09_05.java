package day09;

import java.io.*;

public class Day09_05 {

	public static void main(String[] args) 
	throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ ������ �Է��Ͻÿ� : ");
		
		int count = Integer.parseInt(br.readLine());
		
		int tes[]= new int[count];
		String s_tes[]= new String[count];
		int sum=0;
		int avg=0;
		for(int i = 0; i<tes.length;i++) {
			
			System.out.print((i+1)+"��° ������� �Է��Ͻÿ� :");
			s_tes[i] = br.readLine();
			System.out.print((s_tes[i])+"�� ������ �Է��Ͻÿ� :");
			tes[i]=Integer.parseInt(br.readLine());
			
			System.out.println();
			sum+=tes[i];
		}
		avg=sum/tes.length;
		
		for(int i =0;i<tes.length;i++) {
			System.out.println("�Է¹��� "+ s_tes[i] +"�� ���� : "+tes[i]);
		}
		
		System.out.println("���� : "+sum);
		System.out.println("��� : "+avg);
		
		
		
	}

}
