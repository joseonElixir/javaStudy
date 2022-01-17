package day20;

import java.util.Scanner;

class Bullshit{
	String user;
	String arr[] = {"바보","똥개","멍청이"};
	
	public void masikg(Scanner sc) {
		System.out.println("입력 : ");
		user = sc.nextLine();
		for(int i=0;i<arr.length;i++) {
			user= user.replaceAll(arr[i], "***");
		}
		System.out.println(user);
		
		
	}
	
	
}

public class Day20_03 {

	public static void main(String[] args) {
		Bullshit bs = new Bullshit();
		Scanner sc = new Scanner(System.in);
		
		//bs.masikg(sc);

		System.out.println("");
		System.out.println("두번째 방법");
		System.out.println("");
		String user;
		String arr[] = {"바보","똥개","멍청이"};
		System.out.println("입력 : ");
		user = sc.nextLine();
		StringBuffer sb = new StringBuffer(user);
		for(int i=0;i<arr.length;i++) {
			while(true) {
				if(sb.indexOf(arr[i])==-1) {
					break;
				}
				int num = sb.indexOf(arr[i]);
				sb.replace(num, num+arr[i].length(), "***");
				
			}//replaceAll의 기능을 replace를 써서 구현한 것. 걍 replaceAll 쓰자.
			
		}
		System.out.println(sb);
		
		System.out.println();
		System.out.println("세번째 방법 (글짜 크기에 따른 마스킹 입력)");
		System.out.println();
		System.out.println("입력");
//		user = sc.nextLine();
//		sb = new StringBuffer(user);
		sb = new StringBuffer(sc.nextLine()); //StringBuffer에 입력받으면 된다 걍.
		
		for(int i=0;i<arr.length;i++) {//arr에 저장된 비속어 갯수만큼 for문을 수행.
			while(true) {
			int os = sb.indexOf(arr[i]); // 비속어의 시작점index (offset index). 불필요하나 코드의 가시성을 위해 작성.		
			int len= arr[i].length();		//비속어 크기 (length). 역시 불필요하나 코드의 가시성을 위해 작성.
				if(os!=-1) { 
						// 비속어가 존재하지 않을 경우 os에 -1이 리턴되고 ArrayIndexOutOfBoundException이 발생한다.
					sb.delete(os,os+len);		//입력된 sb에서 비속어에 해당되는 구문삭제 (시작 인덱스와 끝 인덱스 지정)
					for(int j=0;j<len;j++) {			
						sb.insert(os, "*");		//비속어의 크기만큼 asterisk 삽입
					}
				}else {break;} //os가 -1이 될 경우 while문을 빠져나온다.
			}//while end
		}//for end
		
		System.out.println(sb);
		
		
		
		
		
	}

}
