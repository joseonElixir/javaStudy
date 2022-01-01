package day06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day06_07 {

	public static void main(String[] args) 
	throws IOException{
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		
		System.out.println("구구단");
		System.out.print("단 입력 :");
		int gugu = Integer.parseInt(br.readLine());
		
		System.out.println(gugu+"단 시작.\n");
		for(int count = 1 ;count <=9;count++) { 
			//for문의 지역변수 count 선언 및 1로 초기화. (초기값)
			//true가 되는 조건식을 작성 ; 증감식 입력, 조건문에 증감식을 대입해서 원하는 타이밍에
			//빠져나오는지 확인.
			//if문의 특징 : if문으로 출력하고 싶은 코드가 1줄이면 영역지정을 안해줘도 됨.
			System.out.println(gugu+"*"+count+"="+(gugu*count));
			
		}
		
	}

}
