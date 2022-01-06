package day14;

public class Cat {
	
	String name;
	int age;
	String value;
	
	public Cat() {
		name="네로";
		value = "코숏";
	}
	public Cat(String name) {
		this.name=name;
		age = 1;
		value = "코숏";
	}
	public Cat(String name, int age) {
		this.name=name;
		this.age=age;
		value = "코숏";
	}
	public Cat(String name, int age, String value) {
		this.name=name;
		this.age=age;
		this.value=value;
	}
	
	public void getInfo() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+ age);
		System.out.println("품종 : "+value);
	
	
	}
	
	
}
