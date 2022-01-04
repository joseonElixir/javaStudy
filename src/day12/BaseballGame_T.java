package day12;

import java.io.*;

public class BaseballGame_T {

	public static void main(String[] args) 
	throws IOException{
		
		System.out.println("---------------------");
		System.out.println("숫자 야구 게임 v1.0");
		System.out.println("---------------------");

		int com[]= new int[3];
		
		for(int i=0; i<com.length;i++) {
			
			com[i]=(int)(Math.random()*9+1); //난수발생 +형변환
			for(int j=0;j<i;j++) { //중복검사 
				if(com[j]==com[i]) { 
					i--;
					break;
				}
			}
			
		}
		
		//test code
		for(int i=0;i<com.length;i++) {
			System.out.println(com[i]+" ");
		}
		System.out.println();
		//test code
		
		for(int k=1;k<=10;k++){ // 총 10회의 게임
			
			int user[]= new int[3];
			
			System.out.print(k+"회차 입력 : ");
			for(int i=0;i<user.length;i++) {
				user[i]=System.in.read()-48; //버퍼에 저장된 값을 읽어오고, 
				//저장된 값이 없으면 입력을 받는다. 그렇기에 연속된 숫자 3개를 입력하면
				//버퍼에 3개의 숫자가 입력되고, 엔터값의 버퍼가 남는다.
				
			}
			System.in.skip(2);
			//엔터값의 버퍼 데이터를 스킵으로 삭제해줌.
			
			//test code
			for(int i=0;i<user.length;i++) {
				System.out.print(user[i]+" ");
			}
			
			int str=0;
			int ball=0;
			
			for(int i=0;i<com.length;i++) { //주 대상자
				for(int j=0;j<user.length;j++) { // 비교 대상자
					if(com[i]==user[j]&& i==j) { //값과 자릿수가 같을 때
						str++;
					}else if(com[i]==user[j]&&i!=j) { //값은 같고 자릿수는 다를 때
						ball++;
					}
				}	
			}
			System.out.println(": "+str+" strike, "+ball+" ball.");
			if(str==3) {
				System.out.println("정답입니다!");
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}	
		}
		System.out.println("10번의 기회를 모두 소진하였습니다.");
		System.out.println("프로그램을 종료합니다.");
		
	}

}
