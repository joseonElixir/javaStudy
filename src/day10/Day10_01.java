package day10;

import java.io.*;
public class Day10_01 {

	public static void main(String[] args) 
	throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[]=new int[5];
		
		for(int i =0;i<arr.length;i++) {
			System.out.print((i+1)+"��° ���� : ");
			arr[i]= Integer.parseInt(br.readLine());
			
		
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

		System.out.println();
		
		
		for(int i=0;i<arr.length-1;i++) {//�� ����ڸ� ����� for��
			//�� ����ڴ� 0������ �����ϰ�, ������ ���������� ���ٰ� �˸�.
			//0���� ����, 3���� ����.
			for(int j=i+1;j<arr.length;j++) {//�� ����ڸ� ����� for��
				//������ �� ������� ������°����.
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}//443930291810
		
		
		
	}

}
