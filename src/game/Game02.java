package game;

import java.io.*;

public class Game02 {

	public static void main(String[] args) 
	throws IOException{
		//결과값을 랜덤으로 
		//그에 따른 리턴값을 주는 방식.
		//
		while(true) {
			
			
			int user=0;
			int comp = 0;
			int res =0;
			String s_user ="";
			String s_comp="";
			String s_res="";
			System.out.println("가위바위보 Ver2.0");
			System.out.println("1.가위 2바위 3.보 4.종료");
			
			do {
				System.out.print("입력> ");
				user = System.in.read() - '0';
				System.in.skip(100);
				if(user==4) {
					System.out.println("사용자의 입력에 의해 컴퓨터를 종료합니다.");
					System.exit(0);
				}
			} while (!(1<=user&&user<=4));
			
			res = (int)(Math.random()*3+1);
			
			
			switch(res){
			
			case 1: 
				s_res = "사용자 승!";
				if(user == 1) {
					comp=3;
				}
				else if (user == 2) {
					comp=1;
					}
				else {
					comp=2;
				}
				break;
			
			case 2:
				s_res = "컴퓨터 승!";
				switch(user) {
				case 1: comp=2; break;
				case 2: comp=3; break;
				case 3: comp=1; break;
				}
				break;
				
			case 3:
				comp=user;
				s_res = "무승부! 다시!";
				break;
		
			}
			
			switch(user) {
			case 1 : s_user="가위"; break;
			case 2 : s_user="바위"; break;
			case 3 : s_user="보"; break;
			
			}
			
			switch(comp) {
			case 1 : s_comp="가위"; break;
			case 2 : s_comp="바위"; break;
			case 3 : s_comp="보"; break;
			
			}
			
			System.out.println("사용자 : "+s_user);		
			System.out.println("컴퓨터 : "+s_comp);
			System.out.println(s_res);
			System.out.println();
		
		}
			
	}


}
