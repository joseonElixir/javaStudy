package day06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day06_04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = 
		new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ �Է��Ͻÿ�. ���� :");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("������ �Է��Ͻÿ�. ���� :");
		int mat = Integer.parseInt(br.readLine());
		System.out.print("������ �Է��Ͻÿ�. ���� :");
		int eng = Integer.parseInt(br.readLine());

		int sum = kor + mat + eng;
		int avg = sum / 3;
		char grade = 'F';
		
		switch ((avg)/10) {
		case 10:		
			//switch�� Ư¡. 
			//10���� �Ѿ���� break�� ������ �������� �����ϱ� ������ grade ='A'
		case 9:grade = 'A'; break;
		case 8:grade = 'B'; break;
		case 7:grade = 'C'; break;
		case 6:grade = 'D'; break;
		default:grade= 'F'; break;
		//�ڵ带 ��Ȯ�ϰ� �ϱ� ���ؼ� default���� F�� �ִ´�.
		//�ʱ�ȭ ��ÿ� ����ִ� ���� F�̱� ������ �ȳ־ ������ �ִ°� �����Ѵ�.
		
		}
		System.out.println("���� : "+sum);
		System.out.println("��� : "+avg);
		System.out.println("��� : "+grade);

	}

}
