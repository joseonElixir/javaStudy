package day18;

public class ExceptTest3 {

	public static void main(String[] args) {

		System.out.println("Start");

		for (int i = 1; i <= 5; i++) {
			try {
				int result = 10 / (i - 3);
				System.out.println("result : " + result);
			} catch (Exception e) {
				e.printStackTrace();
				//System.out.println(e);
				System.out.println("위의 문제가 발생");
			}
		}

		System.out.println("End");
	}

}
