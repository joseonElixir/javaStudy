package ex01;

import java.io.*;
import java.nio.Buffer;

interface CollPeople { //���� ����� �������̽�

	public static String PEOPLE[][] = new String[10][4];
	String TEACHER = "1";
	String STUDENT = "0";

}

class PeopleManage implements CollPeople { // �ο��� ���� �θ�Ŭ����

	static  int num = 0;

	public PeopleManage() {// ������

	}

	public void getInfo() { // �������̽��� ����� ���� ���� ���.

		System.out.println("==��� ����==");
		for (int i = 0; i < PEOPLE.length; i++) {
			if (PEOPLE[i][0] == null) {
				break;
			}
			int peo = Integer.parseInt(PEOPLE[i][0]);
			for (int j = 1; j < PEOPLE[i].length; j++) {
				switch (j) {
				case 1:
					System.out.print("�̸� : ");
					break;
				case 2:
					System.out.print("���� : ");
					break;
				case 3:
					if (peo == 1) { //�������� ��� ����, �л��� ��� ����
						System.out.print("���� : ");
					} else {
						System.out.print("���� : ");
					}
				}// switch�� ����.
				System.out.println(PEOPLE[i][j]);
			} // for�� ����.
			System.out.println();
		} // ū for�� ����.
		System.out.println("---------------------");
	}// Method ����.

}// PeopleManage ����.

class TeachManage extends PeopleManage { // ������ ���� �����.

	public TeachManage() { // �⺻ ������

	}

	public void setTeacherInfo() // ������ ���� �Է�. static num���� ������Ų��.
			throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		if (num < 10) { //num���� 10 �̸��϶� �Է¹ް� �������� �������´�.

			PEOPLE[num][0] = TEACHER; //0��°���� �л����� �������� ��ϵȴ�.
			System.out.println("==������ ���� �Է�==");
			System.out.print("�̸� : ");
			PEOPLE[num][1] = br.readLine();
			System.out.print("���� : ");
			PEOPLE[num][2] = br.readLine();
			System.out.print("���� : ");
			PEOPLE[num][3] = br.readLine();
			num++;
		} else {
			System.out.println("�뷮�� ���� á���ϴ�");
		}
	}

	public void getTeacherInfo() { // ������ ���� ��� �޼ҵ�

		System.out.println("==������ ����==");
		for (int i = 0; i < PEOPLE.length; i++) {
			if (PEOPLE[i][0] == null) { //���� ������� ��쿡 ���� �� �����Ƿ� ��ü�� �������´�.
				break;
			}
			int peo = Integer.parseInt(PEOPLE[i][0]); //�л����� �������� �����ϴ°�.
			for (int j = 1; j < PEOPLE[i].length; j++) {
				if (peo != 1) {
					break;
				}
				switch (j) {
				case 1:
					System.out.print("�̸� : ");
					break;
				case 2:
					System.out.print("���� : ");
					break;
				case 3:
					System.out.print("���� : ");
				}
				System.out.println(PEOPLE[i][j]);
			}
		} // for end
		System.out.println("---------------------");
	}// Method End
}// class end

class StuManage extends PeopleManage {

	public StuManage() {

	}

	public void setStuInfo() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		if (num < 10) {
			PEOPLE[num][0] = STUDENT;
			System.out.println("==�л� ���� �Է�==");
			System.out.print("�̸� : ");
			PEOPLE[num][1] = br.readLine();
			System.out.print("���� : ");
			PEOPLE[num][2] = br.readLine();
			System.out.print("���� : ");
			PEOPLE[num][3] = br.readLine();
			num++;
		} else {
			System.out.println("�뷮�� ���� á���ϴ�.");
		}

	}

	public void getStuInfo() { // �л� ���� ��� 
		System.out.println("==�л� ����==");
		for (int i = 0; i < PEOPLE.length; i++) {
			if (PEOPLE[i][0] == null) {
				break;
			}
			int peo = Integer.parseInt(PEOPLE[i][0]);
			for (int j = 1; j < PEOPLE[i].length; j++) {
				if (peo != 0) {
					break;
				}
				switch (j) {
				case 1:
					System.out.print("�̸� : ");
					break;
				case 2:
					System.out.print("���� : ");
					break;
				case 3:
					System.out.print("���� : ");
				}
				System.out.println(PEOPLE[i][j]);
			}
		}//for end
		System.out.println("----------------");

	}

}

public class CollPeopleManage {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int menu;

		System.out.println("�л���� ���α׷� Ver1.0");
		
		PeopleManage cm = new PeopleManage();
		StuManage sm = new StuManage();
		TeachManage tm = new TeachManage();

		System.out.println("--------------------------");
		System.out.println("1. ������ ���� �Է�");
		System.out.println("2. �л� ���� �Է�");
		System.out.println("3. ������ ���� Ȯ��");
		System.out.println("4. �л� ���� Ȯ��");
		System.out.println("5. ��� ���� Ȯ��");
		System.out.println("6. ����");
		System.out.println("--------------------------");

		while (true) {

			System.out.print("�޴� > ");
			menu = Integer.parseInt(br.readLine());

			switch (menu) {
			case 1:
				tm.setTeacherInfo();
				break;
			case 3:
				tm.getTeacherInfo();
				break;
			case 2:
				sm.setStuInfo();
				break;
			case 4:
				sm.getStuInfo();
				break;
			case 5:
				cm.getInfo();
				break;
			case 6:
				System.out.println("�ý����� �����մϴ�");
				System.exit(0);
			}

		}

	}

}
