package day10;

import java.io.*;

public class Day10_042arr {
//각 행에 값 3개씩 입력받고 3,4열에 합계와 평균을 연산해서 집어넣기.
//그후 각 행의 평균 점수(4열)를 비교해서 내림차순으로 나열하기.
	public static void main(String[] args) 
	throws IOException{
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int arr[][] = new int[5][5];

		for(int i=0;i<arr.length;i++) {
		//자동입력 : 행 for문
			for(int j=0;j<arr[i].length-2;j++) {
			//열 for문 	
				arr[i][j]=(int)(Math.random()*100+1);
				arr[i][3]+=arr[i][j];
			}
			arr[i][4]= arr[i][3]/3;
		}//자동입력 for문 end
		
		for(int i=0;i<arr.length;i++) {
		//출력 : 행 for문 
			for(int j=0;j<arr[i].length; j++) {
			//열 for문.
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}//출력 for문 end
		
		for(int i=0;i<arr.length-1;i++) {
		//Selection Sort : 주 대상자 for문
			for(int j=i+1;j<arr[i].length;j++) {
			//비교 대상자 for문 
			//조건 : 주 대상자와 비교 대상자가 존재,
			//주 대상자는 항상 1번부터, 비교 대상자는 주 대상자+1번부터 진행.
			//비교 대상자가 끝변까지 비교가 끝나면 주 대상자가 +1 이동
				if(arr[i][4]<arr[j][4]) {//내림차순(앞의 수가 큰수가 나오게 정렬)
					int tmp[]=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
					//스왑
				}
			}
		}//정렬 for문 end
			
			System.out.println("재출력");
			System.out.println();
			
			
		for(int i=0;i<arr.length;i++) {
		//재출력 : 행 for문
			for(int j=0;j<arr[i].length;j++) {
			//재출력 : 열 for문
				System.out.print(arr[i][j]+" \t");
			}
			System.out.println();
		}//재출력 for문 end.
			
			
		

	}

}
