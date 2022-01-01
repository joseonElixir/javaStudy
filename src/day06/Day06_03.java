package day06;

import java.io.IOException;

public class Day06_03 {

	public static void main(String[] args) 
	throws IOException {
		
		for (int i=0; i < 4; i++) { 
		//i < 4인 동안에 수행, for문이 수행되고나서 i+1이 실행된다.
			System.out.print(i+"번째 반복문입니다. 입력 : ");
			
			int num = System.in.read();
			System.in.skip(2);
			switch (num) {
			case '1':
				System.out.println("1번이 입력되었다!");
				break;
			case '2':
				System.out.println("2번이 입력되었다!");
				break;
			case '3':
				System.out.println("3번이 입력되었다!");
				break;
			default:
				System.out.println("뭔지 모를 것이 입력되었다!");
				break;// if를 제외한 모든 제어문을 종료시키는 명령어.
			}
		}

	}

}
