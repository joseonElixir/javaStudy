package day00;

import java.io.*;

public class Day00_arr01 {

	public static void main(String[] args) 
	throws IOException{
		//����/�������� ���� ��� 
		//
		
		int num[] = new int[20];
		int temp=0;
		for(int i=0; i<num.length;i++) {
			
			num[i]= (int)(Math.random()*100);
			
		}
		for(int i = 0; i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		System.out.println();
		System.out.println("����");
		for(int i=0; i<num.length;i++) {//�� �����
			
			for(int j = 1 ; j<num.length;j++) {// �� �����.
				if(i<j&&num[i]>num[j]) {
					//�� ����ڴ� �񱳴���ں��� �׻� �۾ƾ���.
					//num i < num j  : �������� 9 8 7 6 5
					//num i > num j  :��������  1 2 3 4
					temp= num[j];		
					num[j]=num[i];
					num[i]=temp;
					//0������ 1���� Ŭ ���
					//ū ���� 0����  = ��������.
				}
			}
		}
		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		

	}

}
