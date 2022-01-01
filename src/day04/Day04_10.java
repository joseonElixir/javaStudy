package day04;

import java.io.*;

public class Day04_10 {
	public static void main(String[] args) 
	throws IOException{
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
	
		String score = "";
		int point = 0;
	
		System.out.print("점수 입력 :");
		point = Integer.parseInt(br.readLine());
		
		score = (point == 100) ? "A": 
				((point>=80)?"B" :
				((point>=60)?"C":"D")); 
		
		System.out.println("grade : "+score);
	
		
		
		/*
		String score2 = "";
		int point2 = 0;
	
		System.out.print("점수 입력 :");
		point2 = Integer.parseInt(br.readLine());
		if(point2 == 100) {
			score2="A";
		}else if(point2>=80) {
			score2="B";
		}else if(point2>=60) {
			score2="C";
		}else {
			score2="D";
		}
		System.out.println("grade : "+score2);
		*/
		
	}
}
