package ex01;

import java.io.*;
import java.nio.Buffer;

interface CollPeople { //값이 저장될 인터페이스

	public static String PEOPLE[][] = new String[10][4];
	String TEACHER = "1";
	String STUDENT = "0";

}

class PeopleManage implements CollPeople { // 인원수 관리 부모클래스

	static  int num = 0;

	public PeopleManage() {// 생성자

	}

	public void getInfo() { // 인터페이스에 저장된 정보 전부 출력.

		System.out.println("==모든 정보==");
		for (int i = 0; i < PEOPLE.length; i++) {
			if (PEOPLE[i][0] == null) {
				break;
			}
			int peo = Integer.parseInt(PEOPLE[i][0]);
			for (int j = 1; j < PEOPLE[i].length; j++) {
				switch (j) {
				case 1:
					System.out.print("이름 : ");
					break;
				case 2:
					System.out.print("나이 : ");
					break;
				case 3:
					if (peo == 1) { //선생님일 경우 과목, 학생일 경우 전공
						System.out.print("과목 : ");
					} else {
						System.out.print("전공 : ");
					}
				}// switch문 종료.
				System.out.println(PEOPLE[i][j]);
			} // for문 종료.
			System.out.println();
		} // 큰 for문 종료.
		System.out.println("---------------------");
	}// Method 종료.

}// PeopleManage 종료.

class TeachManage extends PeopleManage { // 선생님 정보 입출력.

	public TeachManage() { // 기본 생성자

	}

	public void setTeacherInfo() // 선생님 정보 입력. static num값을 증가시킨다.
			throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		if (num < 10) { //num값이 10 미만일때 입력받고 나머지는 빠져나온다.

			PEOPLE[num][0] = TEACHER; //0번째에는 학생인지 선생인지 기록된다.
			System.out.println("==선생님 정보 입력==");
			System.out.print("이름 : ");
			PEOPLE[num][1] = br.readLine();
			System.out.print("나이 : ");
			PEOPLE[num][2] = br.readLine();
			System.out.print("과목 : ");
			PEOPLE[num][3] = br.readLine();
			num++;
		} else {
			System.out.println("용량이 가득 찼습니다");
		}
	}

	public void getTeacherInfo() { // 선생님 정보 출력 메소드

		System.out.println("==선생님 정보==");
		for (int i = 0; i < PEOPLE.length; i++) {
			if (PEOPLE[i][0] == null) { //값이 비어있을 경우에 읽을 수 없으므로 전체를 빠져나온다.
				break;
			}
			int peo = Integer.parseInt(PEOPLE[i][0]); //학생인지 선생인지 구분하는값.
			for (int j = 1; j < PEOPLE[i].length; j++) {
				if (peo != 1) {
					break;
				}
				switch (j) {
				case 1:
					System.out.print("이름 : ");
					break;
				case 2:
					System.out.print("나이 : ");
					break;
				case 3:
					System.out.print("과목 : ");
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
			System.out.println("==학생 정보 입력==");
			System.out.print("이름 : ");
			PEOPLE[num][1] = br.readLine();
			System.out.print("나이 : ");
			PEOPLE[num][2] = br.readLine();
			System.out.print("전공 : ");
			PEOPLE[num][3] = br.readLine();
			num++;
		} else {
			System.out.println("용량이 가득 찼습니다.");
		}

	}

	public void getStuInfo() { // 학생 정보 출력 
		System.out.println("==학생 정보==");
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
					System.out.print("이름 : ");
					break;
				case 2:
					System.out.print("나이 : ");
					break;
				case 3:
					System.out.print("전공 : ");
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

		System.out.println("학사관리 프로그램 Ver1.0");
		
		PeopleManage cm = new PeopleManage();
		StuManage sm = new StuManage();
		TeachManage tm = new TeachManage();

		System.out.println("--------------------------");
		System.out.println("1. 선생님 정보 입력");
		System.out.println("2. 학생 정보 입력");
		System.out.println("3. 선생님 정보 확인");
		System.out.println("4. 학생 정보 확인");
		System.out.println("5. 모든 정보 확인");
		System.out.println("6. 종료");
		System.out.println("--------------------------");

		while (true) {

			System.out.print("메뉴 > ");
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
				System.out.println("시스템을 종료합니다");
				System.exit(0);
			}

		}

	}

}
