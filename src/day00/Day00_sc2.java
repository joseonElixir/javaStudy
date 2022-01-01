package day00;

import java.util.Scanner;

public class Day00_sc2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("°ªÀ» ÀÔ·Â : ");
		int num = sc.nextInt();

		System.out.println("ÀÔ·Â¹ŞÀº °ª : " + num);

		String res = "";
		//»ïÇ×¿¬»êÀÚÀÇ È°¿ë
		res = num >= 0 && num < 10 ? "1ÀÚ¸´¼ö"
			: (num >= 10 && num < 100 ? "2ÀÚ¸´¼ö"
				: (num >= 100 && num < 1000 ? "3ÀÚ¸´¼ö" 
					: (num >= 1000 && num < 10000 ? "4ÀÚ¸´¼ö" : "4ÀÚ¸´¼ö ÀÌ»ó")));

		System.out.println("ÀÔ·Â¹ŞÀº °ª " + num + ", " + res);

	}

}
