package day07;

import java.io.*;

public class Day07_04 {

	public static void main(String[] args) throws IOException {
		int sum =0; //for문을 통해 얻은 값의 합이 저장되는 로컬변수
		
		for (int i = 1; i <= 10; i++) {
			if (i!= 1) {// 최초의 1회에 + 부호를 표시하지 않기 위해 

				if (i % 2 == 0) {
					sum -= i; 
					System.out.print("-");
				} else {
					sum += i; //밖의 if문에 의해 발생하는 문제.
					System.out.print("+");
				}
			} else { // 그것을 보완한 값.
				sum+=1; // for문의 1회차에서 부호를 안그리기 위해 쓴 바깥 if문에서 발생한
				//누락 값의 보상.
			}
			System.out.print(i); //
		}
		
		System.out.println("=" + sum);
	}

}
