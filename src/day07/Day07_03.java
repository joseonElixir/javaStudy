package day07;

import java.io.*;

public class Day07_03 {

	public static void main(String[] args) 
	throws IOException {

		BufferedReader br = new BufferedReader
		(new InputStreamReader(System.in));

		System.out.print("숫자 입력 :");
		int num = Integer.parseInt(br.readLine());
		int fec = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				fec++;
				System.out.println(num + "%" + i + "==" + (num % i));
				// for문의 조건을 (i=2; i<num ; i++) 로 주고 
				//if문의 조건에 부합하면 
				//System.ou.println(num+"는 소수가 아닙니다"); 로 알린 후
				//System.exit(0);으로 시스템을 종료하는 방식도 있다.
				//혹은 for문의 i를 for문 밖으로 빼고
				//같은 조건에서 break;로 빠져나온 뒤 if(num==i)은 소수로 주는 방법도 있다. 
				//이를 통해 갖게되는 장점은 불필요한 연산을 줄일 수 있다는 점이다.
			}
		}

		if (fec == 2) {
			System.out.println(num + "는 소수입니다.");
		} else {
			System.out.println(num + "는 소수가 아닙니다.");
		}

	}

}
