package day20;

import java.util.Scanner;

public class Day20_02_2 {
//T
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] arr = {"java 쉬워요","java의 정석","자바 쉬워요","jsp 기초","jsp 초보"};
		
		System.out.print("검색어 입력 :");
		String user = sc.nextLine();
		for(int i=0; i<arr.length;i++) {
			if(arr[i].startsWith(user)) { 
				//startWith는 괄호안의 키워드가 들어있는지를 boolean값으로 반환하는 메소드.
				System.out.println(arr[i]);
			}
		}

	}


}
