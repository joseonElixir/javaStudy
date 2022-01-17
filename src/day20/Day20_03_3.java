package day20;

import java.util.*;

public class Day20_03_3 {
//T
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] kw = {"바보","멍청이","똥개"};
		System.out.print("입력:");
		
		String user = sc.nextLine();
		
		for(int i=0;i<kw.length;i++) {
			String temp="";
			for(int j=0;j<kw[i].length();j++) {
				temp+="*";
			}
			user = user.replaceAll(kw[i], temp);	
		}
		System.out.println("출력:"+user);
		
	}
	
}
