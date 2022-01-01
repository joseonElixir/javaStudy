package day09;

import java.io.*;

public class Day09_05 {

	public static void main(String[] args) 
	throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("과목의 갯수를 입력하시오 : ");
		
		int count = Integer.parseInt(br.readLine());
		
		int tes[]= new int[count];
		String s_tes[]= new String[count];
		int sum=0;
		int avg=0;
		for(int i = 0; i<tes.length;i++) {
			
			System.out.print((i+1)+"번째 과목명을 입력하시오 :");
			s_tes[i] = br.readLine();
			System.out.print((s_tes[i])+"의 점수를 입력하시오 :");
			tes[i]=Integer.parseInt(br.readLine());
			
			System.out.println();
			sum+=tes[i];
		}
		avg=sum/tes.length;
		
		for(int i =0;i<tes.length;i++) {
			System.out.println("입력받은 "+ s_tes[i] +"의 점수 : "+tes[i]);
		}
		
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		
		
		
	}

}
