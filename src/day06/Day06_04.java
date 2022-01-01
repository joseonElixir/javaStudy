package day06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day06_04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = 
		new BufferedReader(new InputStreamReader(System.in));

		System.out.print("점수를 입력하시오. 국어 :");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("점수를 입력하시오. 수학 :");
		int mat = Integer.parseInt(br.readLine());
		System.out.print("점수를 입력하시오. 영어 :");
		int eng = Integer.parseInt(br.readLine());

		int sum = kor + mat + eng;
		int avg = sum / 3;
		char grade = 'F';
		
		switch ((avg)/10) {
		case 10:		
			//switch의 특징. 
			//10으로 넘어갔을때 break를 만나기 전까지를 수행하기 때문에 grade ='A'
		case 9:grade = 'A'; break;
		case 8:grade = 'B'; break;
		case 7:grade = 'C'; break;
		case 6:grade = 'D'; break;
		default:grade= 'F'; break;
		//코드를 명확하게 하기 위해서 default값에 F를 넣는다.
		//초기화 당시에 깔려있는 값이 F이기 때문에 안넣어도 되지만 넣는걸 권장한다.
		
		}
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println("등급 : "+grade);

	}

}
