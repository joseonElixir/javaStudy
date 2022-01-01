package day04;

import java.io.*;

public class Day04_09_01 {
	public static void main(String[] args)
	throws IOException{
		BufferedReader br = new BufferedReader
		(new InputStreamReader(System.in));
		
		System.out.print("값을 입력하시오 :");
		String str = br.readLine();
		
		int i = Integer.parseInt(str);
		System.out.println("입력된 값 : "+i);
		System.out.println("입력된 값이 정수 타입이면 2배 : "+(i+i));
		
		
	}
}
