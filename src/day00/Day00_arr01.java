package day00;

import java.io.*;

public class Day00_arr01 {

	public static void main(String[] args) 
	throws IOException{
		//내림/오른차순 정렬 방법 
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
		System.out.println("정렬");
		for(int i=0; i<num.length;i++) {//주 대상자
			
			for(int j = 1 ; j<num.length;j++) {// 비교 대상자.
				if(i<j&&num[i]>num[j]) {
					//주 대상자는 비교대상자보다 항상 작아야함.
					//num i < num j  : 내림차순 9 8 7 6 5
					//num i > num j  :오름차순  1 2 3 4
					temp= num[j];		
					num[j]=num[i];
					num[i]=temp;
					//0번보다 1번이 클 경우
					//큰 값을 0번에  = 내림차순.
				}
			}
		}
		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		

	}

}
