package day00;

import java.io.*;

public class Day00_arr03 {

	public static void main(String[] args) 
	throws IOException{
		// ¦�� Ȧ�� ������ ������ �տ��� ¦�� ��������, �ڿ��� Ȧ�� ��������.
		
		int num[] = new int[20];
		int temp=0;
		
		for(int i=0;i<num.length;i++) {
			num[i]=(int)(Math.random()*100);
		}
		
		for(int i=0; i<num.length-1;i++) {
			for(int j=1;j<num.length;j++) {
				if(i<j&& num[j]%2==0) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}//if�� ��
				
			}//�ڽ� for�� ��
			
		}//�θ� for�� ��
		
		for(int i = 0;i<num.length;i++) {
			for(int j=1;j<num.length;j++) {
				if((i<j)&&
						((num[i]%2==0&&num[j]%2==0)||(num[i]%2==1&&num[j]%2==1))
							&&(num[i]<num[j])) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
				
			}//�ڽ�for�� ��
		}//�θ� for�� ��
		temp=0;
		for(int i=0; i<num.length;i++) {
			if(num[i]%2==0) {
				System.out.print("¦��");				
			}else {
				temp++;
				if(temp==1) {
					System.out.println();
				}
				System.out.print("Ȧ��");
			}
			
			System.out.println(num[i]);
			
			
		}
		
	}

}
