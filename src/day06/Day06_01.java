package day06;

import java.io.IOException;

public class Day06_01 {

	public static void main(String[] args) 
	throws IOException{
		
		System.out.print("�Է� : ");
		int ins = System.in.read();
		
		if (ins >='0' && '9'>=ins ) {
			System.out.println("�Է¹��� �� \'" + (char)ins+"\'��(��) �����Դϴ�.");
				
		}else if ((ins >='a'&&ins <='z') || (ins >='A'&&ins<='Z') ) {
			System.out.println("�Է¹��� �� \'" + (char)ins+"\'��(��) �����Դϴ�.");
		
		}else {
			System.out.println("�Է¹��� �� \'"+(char)ins+"\'��(��) Ư������ �Դϴ�.");
		}
		

	}

}
