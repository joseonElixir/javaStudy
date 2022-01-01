package day04;

import java.io.*; 	//자바 io폴더의 모든것을 불러오기
//import java.io.IOException; // io 폴더의 ioexception만 가져오기.
						//각각 장단점이 있음.

public class Day04_04 {

	public static void main(String[] args) 
	throws IOException{
			
		System.out.println("A");
		
		int a = System.in.read();
		System.out.println("c");
		System.out.println("a="+a);
		//System.in.read는 수치값만 입력받을 수 있다.
		//아스키코드값을 읽어온다.
		//입력받는 문자의 값을 단 한개만 입력받는다.
		
	}

}
