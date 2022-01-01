package day08;

public class Day08_02 {
	public static void main(String[] args) {

		for (int j = 0; j < 5; j++) {// 2.원하는 데이터가 그룹으로 가공되게 코드를 작성.

			for (int i = 5; i <= 9; i++) {// 1.원하는 데이터가 출력되게 코드를 작성.
				System.out.print((i-j) + " ");
				//출력되는 순서를 정하고, 순서에 따라 로직을 정한다.
				//이 코드에서 가장 먼저 출력되는 것은 자식for문이다.
				

			}
			System.out.println();
		}

	}
}
