package day12;

import java.io.*;
public class Day12_07 {

	public static int[] arrInput() //arrInput : �迭 �Է� �޴� �޼ҵ�
	throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputArr[]= new int[5];
		
		for(int i=0;i<inputArr.length;i++) {
			System.out.print(1+i+"��° ���� �Է��Ͻÿ� : ");
			inputArr[i]= Integer.parseInt(br.readLine());
		}
		
		return inputArr;
	}
	
	public static void arrPrint(int[] pArr) { //arrPrint �迭 ����ϴ� �޼ҵ� 
		
		for(int i =0; i<pArr.length;i++) {
			System.out.println(i+1+"��°  �迭�� ����� �� :"+pArr[i]);
		}
		System.out.println();
	}
	
	public static int[] arrSort(int[] arr) { // arrSort �迭 �����ϴ� �޼ҵ�
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		System.out.println("����");
		
		return arr;
	}
	
	
	public static void main(String[] args) 
	throws IOException{
		
		int arr[] = arrInput();
		
		arrPrint(arr);
		arrSort(arr);
		arrPrint(arr);
		
		
		//call by reference �� Ư��.
		//
		
		
		
	}

}
