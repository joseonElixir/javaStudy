package day10;

import java.io.*;

public class Day10_042arr {
//�� �࿡ �� 3���� �Է¹ް� 3,4���� �հ�� ����� �����ؼ� ����ֱ�.
//���� �� ���� ��� ����(4��)�� ���ؼ� ������������ �����ϱ�.
	public static void main(String[] args) 
	throws IOException{
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int arr[][] = new int[5][5];

		for(int i=0;i<arr.length;i++) {
		//�ڵ��Է� : �� for��
			for(int j=0;j<arr[i].length-2;j++) {
			//�� for�� 	
				arr[i][j]=(int)(Math.random()*100+1);
				arr[i][3]+=arr[i][j];
			}
			arr[i][4]= arr[i][3]/3;
		}//�ڵ��Է� for�� end
		
		for(int i=0;i<arr.length;i++) {
		//��� : �� for�� 
			for(int j=0;j<arr[i].length; j++) {
			//�� for��.
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}//��� for�� end
		
		for(int i=0;i<arr.length-1;i++) {
		//Selection Sort : �� ����� for��
			for(int j=i+1;j<arr[i].length;j++) {
			//�� ����� for�� 
			//���� : �� ����ڿ� �� ����ڰ� ����,
			//�� ����ڴ� �׻� 1������, �� ����ڴ� �� �����+1������ ����.
			//�� ����ڰ� �������� �񱳰� ������ �� ����ڰ� +1 �̵�
				if(arr[i][4]<arr[j][4]) {//��������(���� ���� ū���� ������ ����)
					int tmp[]=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
					//����
				}
			}
		}//���� for�� end
			
			System.out.println("�����");
			System.out.println();
			
			
		for(int i=0;i<arr.length;i++) {
		//����� : �� for��
			for(int j=0;j<arr[i].length;j++) {
			//����� : �� for��
				System.out.print(arr[i][j]+" \t");
			}
			System.out.println();
		}//����� for�� end.
			
			
		

	}

}
