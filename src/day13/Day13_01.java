package day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day13_01 {
	
	public static void arrInput(int [] arr) 
	throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("첫번째 점수 : ");
			arr[i]= Integer.parseInt(br.readLine());
		
		}
		System.out.println();
	}
	
	public static void arrPrint(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.println(i+1+"번째 값 : "+arr[i]);
		}
		System.out.println();
	}
	
	/** 정렬 관련 메서드 */
	public static void arrSort(int arr[]) {
		System.out.println("정렬하기");
		for(int i=0;i<arr.length;i++){	// 주 대상자
			for(int j=0;j<i;j++) {		//비교 대상자.
				if(arr[i]>arr[j]) {		//내림차순.
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
