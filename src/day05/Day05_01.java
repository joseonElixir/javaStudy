package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day05_01 {

	public static void main(String[] args) 
	throws IOException {
		
		BufferedReader br = 
		new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���� ������ �Է�:");
		double rad = Double.parseDouble(br.readLine());
		// br.readLine()���� �Է¹޴� ���� �ٷ� ��ȯ�Ͽ� ������ �����ϱ�.
		// ���� String�� ����� ������ �� �ʿ䰡 ����.
		
		double cirarea = rad * rad * Math.PI;
		double circ = 2 * rad * Math.PI;
		
		System.out.println("�Էµ� ������ : " + rad);
		System.out.println("���� ���� : " + cirarea);
		System.out.println("���� �ѷ� : " + circ);
		
	}

}
