package day05;

import java.io.*;
public class Day05_07 {

	public static void main(String[] args) 
	throws IOException{
		
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		
		System.out.println("등급 계산기");
		System.out.println("점수를 입력하시오.");
		System.out.print("국어 : ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("영어 : ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("수학 : ");
		int mat = Integer.parseInt(br.readLine());
		
		int sum = kor + eng + mat;
		int avg = (kor + eng + mat)/3;
		
		System.out.println("결과");
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+mat);
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.print("등급 : ");
		if(avg>=90) {
		System.out.println("A.");	
		}else if(avg>=80) { 
			//if문에서 avg>=90 이 아니라는 전제를 깔고 내려왔기 때문에
			//조건문을 간소화해준다.				
			System.out.println("B.");	
			
		}else if(avg<80&&avg>=70) { //기존에 썼던 코드들
			System.out.println("C.");	
			
		}else if (avg<70&& avg>=60) {
			System.out.println("D.");	
			
		}else {
			System.out.println("F.");	
			
		}


	}

}
