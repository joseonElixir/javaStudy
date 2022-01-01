package day10;

import java.io.*;
public class Day10_01 {

	public static void main(String[] args) 
	throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[]=new int[5];
		
		for(int i =0;i<arr.length;i++) {
			System.out.print((i+1)+"번째 점수 : ");
			arr[i]= Integer.parseInt(br.readLine());
			
		
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

		System.out.println();
		
		
		for(int i=0;i<arr.length-1;i++) {//주 대상자를 담당할 for문
			//주 대상자는 0번부터 지정하고, 마지막 이전까지만 간다고 알림.
			//0에서 시작, 3에서 종료.
			for(int j=i+1;j<arr.length;j++) {//비교 대상자를 담당할 for문
				//시작은 주 대상자의 다음번째부터.
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
