package day06;

import java.io.IOException;

public class Day06_01 {

	public static void main(String[] args) 
	throws IOException{
		
		System.out.print("입력 : ");
		int ins = System.in.read();
		
		if (ins >='0' && '9'>=ins ) {
			System.out.println("입력받은 값 \'" + (char)ins+"\'은(는) 숫자입니다.");
				
		}else if ((ins >='a'&&ins <='z') || (ins >='A'&&ins<='Z') ) {
			System.out.println("입력받은 값 \'" + (char)ins+"\'은(는) 문자입니다.");
		
		}else {
			System.out.println("입력받은 값 \'"+(char)ins+"\'은(는) 특수문자 입니다.");
		}
		

	}

}
