package day05;

import java.io.*;

public class Day05_03 {
	public static void main(String[] args) throws IOException {

		System.out.print("첫번째 수 : ");
		int num1 = System.in.read() - '0';
		System.in.skip(2);
		System.out.print("두번째 수 : ");
		int num2 = System.in.read() - 48;

		if (num2 == 0) {
			System.out.println("0으로 나눌 수 없다.");
			System.exit(0);// 0은 정상종료, 그 외의 값은 비정상 종료
		}

		System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));

	}
}
