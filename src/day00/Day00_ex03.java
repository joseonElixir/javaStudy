package day00;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day00_ex03 {
	
	public static void main(String[] args) 
	throws IOException{
		//여태까지 배운 것들 복습
		//System 클래스 입출력 Stream
		//연산자 순서
		//삼항연산자 
		//문자열 입력받는 BufferedReader 클래스
		//if문 
	BufferedReader br = new BufferedReader 
			(new InputStreamReader(System.in));
	System.out.print("점수 입력 : ");
	int num = Integer.parseInt(br.readLine());
	
	char grade =num <= 100 && num>80 ?
			'A':(num <= 80 && num > 60? 'B': 'C');
	
	System.out.println("Grade : " + grade);
	
	if(grade == 'A') {
		System.out.println("참 잘했어요.");
	} else if (grade =='B') {
		System.out.println("좀 잘했어요");
	}else {
		System.out.println(grade+"발럼아");
	}
	
	}
}
