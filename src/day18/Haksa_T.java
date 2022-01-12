package day18;

import java.io.*;

class Human{

	String name;
	int age;
	
	/**����� ���� �Է� ���� �޼ҵ�*/
	public void setInfo(BufferedReader br) throws IOException{
		System.out.print("�̸� : ");
		name = br.readLine();
		System.out.print("���� : ");
		age = Integer.parseInt(br.readLine());
	}
	
	/**����� ������ ����ϴ� �޼ҵ�*/
	public void getInfo() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
	}
}

class Teacher extends Human{
	String text;
	
	@Override
	public void setInfo(BufferedReader br) throws IOException {
		System.out.println("==������ ���� �Է�==");
		super.setInfo(br);
		System.out.print("���� : ");
		text = br.readLine(); //���� �������� �θ��� ����� �� ���� ����.
		//�̷��� ���� ���������� �θ��� ����� ��ӹ޾� ��� ����.
	}
	@Override
	public void getInfo() {
		System.out.println("==������ ����==");
		super.getInfo();
		System.out.println("���� : "+text);
	}
}

class Student extends Human {
	
	String major;
	
	@Override
	public void setInfo(BufferedReader br) throws IOException {
		System.out.println("==�л� ���� �Է�==");
		super.setInfo(br);
		System.out.print("���� : ");
		major = br.readLine();
	}
	@Override
	public void getInfo() {
		System.out.println("==�л� ����==");
		super.getInfo();
		System.out.println("���� : "+ major);
	}
}




public class Haksa_T { //Haksa_T�� �� ��ü�� �ȴ�. �Ϲ����� ��ü Ŭ������ ����Ǵ� ����� ����.
	
	Human arr[]; //Human Ŭ������ ��ü�迭
	int count; //������� count
	
	public Haksa_T() { //������
		count=0; //�ʱ�ȭ
		arr=new Human[10]; 
		// ��ü�迭�� �ּҸ� �Ҵ���� ��. null �迭 ������ŭ�� �����ڸ� ȣ���ߴٰ� ���� ��.
		//�ν��Ͻ� �迭�� �ʱ�ȭ�� �����Ҵ�. ���� null�̶�°��� ����.
	}
	
	/**�޴� ��� ���� �޼ҵ�*/
	public void menuPrint() { //�޴��� ����ϴ� �޼ҵ�. ����� ���ȭ�� ������ ��.
		System.out.println("====================");
		System.out.println("�л���� ���α׷� v1.0");
		System.out.println("--------------------");
		System.out.println("1. ������ ���� �Է� ");
		System.out.println("2. �л� ���� �Է�");
		System.out.println("3. ������ ���� ���");
		System.out.println("4. �л� ���� ���");
		System.out.println("5. ��� ����  ���");
		System.out.println("6. ����");
		System.out.println("====================");
	
	}
	
	
	/**������ ���� �Է� ���� �޼ҵ�*/ 
	public void inputTeacher(BufferedReader br) //����� ���ȭ.
	throws IOException{
		if(count>9) {
			System.out.println("������ ������ �����մϴ�");
			return;
		}
		arr[count] = new Teacher();
		arr[count].setInfo(br);
		count ++;
	}
	
	/**�л� ���� �Է� ���� �޼ҵ�*/
	public void inputStudent(BufferedReader br) 
	throws IOException{
		//���� �ϳ��� �Է��� �ް� �� �ȿ��� ��ȿ�� �˻縦 ���� �ʴ� ������
		//����� ���ȭ�� ���� ��.
		if(count >9) {
			System.out.println("������ ������ �����մϴ�");
			return;
		}
		arr[count]= new Student();
		arr[count].setInfo(br);
		count++;
		
	}
	/**��� ���� ��� �޼ҵ�*/
	public void allPrintInfo() { 
		//������� ��ɿ��� ���ȭ�� �̷����. �Է¿� ���� �������� ������� ���� �� ������,
		//�� ����� �����Ǿ������� �����ϱ� ���� ���ȭ.						
		for(int i=0;i<count;i++) {
			arr[i].getInfo();
		}
	}
	/**������ ���� ��� �޼ҵ�*/
	public void printTeacher() {
		//������ ����Կ� �־�� �Է°��� �޾Ƽ� �ش� ���� ����
		//���ǽ����� ����� ��Ʈ�� �� �� ������, ������ ������� �����ϴ� ����
		//�ξ� ������ �ִ�.
		for(int i=0;i<count;i++) {
			if(arr[i] instanceof Teacher) {
				arr[i].getInfo();
			}
		}
	}
	
	/**�л� ���� ��� �޼ҵ�*/
	public void printStudent() {
		//�ܺ� �Է� ���� ���� ����� ����� �� �ִ� ������ �ִ��� ���̴� ���� ����.
		//�������� ���� �Է¹޴� ���� �ּ�ȭ�� ��.
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
			System.out.print("�޴� >");
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
