package day05;

import java.io.*;
public class Day05_07 {

	public static void main(String[] args) 
	throws IOException{
		
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		
		System.out.println("��� ����");
		System.out.println("������ �Է��Ͻÿ�.");
		System.out.print("���� : ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("���� : ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("���� : ");
		int mat = Integer.parseInt(br.readLine());
		
		int sum = kor + eng + mat;
		int avg = (kor + eng + mat)/3;
		
		System.out.println("���");
		System.out.println("���� : "+kor);
		System.out.println("���� : "+eng);
		System.out.println("���� : "+mat);
		System.out.println("���� : "+sum);
		System.out.println("��� : "+avg);
		System.out.print("��� : ");
		if(avg>=90) {
		System.out.println("A.");	
		}else if(avg>=80) { 
			//if������ avg>=90 �� �ƴ϶�� ������ ��� �����Ա� ������
			//���ǹ��� ����ȭ���ش�.				
			System.out.println("B.");	
			
		}else if(avg<80&&avg>=70) { //������ ��� �ڵ��
			System.out.println("C.");	
			
		}else if (avg<70&& avg>=60) {
			System.out.println("D.");	
			
		}else {
			System.out.println("F.");	
			
		}


	}

}
