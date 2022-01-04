package day12;

import java.io.*;

public class Day12_06 {

	public static int[] getLotto() {
		int lot[] = new int[6];
		for (int i = 0; i < lot.length; i++) {
			lot[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (lot[i] == lot[j]) {
					i--;
				}
			}
		}
		return lot;
	}

	public static int cal(int num1, int num2, char add) {
		//모듈의 목적은 코드의 분리화.
		
		// ==부호로는 문자열을 비교할 수 없다.

		// String ad="";
		// ad.equals("+"); //문자열을 비교하는 방식.
		//switch case문을 쓰는게 효율적이다.
		//제시해야 하는 값이 명확할 때.
		double result =0;
		
		switch(add) {
		case '+':
			result = num1+num2;
			System.out.print(num1 + " + " + num2 + " = " + result);
			break;
		case '-':
			result = num1-num2;
			System.out.print(num1 + " - " + num2 + " = " + result);
			break;
		case '*':
			result = num1*num2;
			System.out.print(num1 + " * " + num2 + " = " + result);
			break;
		case '/':
			result = (double)num1/(double)num2;
			System.out.print(num1 + " / " + num2 + " = " + result);
			break;
			
		}
		
		return (int)result;
		
//		if (add == '+') {
//			System.out.print(num1 + " + " + num2 + " = " + (num1 + num2));
//		} else if (add == '-') {
//			System.out.print(num1 + " - " + num2 + " = " + (num1 - num2));
//		} else if (add == '*') {
//			System.out.print(num1 + " * " + num2 + " = " + (num1 * num2));
//		} else if (add == '/') {
//			System.out.print(num1 + " / " + num2 + " = " + ((double) num1 / (double) num2));
//
//		} else {
//
//		}

	}

	public static void main(String[] args) throws IOException {
		// 메소드의 연습.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a[] = getLotto();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println();
		System.out.println("사칙계산기");
		System.out.print("첫번째 숫자 :");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("두번째 숫자 :");
		int num2 = Integer.parseInt(br.readLine());
		System.out.print("연산자 :");
		char cul = (char) br.read();
		//char cul = (char) System.in.read();
		System.in.skip(2);

		cal(num1, num2, cul);
		System.out.println();
		// System.out.println("답 : "+num1+(char)cal+num2+"");
		// System.out.println("글자"+1+2);
		// System.out.println(1+2);
		// System.out.println의 특징은 문자열을 출력하기 위해 만들어졌음.
		// 그렇기 때문에 앞에 문자열이 선행되지 않고 변수만 출력할 경우 계산을 해버림.
		// 문자열이 선행되면 뒤의 정수들 또한 문자로 인식해서 계산을 하지 않음.
		// 그걸 막기 위해서 괄호를 친다.
		// 기본의 중요성.

		
		
		
	}

}
