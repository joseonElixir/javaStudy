package game;

import java.io.*;

public class Game02 {

	public static void main(String[] args) 
	throws IOException{
		//������� �������� 
		//�׿� ���� ���ϰ��� �ִ� ���.
		//
		while(true) {
			
			
			int user=0;
			int comp = 0;
			int res =0;
			String s_user ="";
			String s_comp="";
			String s_res="";
			System.out.println("���������� Ver2.0");
			System.out.println("1.���� 2���� 3.�� 4.����");
			
			do {
				System.out.print("�Է�> ");
				user = System.in.read() - '0';
				System.in.skip(100);
				if(user==4) {
					System.out.println("������� �Է¿� ���� ��ǻ�͸� �����մϴ�.");
					System.exit(0);
				}
			} while (!(1<=user&&user<=4));
			
			res = (int)(Math.random()*3+1);
			
			
			switch(res){
			
			case 1: 
				s_res = "����� ��!";
				if(user == 1) {
					comp=3;
				}
				else if (user == 2) {
					comp=1;
					}
				else {
					comp=2;
				}
				break;
			
			case 2:
				s_res = "��ǻ�� ��!";
				switch(user) {
				case 1: comp=2; break;
				case 2: comp=3; break;
				case 3: comp=1; break;
				}
				break;
				
			case 3:
				comp=user;
				s_res = "���º�! �ٽ�!";
				break;
		
			}
			
			switch(user) {
			case 1 : s_user="����"; break;
			case 2 : s_user="����"; break;
			case 3 : s_user="��"; break;
			
			}
			
			switch(comp) {
			case 1 : s_comp="����"; break;
			case 2 : s_comp="����"; break;
			case 3 : s_comp="��"; break;
			
			}
			
			System.out.println("����� : "+s_user);		
			System.out.println("��ǻ�� : "+s_comp);
			System.out.println(s_res);
			System.out.println();
		
		}
			
	}


}
