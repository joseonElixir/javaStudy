package day04;

import java.io.*;

public class Day04_08 {
	public static void main(String[] args) 
	throws IOException {
		BufferedReader br = 
		new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 수 :");
		String s_num1=br.readLine();
		
		System.out.print("두번째 수 :");
		String s_num2=br.readLine();		
		int num1 = Integer.parseInt(s_num1);
		int num2 = Integer.parseInt(s_num2);
		//Integer 클래스가 가지고 있는 parsInt 메소드를 통해
		//String type의 s_num1을 int type으로 변환한다.
		
		System.out.println
		(s_num1 +"+"+ s_num2+"="+(num1+num2));
		//랩퍼 클래스. 랩 : 감싸다.
		//기본 자료형을 보호하기 위해 만들어짐.
		// 기본 자료형을 사용할수록 보안에 취약해짐.
		//데이터 크기를 유추할 수 있기 때문 int = 4byte
		//그렇기에 랩퍼클래스로 감싸서 사용할 것.
		//모든게 4byte.
		
		//pars, parsing 
		//전혀다른 데이터 타입을 변환하는 작업을 통칭.
		//static 정적 메모리할당.
	
	
	
	
	}
}