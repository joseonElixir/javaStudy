package day12;

import java.io.*;

public class BaseballGame_T {

	public static void main(String[] args) 
	throws IOException{
		
		System.out.println("---------------------");
		System.out.println("���� �߱� ���� v1.0");
		System.out.println("---------------------");

		int com[]= new int[3];
		
		for(int i=0; i<com.length;i++) {
			
			com[i]=(int)(Math.random()*9+1); //�����߻� +����ȯ
			for(int j=0;j<i;j++) { //�ߺ��˻� 
				if(com[j]==com[i]) { 
					i--;
					break;
				}
			}
			
		}
		
		//test code
		for(int i=0;i<com.length;i++) {
			System.out.println(com[i]+" ");
		}
		System.out.println();
		//test code
		
		for(int k=1;k<=10;k++){ // �� 10ȸ�� ����
			
			int user[]= new int[3];
			
			System.out.print(k+"ȸ�� �Է� : ");
			for(int i=0;i<user.length;i++) {
				user[i]=System.in.read()-48; //���ۿ� ����� ���� �о����, 
				//����� ���� ������ �Է��� �޴´�. �׷��⿡ ���ӵ� ���� 3���� �Է��ϸ�
				//���ۿ� 3���� ���ڰ� �Էµǰ�, ���Ͱ��� ���۰� ���´�.
				
			}
			System.in.skip(2);
			//���Ͱ��� ���� �����͸� ��ŵ���� ��������.
			
			//test code
			for(int i=0;i<user.length;i++) {
				System.out.print(user[i]+" ");
			}
			
			int str=0;
			int ball=0;
			
			for(int i=0;i<com.length;i++) { //�� �����
				for(int j=0;j<user.length;j++) { // �� �����
					if(com[i]==user[j]&& i==j) { //���� �ڸ����� ���� ��
						str++;
					}else if(com[i]==user[j]&&i!=j) { //���� ���� �ڸ����� �ٸ� ��
						ball++;
					}
				}	
			}
			System.out.println(": "+str+" strike, "+ball+" ball.");
			if(str==3) {
				System.out.println("�����Դϴ�!");
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			}	
		}
		System.out.println("10���� ��ȸ�� ��� �����Ͽ����ϴ�.");
		System.out.println("���α׷��� �����մϴ�.");
		
	}

}
