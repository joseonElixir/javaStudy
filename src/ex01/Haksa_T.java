package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Collage {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String name;
	int age;

	public void setInfo() throws IOException {
		System.out.print("이름:");
		name = br.readLine();
		System.out.print("나이:");
		age = Integer.parseInt(br.readLine());
	}

	public void getInfo() {
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
	}
}

class Teacher_T extends Collage {

	String subject;

	@Override
	public void setInfo() throws IOException {
		System.out.println("==선생 정보 입력 ==");
		super.setInfo();
		System.out.print("과목:");
		subject = br.readLine();
	}

	@Override
	public void getInfo() {
		System.out.println("==선생 정보==");
		super.getInfo();
		System.out.println("과목:" + subject);
	}
}

class Student_T extends Collage {

	String major;

	@Override
	public void setInfo() throws IOException {
		System.out.println("==학생 정보 입력 ==");
		super.setInfo();
		System.out.print("전공:");
		major = br.readLine();
	}

	@Override
	public void getInfo() {
		System.out.println("==학생 정보==");
		super.getInfo();
		System.out.println("전공:" + major);
	}
}

class Manage { // 관리

	Collage manage[];
	int count;

	public Manage() {
		manage = new Collage[10];
		count = 0;
	}

	public void setInfoT() throws IOException {
		if(count>9) {
			System.out.println("공간이 부족하다");
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
			System.out.println("공간이 부족하다");
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
		System.out.println("1.선생정보입력");
		System.out.println("2.학생정보입력");
		System.out.println("3.선생정보출력");
		System.out.println("4.학생정보출력");
		System.out.println("5.전체정보출력");
		System.out.println("6.종료");
	}
}

public class Haksa_T {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Manage mn = new Manage();
		while(true) {
			
		PrintInfo pr = new PrintInfo();
		pr.printInfo();
		System.out.print("메뉴>");
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
				System.out.println("시스템 종료");
				System.exit(0);
	
			}
		}

	}

}
