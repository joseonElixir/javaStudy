package day09;

import java.io.*;

public class Day09_06 {

	public static void main(String[] args) 
	throws IOException{
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tes[]=new int[5];
		int temp= 0;
		for(int i=0;i<tes.length;i++) {
		//	System.out.print((i+1)+"��° ������ �Է��Ͻÿ� : ");
			tes[i]  = (int)(Math.random()*50+50);
		}
		
		System.out.println();
		
		for(int i =0; i<tes.length;i++) {
			System.out.println("�Է¹��� "+(i+1)+"��° ���� : "+tes[i]);
		}
		
		System.out.println();
		for(int j=0; j<tes.length;j++) {//�� ����ڸ� ���ϴ� ����. 0���� ����.
			
			for(int i = 1; i<tes.length;i++) { //�� ����ڸ� ���ϴ� ����. 1���� ����.
				if(j<i&&tes[j]<tes[i]) { //�� ����ڴ� �׻� �� ����ں��� �۾ƾ��Ѵ�.
					temp=tes[j]; 
					//temp�� tes j �� ���� �� temp�� tes j�� �ֵ��� ����.
					tes[j]=tes[i]; 
					//tes j �� tes i�� ����. tes j�� tes i �� �ֵ��� ����.
					//���� tes j�� �ּҰ��� temp�� �����ִ� ��Ȳ.
					tes[i]=temp;
					//temp�� ����� ���� tes j�� �ּҰ��� tes i �� ������.
					
				}
				
			}
			
		}
		
		
		System.out.println();
		System.out.println("�������� ����");
		for(int i=0;i<tes.length;i++) {
			System.out.println("����"+(i+1)+":" +tes[i]);
			
		}
		
	}

}
