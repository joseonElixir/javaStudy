package day00;

import java.io.*;

public class Day00_arr03 {

	public static void main(String[] args) 
	throws IOException{
		// 짝수 홀수 구분한 다음에 앞에는 짝수 내림차순, 뒤에는 홀수 내림차순.
		
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
				}//if문 끝
				
			}//자식 for문 끝
			
		}//부모 for문 끝
		
		for(int i = 0;i<num.length;i++) {
			for(int j=1;j<num.length;j++) {
				if((i<j)&&
						((num[i]%2==0&&num[j]%2==0)||(num[i]%2==1&&num[j]%2==1))
							&&(num[i]<num[j])) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
				
			}//자식for문 끝
		}//부모 for문 끝
		temp=0;
		for(int i=0; i<num.length;i++) {
			if(num[i]%2==0) {
				System.out.print("짝수");				
			}else {
				temp++;
				if(temp==1) {
					System.out.println();
				}
				System.out.print("홀수");
			}
			
			System.out.println(num[i]);
			
			
		}
		
	}

}
