package day04;

import java.io.*;

public class Day04_09 {
	public static void main(String[] args)
	throws IOException{
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		
		System.out.print("���� : ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("���� : ");
		int eng = Integer.parseInt(br.readLine());
		//�Է¹޴� ���� �ٷ� �ѱ��
		
		System.out.print("���� : ");
		String s_sci = br.readLine();
		System.out.print("���� : ");
		String s_math = br.readLine();
		//���� �ۼ��ߴ� �ڵ�.
		
		int sci = Integer.parseInt(s_sci);
		int math = Integer.parseInt(s_math);
		//�ѹ��ۿ� �Ⱦ��̴� ���� ������ �޸𸮰� �Ҵ�ȴ�. ��ȿ��.
		
		int sum = kor+eng+sci+math;
		int avg = (kor+eng+sci+math) /4;
		
		System.out.println("���� ��Ȳ ");
		
		System.out.println("���� : "+kor);
		System.out.println("���� : "+eng);
		System.out.println("���� : "+sci);
		System.out.println("���� : "+math);		
		System.out.println("���� : "+sum);
		System.out.println("��� : "+avg);
		
	}

}
