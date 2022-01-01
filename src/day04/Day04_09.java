package day04;

import java.io.*;

public class Day04_09 {
	public static void main(String[] args)
	throws IOException{
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		
		System.out.print("국어 : ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("영어 : ");
		int eng = Integer.parseInt(br.readLine());
		//입력받는 값을 바로 넘기기
		
		System.out.print("과학 : ");
		String s_sci = br.readLine();
		System.out.print("수학 : ");
		String s_math = br.readLine();
		//기존 작성했던 코드.
		
		int sci = Integer.parseInt(s_sci);
		int math = Integer.parseInt(s_math);
		//한번밖에 안쓰이는 변수 때문에 메모리가 할당된다. 비효율.
		
		int sum = kor+eng+sci+math;
		int avg = (kor+eng+sci+math) /4;
		
		System.out.println("점수 현황 ");
		
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("과학 : "+sci);
		System.out.println("수학 : "+math);		
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		
	}

}
