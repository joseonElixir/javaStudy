package day00;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day00_ex03 {
	
	public static void main(String[] args) 
	throws IOException{
		//���±��� ��� �͵� ����
		//System Ŭ���� ����� Stream
		//������ ����
		//���׿����� 
		//���ڿ� �Է¹޴� BufferedReader Ŭ����
		//if�� 
	BufferedReader br = new BufferedReader 
			(new InputStreamReader(System.in));
	System.out.print("���� �Է� : ");
	int num = Integer.parseInt(br.readLine());
	
	char grade =num <= 100 && num>80 ?
			'A':(num <= 80 && num > 60? 'B': 'C');
	
	System.out.println("Grade : " + grade);
	
	if(grade == 'A') {
		System.out.println("�� ���߾��.");
	} else if (grade =='B') {
		System.out.println("�� ���߾��");
	}else {
		System.out.println(grade+"�߷���");
	}
	
	}
}
