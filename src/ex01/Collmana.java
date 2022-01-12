package ex01;

import java.io.*;

class Coll {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int sum = 0;
	String name;
	int age;
	String major;

	public void setInfo() throws IOException { // 입력

		System.out.print("이름 :");
		name = br.readLine();
		System.out.print("나이 : ");
		age = Integer.parseInt(br.readLine());
		sum++;
	}
	public void getInfo() { // 출력
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}

class Teach extends Coll { // 선생님

	public void setInfo() // 입력
			throws IOException {
		System.out.println("==선생님 정보 입력==");
		super.setInfo();
		System.out.print("과목 : ");
		major = br.readLine();
		System.out.println();
	}
	public void getInfo() {
		super.getInfo();
		System.out.println("과목 : " + major);
		System.out.println();
	}
}

class Stu extends Coll { // 학생

	public void setInfo() throws IOException {
		System.out.println("==학생 정보 입력==");
		super.setInfo();
		System.out.print("전공 : ");
		major = br.readLine();
		System.out.println();
	}
	public void getInfo() {
		super.getInfo();
		System.out.println("전공 : " + major);
		System.out.println();
	}
}

class CollArr {

	Coll[] ca = new Coll[10];
	Coll cl = new Coll();
	
	public void setInfo(int num) 
	throws IOException{
		if (cl.sum > 9) {
			System.out.println("공간이 부족합니다.");
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
		if(num==3) System.out.println("==선생님 정보==");
		if(num==4) System.out.println("==학생 정보==");
		if(num==5) System.out.println("==전체 정보==");
		for (int i = 0; i < ca.length; i++) {
			if (ca[i] == null) {break;}
			if((num==3&&ca[i] instanceof Teach) ||
				(num==4&&ca[i] instanceof Stu) || num==5) { 
				//인스턴스오브 : 해당 객체가 맞는지
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
		System.out.println("학사관리 프로그램 ver1.0");
		System.out.println("-----------------------");
		System.out.println("1.선생님 정보 입력");
		System.out.println("2.학생 정보 입력");
		System.out.println("3.선생님 정보 출력");
		System.out.println("4.학생 정보 출력");
		System.out.println("5.모든 정보 출력");
		System.out.println("6. 종료");
		System.out.println("------------------------");
		while(true) {
			System.out.print("메뉴 >");
			menu = Integer.parseInt(br.readLine());
			
			switch(menu) {
			case 1 : case 2 : 
				ca.setInfo(menu);
				break;
			case 3 : case 4 : case 5 :
				ca.getInfo(menu);
				break;				
			case 6 : 
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
			
			}	
		}
	}
}
