package day00;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day00_ex01 {

	public static void main(String[] args) 
	throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));

		System.out.println("계산 방식을 입력하시오.");
		System.out.println("1.덧셈 2.뺄셈 3.곱셈 4.나눗셈");
		System.out.print("입력 : ");
		int cal = Integer.parseInt(br.readLine());

		System.out.print("계산할 숫자 입력 : ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("두번째 숫자 입력 : ");
		int num2 = Integer.parseInt(br.readLine());

		if (cal == 1) {
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		} else if (cal == 2) {
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));

		} else if (cal == 3) {
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));

		} else if (cal == 4) {
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));

		} else {
			System.out.println("잘못된 입력입니다.");

		}

	}

}
