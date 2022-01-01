package day05;

import java.io.*;

public class Day05_04 {

	public static void main(String[] args) 
	throws IOException{
		
		System.out.print("첫번째 수 :");
		int num1 = System.in.read()-48;
		System.in.skip(2);
		System.out.print("두번째 수:");
		int num2 = System.in.read()-'0';
		
		if(num1>num2) {
			System.out.println("첫번째 수가 큰 수. 값 : " +num1);
		
		}else {
			System.out.println("두번째 수가 큰 수. 값 : "+num2);
			
			
		}
		
		
		

	}

}
