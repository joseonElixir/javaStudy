package day04;

import java.io.*;

public class Day04_09_02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("이름:");
		String name = br.readLine();
		System.out.print("나이:");
		String age = br.readLine();
		//int num1 = Integer.parseInt(br.readLine());
		//를 쓰면 인트에 초기화화 동시에 입력받은 값을 형변환해서 변수에 저장할 수 있다.
		System.out.print("성적 1 :");
		String snum1 = br.readLine();
		System.out.print("성적 2 :");
		String snum2 = br.readLine();
		System.out.print("성적 3 :");
		String snum3 = br.readLine();

		int num1 = Integer.parseInt(snum1);
		int num2 = Integer.parseInt(snum2);
		int num3 = Integer.parseInt(snum3);

		int sum = num1 + num2 + num3;
		int avg = (num1 + num2 + num3) / 3;
		System.out.println("성적 공개");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("");
		System.out.println("성적 1 : " + num1);
		System.out.println("성적 2 : " + num2);
		System.out.println("성적 3 : " + num3);
		System.out.println("평균 : " + avg);
		System.out.println("총합 : " + sum);

	}

}
