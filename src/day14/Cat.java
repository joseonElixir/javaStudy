package day14;

public class Cat {
	
	String name;
	int age;
	String value;
	
	public Cat() { // �Ϲ� ������( ��Ģ �޼ҵ�)
		name="�׷�";
		value = "�ڼ�";
	}
	public Cat(String name) { //���� ������ (������ �����ε�)
		this.name=name;
		age = 1;
		value = "�ڼ�";
	}
	public Cat(String name, int age) { 
		this.name=name;
		this.age=age;
		value = "�ڼ�";
	}
	public Cat(String name, int age, String value) {
		this.name=name;
		this.age=age;
		this.value=value;
	}
	
	public void getInfo() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+ age);
		System.out.println("ǰ�� : "+value);
	
	
	}
	
	
}
