package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Collage {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String name;
	int age;

	public void setInfo() throws IOException {
		System.out.print("�̸�:");
		name = br.readLine();
		System.out.print("����:");
		age = Integer.parseInt(br.readLine());
	}

	public void getInfo() {
		System.out.println("�̸�:" + name);
		System.out.println("����:" + age);
	}
}

class Teacher_T extends Collage {

	String subject;

	@Override
	public void setInfo() throws IOException {
		System.out.println("==���� ���� �Է� ==");
		super.setInfo();
		System.out.print("����:");
		subject = br.readLine();
	}

	@Override
	public void getInfo() {
		System.out.println("==���� ����==");
		super.getInfo();
		System.out.println("����:" + subject);
	}
}

class Student_T extends Collage {

	String major;

	@Override
	public void setInfo() throws IOException {
		System.out.println("==�л� ���� �Է� ==");
		super.setInfo();
		System.out.print("����:");
		major = br.readLine();
	}

	@Override
	public void getInfo() {
		System.out.println("==�л� ����==");
		super.getInfo();
		System.out.println("����:" + major);
	}
}

class Manage { // ����

	Collage manage[];
	int count;

	public Manage() {
		manage = new Collage[10];
		count = 0;
	}

	public void setInfoT() throws IOException {
		if(count>9) {
			System.out.println("������ �����ϴ�");
			return;
		}
			
		manage[count] = new Teacher_T();
		manage[count].setInfo();
		count++;
	}

	public void getInfoT() {
		for (int i = 0; i < manage.length; i++) {
			if (manage[i] instanceof Teacher_T) {
				manage[i].getInfo();
			}
		}
	}

	public void setInfoS() throws IOException {
		if(count>9) {
			System.out.println("������ �����ϴ�");
			return;
		}
		manage[count] = new Student_T();
		manage[count].setInfo();
		count++;
	}

	public void getInfoS() {
		for (int i = 0; i < manage.length; i++) {
			if (manage[i] instanceof Student_T) {
				manage[i].getInfo();
			}
		}
	}

	public void getInfo() {
		for (int i = 0; i < manage.length; i++) {
			if(manage[i]==null)
				return;
			
			manage[i].getInfo();
		}
	}
}

class PrintInfo {

	public void printInfo() {
		System.out.println("1.���������Է�");
		System.out.println("2.�л������Է�");
		System.out.println("3.�����������");
		System.out.println("4.�л��������");
		System.out.println("5.��ü�������");
		System.out.println("6.����");
	}
}

public class Haksa_T {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Manage mn = new Manage();
		while(true) {
			
		PrintInfo pr = new PrintInfo();
		pr.printInfo();
		System.out.print("�޴�>");
		int user = Integer.parseInt(br.readLine());
			switch (user) {
			case 1:
				mn.setInfoT();
				break;
			case 2:
				mn.setInfoS();
				break;
			case 3:
				mn.getInfoT();
				break;
			case 4:
				mn.getInfoS();
				break;
			case 5:
				mn.getInfo();
				break;
			case 6:
				System.out.println("�ý��� ����");
				System.exit(0);
	
			}
		}

	}

}
