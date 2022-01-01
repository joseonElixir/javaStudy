package day04;

import java.io.*;
public class Day04_05 {

	public static void main(String[] args) 
	throws IOException{
		
		System.out.print("첫번째 : ");
		int a = System.in.read();
		System.in.skip(3);
		System.out.print("두번째 : ");
		int b = System.in.read();
		System.in.skip(2);
		System.out.print("세번째 : ");
		int c = System.in.read();
		System.in.skip(2);
		
		System.out.println("a="+a+"/b="+b+"/c="+c);
		/*설명 : 엔터의 값은 /r과 /n으로 구성되어있기 때문에
		 * 값을 입력하고 엔터로 넘길 때에 버퍼에 /r과 /n이 남기 때문에
		 * 10과 13이 b와 c에 저장된다.
		 * 이 문제를 System.in.skip();을 사용해서
		 * 입력받은 이후의 데이터를 날려버린다.
		 * 
		 * 
		 */
		
		
		
		
		
	}

}
