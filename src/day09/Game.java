package day09;

import java.io.*;

public class Game {

	public static void main(String[] args) 
	throws IOException{
		
		while(true) {
			//예시코드.
			//이기는 경우의 수와 비기는 경우의 수, 지는 경우의 수를 계산해서
			// 그룹화 후 switch case로 넘기는 로직.
			System.out.println("======================");
			System.out.println("가위바위보 Ver1.0");
			System.out.println("----------------------");
			System.out.println("1.가위 2.바위 3.보 4.종료");
			System.out.println("======================");
			int user=0;
			int comp=0;
			do {
				System.out.println("메뉴 > ");
				user = System.in.read()-48;
				System.in.skip(10);
			} while(!(1<=user&&user<=4));
			if(user==4){
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			System.out.println("사용자 : " +user);
			comp = (int)(Math.random()*3+1);
			System.out.println("comp : "+comp);
			
			//진수코드를 이용해서 로직 만들기.
			
			if(user==comp) {
				System.out.println("무승부");
			} else if ((user+1)%3==comp%3) {
				System.out.println("컴퓨터 승");
				
			}else {
				System.out.println("사용자 승.");
				
			}
			//무승부의 경우 (1+0)%1 == (2+0)%2 == (3+0)%3 = 0
			//패배의 경우 (1+1)%2 == (2+1)%3 == (3+1)%1 = 
			//승리의 경우 (1+2)%3 == (2+2)%1 == (3+2)%2 = 
			//라는 값을 진수코드를 통해 그룹화. 
			//즉 진수코드로 변환하여 규칙성에 맞게 그룹화시킬 수 있는 값을 찾아냄.
			//관건은 3+1을 1로 만들어 규칙성을 만들어내는 것.
			
//			switch(user - comp) {
//			case -2 : case 1 : 
//				System.out.println("사용자 승"); break;
//			case 0 : 
//				System.out.println("무승부"); break;
//			case -1 : case 2 : 
//				System.out.println("컴퓨터 승");
//	
//			}
			//다중if문을 피하기 위해 만들어진 switch case문.	
			//결과값을 그룹화해서 로직을 단순화 시켰다.
			//컴퓨터가 연산을 하는 것이 아닌 사람이 연산을 하는 코드.
			//핵심 키워드 : 데이터의 그룹화. 그리고 그룹화된 데이터의 처리.
			
		}
		
	}

}
