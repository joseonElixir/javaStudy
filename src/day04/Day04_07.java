package day04;

import java.io.*;

public class Day04_07 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// System.in : 1byte
		// + new InputStreamReader : 2byte
		// + new BufferedReader : 문자열을 입력하게 만듬.
		System.out.println("당신의 이름을 입력하세요");
		System.out.print("이름 : ");
		String str = br.readLine();
		System.out.println("아!" + str + " 님이시군요!");
		System.in.skip(100);

		// 2자릿수의 계산
		// 즐거운 개삽질 ^오^
		System.out.print("숫자 1 :");
		int num1 = System.in.read();
		int num2 = System.in.read();
		System.in.skip(10);
		int res = num2 == 13 || num2 == 10 ? 
			num1 - 48 : ((num1 - '0') * 10) + (num2 - 48);
		/*
		 * 삼항연산자를 통해 num 2에 입력받는 값이 
		 * 엔터의 ascii 코드값인 \n+\r의 13 혹은 10일 경우
		 *  결과값을 1자릿수로 인식하게 하고 
		 *  num1에 입력받은 아스키 코드 값을 정수값과 동일화시키는
		 *  작업을 수행함
		 *  엔터값이 아닌 다른 값을 입력받는 경우, num1을 10의 자릿수로,
		 *  num2를 1의 자릿수로 계산하여 작업을 수행함.
		 *  
		 */
		System.out.print("숫자 2 :");
		int num3 = System.in.read();
		int num4 = System.in.read();
		System.in.skip(10);
		int res2 = num4 == 13 || num4 == 10 ?
			num3 - 48 : ((num3 - 48) * 10) + (num4 - 48);
		int sum = res + res2;

		System.out.println(res + "+" + res2 + "=" + sum);

	}
}
