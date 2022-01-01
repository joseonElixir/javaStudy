package day08;

import java.io.*;

public class Day08_05 {

	public static void main(String[] args) throws IOException {

		while (true) {

			System.out.println("=숫자 입력 창= ");
			int user = 0;
			do {// 일단 한번이라도 수행할 코드를 적는다.
				System.out.print("숫자 입력 (종료 : 0) : ");
				user = System.in.read();
				System.in.skip(2);// enter에 대한 메모리 스킵
			} while (!(48<=user && user<=57)); 
			// user는 48~57 사이에 있다는 것을 48<user<57을 통해서 직관적으로 보여줌.
			// 조건값을 넣어서 유효성 검사를 한다.
			// 논리 부정 연산자를 통해 숫자의 범위를 false로 잡는다.
			//user는 48~57일때 true를 반환하는 식에 논리부정을 해서
			//숫자가 입력되면 false를 반환하게 한다. = do while문을 벗어남.
			//
			
			if (user == '0') {
				System.out.println("프로그램 종료.");
				System.exit(0);
				
			}

			System.out.println("입력한 숫자는 " + (char) user + "입니다.");

		}

	}

}
