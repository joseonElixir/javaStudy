package day00;

public class Day00_for02 {

	public static void main(String[] args) {
		// 소수 판별기 만들기.

		for (int num = 1; num <= 10; num++) {

			int fac = 0;
			for (int i = 1; i <= num; i++) {
				if(num%i==0) //나머지를 구할때는 큰 값에서 작은 값으로 나눠라
					//여태까지 작은 값을 큰값으로 쳐 나눠서 뻑난거 
					fac=fac+1;
				System.out.println(num+"%"+i+"="+(num%i));
			}
		
			if(fac==2){
				System.out.println("소수 :"+num);

			}
		}
	}
}
