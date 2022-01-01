package day08;

public class Day08_03 {

	public static void main(String[] args) {

		for (int j = 1; j <= 10; j++) {
			int num = 0;
			for (int i = 1; i <= 10*j; i++) {
				num += i;
			}

			System.out.println("1~" + (j * 10) + "=" + num);

		}

	}

}