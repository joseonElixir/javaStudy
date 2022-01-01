package day08;

public class Day08_08 {

	public static void main(String[] args) {
		
		for(int j=1;j<=5;j++) {
			
			for(int i=1;i<=10;i++) {
				if(i==5)
					continue;//continue를 만나는 시점에서 반복문의 초기로 돌아감.
				//반복문의 특정 회차에서 continue의 이후 코드를 수행하지 않음.
				System.out.println(i);
			}

		}

	}

}
