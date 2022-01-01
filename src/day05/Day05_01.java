package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day05_01 {

	public static void main(String[] args) 
	throws IOException {
		
		BufferedReader br = 
		new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("원의 반지름 입력:");
		double rad = Double.parseDouble(br.readLine());
		// br.readLine()으로 입력받는 값을 바로 변환하여 변수에 저장하기.
		// 따로 String을 사용한 변수를 쓸 필요가 없다.
		
		double cirarea = rad * rad * Math.PI;
		double circ = 2 * rad * Math.PI;
		
		System.out.println("입력된 반지름 : " + rad);
		System.out.println("원의 넓이 : " + cirarea);
		System.out.println("원의 둘레 : " + circ);
		
	}

}
