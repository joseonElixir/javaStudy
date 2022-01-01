package day05;

import java.io.IOException;

public class Day05_05 {

	public static void main(String[] args) 
	throws IOException{
		
		System.out.print("값을 입력 :");
		int num1 = System.in.read()-'0';
		
		if(num1!=0 && num1%2==0) { //%는 진수코드(2진수 등등)을 구할때 사용.
			System.out.println("이 값은 짝수입니다.");
			
		}else if(num1!=0 && num1%2==1){
			System.out.println("이 값은 홀수입니다.");
		}
		System.in.skip(2);
		//삼항연산자로 똑같은 값 출력.
		System.out.print("값을 입력 :");
		int num2 = System.in.read()-'0';
		
		String st=""; 
		st = num2%2==0 ? "이 값은 짝수입니다." : "이 값은 홀수입니다." ;
		System.out.println(st);
		
	}

}
