package day06;

public class Day06_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;

		for (int count = 0; count <= 50; count++) {
			// 5의 배수를 찾는거니깐 애초에 증가치를 count+=5씩 하는 방식도 존재.
			// 지역변수인 count는 for문의 영역 밖으로 나가면 사라짐.
			if (count % 5 == 0) {
				sum += count; // fiv= fiv+count;
				System.out.println("5의 배수 :" + count);
			}
		}
		System.out.println("50까지의 수 중에 5의 배수의 합 : " + sum);
	}

}
