package day00;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day00_br {
	public static void main(String[] args)
	throws IOException{
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		while(true){
			System.out.print("���� �Է� : ");
			int num1= Integer.parseInt(br.readLine());
			
			System.out.print("���� �Է� : ");
			int num2= Integer.parseInt(br.readLine());
			
			System.out.println("�Է¹��� �� : " + (num1%num2));
		}	
	}
	
	
}
