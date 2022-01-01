package day09;

import java.io.*;

public class Day09_06 {

	public static void main(String[] args) 
	throws IOException{
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tes[]=new int[5];
		int temp= 0;
		for(int i=0;i<tes.length;i++) {
		//	System.out.print((i+1)+"번째 점수를 입력하시오 : ");
			tes[i]  = (int)(Math.random()*50+50);
		}
		
		System.out.println();
		
		for(int i =0; i<tes.length;i++) {
			System.out.println("입력받은 "+(i+1)+"번째 점수 : "+tes[i]);
		}
		
		System.out.println();
		for(int j=0; j<tes.length;j++) {//주 대상자를 정하는 포문. 0부터 시작.
			
			for(int i = 1; i<tes.length;i++) { //비교 대상자를 정하는 포문. 1부터 시작.
				if(j<i&&tes[j]<tes[i]) { //주 대상자는 항상 비교 대상자보다 작아야한다.
					temp=tes[j]; 
					//temp에 tes j 가 저장 즉 temp와 tes j는 쌍둥이 변수.
					tes[j]=tes[i]; 
					//tes j 에 tes i가 저장. tes j와 tes i 는 쌍둥이 변수.
					//기존 tes j의 주소값은 temp만 갖고있는 상황.
					tes[i]=temp;
					//temp에 저장된 기존 tes j의 주소값을 tes i 가 가져감.
					
				}
				
			}
			
		}
		
		
		System.out.println();
		System.out.println("내림차순 정렬");
		for(int i=0;i<tes.length;i++) {
			System.out.println("성적"+(i+1)+":" +tes[i]);
			
		}
		
	}

}
