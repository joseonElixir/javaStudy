package day04;

import java.io.*;

public class Day04_08 {
	public static void main(String[] args) 
	throws IOException {
		BufferedReader br = 
		new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("ù��° �� :");
		String s_num1=br.readLine();
		
		System.out.print("�ι�° �� :");
		String s_num2=br.readLine();		
		int num1 = Integer.parseInt(s_num1);
		int num2 = Integer.parseInt(s_num2);
		//Integer Ŭ������ ������ �ִ� parsInt �޼ҵ带 ����
		//String type�� s_num1�� int type���� ��ȯ�Ѵ�.
		
		System.out.println
		(s_num1 +"+"+ s_num2+"="+(num1+num2));
		//���� Ŭ����. �� : ���δ�.
		//�⺻ �ڷ����� ��ȣ�ϱ� ���� �������.
		// �⺻ �ڷ����� ����Ҽ��� ���ȿ� �������.
		//������ ũ�⸦ ������ �� �ֱ� ���� int = 4byte
		//�׷��⿡ ����Ŭ������ ���μ� ����� ��.
		//���� 4byte.
		
		//pars, parsing 
		//�����ٸ� ������ Ÿ���� ��ȯ�ϴ� �۾��� ��Ī.
		//static ���� �޸��Ҵ�.
	
	
	
	
	}
}