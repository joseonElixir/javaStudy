package day06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day06_07 {

	public static void main(String[] args) 
	throws IOException{
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		
		System.out.println("������");
		System.out.print("�� �Է� :");
		int gugu = Integer.parseInt(br.readLine());
		
		System.out.println(gugu+"�� ����.\n");
		for(int count = 1 ;count <=9;count++) { 
			//for���� �������� count ���� �� 1�� �ʱ�ȭ. (�ʱⰪ)
			//true�� �Ǵ� ���ǽ��� �ۼ� ; ������ �Է�, ���ǹ��� �������� �����ؼ� ���ϴ� Ÿ�ֿ̹�
			//������������ Ȯ��.
			//if���� Ư¡ : if������ ����ϰ� ���� �ڵ尡 1���̸� ���������� �����൵ ��.
			System.out.println(gugu+"*"+count+"="+(gugu*count));
			
		}
		
	}

}
