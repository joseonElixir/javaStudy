package day09;

import java.io.*;

public class Game {

	public static void main(String[] args) 
	throws IOException{
		
		while(true) {
			//�����ڵ�.
			//�̱�� ����� ���� ���� ����� ��, ���� ����� ���� ����ؼ�
			// �׷�ȭ �� switch case�� �ѱ�� ����.
			System.out.println("======================");
			System.out.println("���������� Ver1.0");
			System.out.println("----------------------");
			System.out.println("1.���� 2.���� 3.�� 4.����");
			System.out.println("======================");
			int user=0;
			int comp=0;
			do {
				System.out.println("�޴� > ");
				user = System.in.read()-48;
				System.in.skip(10);
			} while(!(1<=user&&user<=4));
			if(user==4){
				System.out.println("���α׷� ����");
				System.exit(0);
			}
			System.out.println("����� : " +user);
			comp = (int)(Math.random()*3+1);
			System.out.println("comp : "+comp);
			
			//�����ڵ带 �̿��ؼ� ���� �����.
			
			if(user==comp) {
				System.out.println("���º�");
			} else if ((user+1)%3==comp%3) {
				System.out.println("��ǻ�� ��");
				
			}else {
				System.out.println("����� ��.");
				
			}
			//���º��� ��� (1+0)%1 == (2+0)%2 == (3+0)%3 = 0
			//�й��� ��� (1+1)%2 == (2+1)%3 == (3+1)%1 = 
			//�¸��� ��� (1+2)%3 == (2+2)%1 == (3+2)%2 = 
			//��� ���� �����ڵ带 ���� �׷�ȭ. 
			//�� �����ڵ�� ��ȯ�Ͽ� ��Ģ���� �°� �׷�ȭ��ų �� �ִ� ���� ã�Ƴ�.
			//������ 3+1�� 1�� ����� ��Ģ���� ������ ��.
			
//			switch(user - comp) {
//			case -2 : case 1 : 
//				System.out.println("����� ��"); break;
//			case 0 : 
//				System.out.println("���º�"); break;
//			case -1 : case 2 : 
//				System.out.println("��ǻ�� ��");
//	
//			}
			//����if���� ���ϱ� ���� ������� switch case��.	
			//������� �׷�ȭ�ؼ� ������ �ܼ�ȭ ���״�.
			//��ǻ�Ͱ� ������ �ϴ� ���� �ƴ� ����� ������ �ϴ� �ڵ�.
			//�ٽ� Ű���� : �������� �׷�ȭ. �׸��� �׷�ȭ�� �������� ó��.
			
		}
		
	}

}
