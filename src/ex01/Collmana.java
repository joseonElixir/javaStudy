package ex01;

import java.io.*;

class Coll {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int sum = 0;
	String name;
	int age;
	String major;

	public void setInfo() throws IOException { // �Է�

		System.out.print("�̸� :");
		name = br.readLine();
		System.out.print("���� : ");
		age = Integer.parseInt(br.readLine());
		sum++;
	}
	public void getInfo() { // ���
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
}

class Teach extends Coll { // ������

	public void setInfo() // �Է�
			throws IOException {
		System.out.println("==������ ���� �Է�==");
		super.setInfo();
		System.out.print("���� : ");
		major = br.readLine();
		System.out.println();
	}
	public void getInfo() {
		super.getInfo();
		System.out.println("���� : " + major);
		System.out.println();
	}
}

class Stu extends Coll { // �л�

	public void setInfo() throws IOException {
		System.out.println("==�л� ���� �Է�==");
		super.setInfo();
		System.out.print("���� : ");
		major = br.readLine();
		System.out.println();
	}
	public void getInfo() {
		super.getInfo();
		System.out.println("���� : " + major);
		System.out.println();
	}
}

class CollArr {

	Coll[] ca = new Coll[10];
	Coll cl = new Coll();
	
	public void setInfo(int num) 
	throws IOException{
		if (cl.sum > 9) {
			System.out.println("������ �����մϴ�.");
			return;
		}
		if(num==1) {
			ca[cl.sum]= new Teach();
		}else if(num==2){
			ca[cl.sum]= new Stu();
		}
		ca[cl.sum].setInfo();
	}
	
	public void getInfo(int num) {
		if(num==3) System.out.println("==������ ����==");
		if(num==4) System.out.println("==�л� ����==");
		if(num==5) System.out.println("==��ü ����==");
		for (int i = 0; i < ca.length; i++) {
			if (ca[i] == null) {break;}
			if((num==3&&ca[i] instanceof Teach) ||
				(num==4&&ca[i] instanceof Stu) || num==5) { 
				//�ν��Ͻ����� : �ش� ��ü�� �´���
				ca[i].getInfo();															
			}	
		}
	}
}

public class Collmana {

	public static void main(String[] args) 
	throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		CollArr ca = new CollArr();
		
		int menu;
		System.out.println("=======================");
		System.out.println("�л���� ���α׷� ver1.0");
		System.out.println("-----------------------");
		System.out.println("1.������ ���� �Է�");
		System.out.println("2.�л� ���� �Է�");
		System.out.println("3.������ ���� ���");
		System.out.println("4.�л� ���� ���");
		System.out.println("5.��� ���� ���");
		System.out.println("6. ����");
		System.out.println("------------------------");
		while(true) {
			System.out.print("�޴� >");
			menu = Integer.parseInt(br.readLine());
			
			switch(menu) {
			case 1 : case 2 : 
				ca.setInfo(menu);
				break;
			case 3 : case 4 : case 5 :
				ca.getInfo(menu);
				break;				
			case 6 : 
				System.out.println("�ý����� �����մϴ�.");
				System.exit(0);
			
			}	
		}
	}
}
