package day00;

import java.util.Scanner;

public class Day00_sc2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("값을 입력 : ");
		int num = sc.nextInt();

		System.out.println("입력받은 값 : " + num);

		String res = "";
		//삼항연산자의 활용
		res = num >= 0 && num < 10 ? "1자릿수"
			: (num >= 10 && num < 100 ? "2자릿수"
				: (num >= 100 && num < 1000 ? "3자릿수" 
					: (num >= 1000 && num < 10000 ? "4자릿수" : "4자릿수 이상")));

		System.out.println("입력받은 값 " + num + ", " + res);

	}

}
