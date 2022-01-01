package day00;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day00_br2 {

	public static void main(String[] args) 
	throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));

		
		System.out.print("이름 : ");
		String userName = br.readLine();
		
		System.out.println("입력받은 값 : "+userName);
		
		
		
	}

}
