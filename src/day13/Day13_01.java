package day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day13_01 {
	
	public static void arrInput(int [] arr) 
	throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("ù��° ���� : ");
			arr[i]= Integer.parseInt(br.readLine());
		
		}
		System.out.println();
	}
	
	public static void arrPrint(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.println(i+1+"��° �� : "+arr[i]);
		}
		System.out.println();
	}
	
	/** ���� ���� �޼��� */
	public static void arrSort(int arr[]) {
		System.out.println("�����ϱ�");
		for(int i=0;i<arr.length;i++){	// �� �����
			for(int j=0;j<i;j++) {		//�� �����.
				if(arr[i]>arr[j]) {		//��������.
					int tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
	}
	
	
	public static void main(String[] args) 
	throws IOException{
		
		int arr[] = new int[5];
		
		arrInput(arr);
		arrPrint(arr);
		arrSort(arr);
		arrPrint(arr);
		
		
	}
	
	
}
