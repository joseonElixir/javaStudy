package day05;

import java.io.*;

public class Day05_06 {

	public static void main(String[] args) 
	throws IOException{
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("==��ȭ���� �ֹ� ARS ���α׷��Դϴ�==");
		System.out.println("1.¥�� 2.«�� 3.������ 4.�Ⱥ�ä");
		
		System.out.print("�޴�>");
		int menu = Integer.parseInt(br.readLine());
		
		if(menu==1) {
			System.out.println("¥�� �ֹ� �Ϸ�");
		}else if(menu==2) {
			System.out.println("«�� �ֹ� �Ϸ�");
		}else if(menu==3) {
			System.out.println("������ �ֹ� �Ϸ�");
		}else if(menu==4) {
			System.out.println("�Ⱥ�ä �ֹ� �Ϸ�");
		}else {
			System.out.println("�߸��� �Է��Դϴ�."); 
		}
		
		
		
		
	
	}

}
