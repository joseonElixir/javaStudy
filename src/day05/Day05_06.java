package day05;

import java.io.*;

public class Day05_06 {

	public static void main(String[] args) 
	throws IOException{
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("==중화반점 주문 ARS 프로그램입니다==");
		System.out.println("1.짜장 2.짬뽕 3.탕수육 4.팔보채");
		
		System.out.print("메뉴>");
		int menu = Integer.parseInt(br.readLine());
		
		if(menu==1) {
			System.out.println("짜장 주문 완료");
		}else if(menu==2) {
			System.out.println("짬뽕 주문 완료");
		}else if(menu==3) {
			System.out.println("탕수육 주문 완료");
		}else if(menu==4) {
			System.out.println("팔보채 주문 완료");
		}else {
			System.out.println("잘못된 입력입니다."); 
		}
		
		
		
		
	
	}

}
