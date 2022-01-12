package day18;

import java.io.*;

class Human{

	String name;
	int age;
	
	/**사람의 정보 입력 관련 메소드*/
	public void setInfo(BufferedReader br) throws IOException{
		System.out.print("이름 : ");
		name = br.readLine();
		System.out.print("나이 : ");
		age = Integer.parseInt(br.readLine());
	}
	
	/**사람의 정보를 출력하는 메소드*/
	public void getInfo() {
		System.out.println("이릅 : "+name);
		System.out.println("나이 : "+age);
	}
}

class Teacher extends Human{
	String text;
	
	@Override
	public void setInfo(BufferedReader br) throws IOException {
		System.out.println("==선생님 정보 입력==");
		super.setInfo(br);
		System.out.print("과목 : ");
		text = br.readLine(); //실행 시점에서 부모의 기능을 쓸 수는 없다.
		//이렇게 설계 과정에서만 부모의 기능을 상속받아 사용 가능.
	}
	@Override
	public void getInfo() {
		System.out.println("==선생님 정보==");
		super.getInfo();
		System.out.println("과목 : "+text);
	}
}

class Student extends Human {
	
	String major;
	
	@Override
	public void setInfo(BufferedReader br) throws IOException {
		System.out.println("==학생 정보 입력==");
		super.setInfo(br);
		System.out.print("전공 : ");
		major = br.readLine();
	}
	@Override
	public void getInfo() {
		System.out.println("==학생 정보==");
		super.getInfo();
		System.out.println("전공 : "+ major);
	}
}




public class Haksa_T { //Haksa_T가 주 객체가 된다. 일반적인 객체 클래스에 선언되는 방식을 따름.
	
	Human arr[]; //Human 클래스의 객체배열
	int count; //멤버변수 count
	
	public Haksa_T() { //생성자
		count=0; //초기화
		arr=new Human[10]; 
		// 객체배열은 주소를 할당받은 것. null 배열 갯수만큼읜 생성자를 호출했다고 보면 됨.
		//인스턴스 배열의 초기화는 공간할당. 값은 null이라는것을 인지.
	}
	
	/**메뉴 출력 관련 메소드*/
	public void menuPrint() { //메뉴를 출력하는 메소드. 기능의 모듈화를 인지할 것.
		System.out.println("====================");
		System.out.println("학사관리 프로그램 v1.0");
		System.out.println("--------------------");
		System.out.println("1. 선생님 정보 입력 ");
		System.out.println("2. 학생 정보 입력");
		System.out.println("3. 선생님 정보 출력");
		System.out.println("4. 학생 정보 출력");
		System.out.println("5. 모든 정보  출력");
		System.out.println("6. 종료");
		System.out.println("====================");
	
	}
	
	
	/**선생님 정보 입력 관련 메소드*/ 
	public void inputTeacher(BufferedReader br) //기능의 모듈화.
	throws IOException{
		if(count>9) {
			System.out.println("데이터 공간이 부족합니다");
			return;
		}
		arr[count] = new Teacher();
		arr[count].setInfo(br);
		count ++;
	}
	
	/**학생 정보 입력 관련 메소드*/
	public void inputStudent(BufferedReader br) 
	throws IOException{
		//굳이 하나의 입력을 받고 그 안에서 유효성 검사를 하지 않는 이유는
		//기능의 모듈화를 위한 것.
		if(count >9) {
			System.out.println("데이터 공간이 부족합니다");
			return;
		}
		arr[count]= new Student();
		arr[count].setInfo(br);
		count++;
		
	}
	/**모든 정보 출력 메소드*/
	public void allPrintInfo() { 
		//정보출력 기능에도 모듈화가 이루어짐. 입력에 따른 논리값으로 출려값을 정할 수 있지만,
		//각 기능이 독립되어있음을 인지하기 위한 모듈화.						
		for(int i=0;i<count;i++) {
			arr[i].getInfo();
		}
	}
	/**선생님 정보 출력 메소드*/
	public void printTeacher() {
		//정보를 출력함에 있어서도 입력값을 받아서 해당 값에 따른
		//조건식으로 출력을 컨트롤 할 수 있지만, 독립된 기능으로 구현하는 것이
		//훨씬 가독성 있다.
		for(int i=0;i<count;i++) {
			if(arr[i] instanceof Teacher) {
				arr[i].getInfo();
			}
		}
	}
	
	/**학생 정보 출력 메소드*/
	public void printStudent() {
		//외부 입력 값에 의해 기능이 변경될 수 있는 사항은 최대한 줄이는 것이 좋다.
		//직접적인 값을 입력받는 것을 최소화할 것.
		for(int i=0; i<count;i++) {
			if(arr[i] instanceof Student) {
				arr[i].getInfo();
			}
		}
	}
	
	public static void main(String[] args) 
	throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Haksa_T ht = new Haksa_T();
		
		while(true) {
			ht.menuPrint();
			int menu = 0;
			System.out.print("메뉴 >");
			menu =Integer.parseInt(br.readLine());
			
			switch(menu) {
			
			case 1: ht.inputTeacher(br); break;
			case 2: ht.inputStudent(br); break;
			case 3:ht.printTeacher(); break;
			case 4:ht.printStudent(); break;
			case 5: ht.allPrintInfo(); break;
			case 6:System.out.println();System.exit(0);
			}
		
		}
		
		
	}
	
}
