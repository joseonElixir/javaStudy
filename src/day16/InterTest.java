package day16;

class Humman{
	String name;
	int age;
	public void getInfo() {
		System.out.println("이름 ="+name);
		System.out.println("나이 ="+age);
	}
}

class Bug{
	String value;
	
	public void getInfo() {
		System.out.println("벌레입니다.");
	}
}

class Butterfly extends Bug implements InterFly{
	
	public Butterfly() {
	}
	public void getInfo() {
		super.getInfo();
		System.out.println(value+"입니다.");
	}
	@Override
	public void flying() {
		System.out.println("InterFly를 인터페이스 상속받아 작성된 Butterfly");
		System.out.println(SPEED+"의 속도를 가졌다.");
	}
}

interface InterFly{//인터페이스는 어차피 추상메소드의 집합이라.
	//굳이 메소드마다 abstract를 안써줘도 된다.
	//인터페이스에서 선언되는 변수는 모두 상수가 된다.
	int SPEED = 100; // 얘는 상수가 되어버린다.
	public void flying();
	
}

class Fly{
	int speed;
	public void flying() {
		System.out.println(speed+"속도로 날고 있습니다.");
	}
}

class SuperMan extends Humman implements InterFly{ //인터페이스 상속은 다중상속이 가능하다.
	int power;
	
	public void getInfo() {
		super.getInfo();
		System.out.println("파워 :" +power);
		flying();
	}

	@Override
	public void flying() {
		System.out.println("슈퍼맨이 난다");	
	}
}


public class InterTest {

	public static void main(String[] args) {
		
		SuperMan sm = new SuperMan();
		Butterfly bf = new Butterfly();
		sm.name ="클락켄트";
		sm.power = 90;
		sm.age = 30;
		sm.getInfo();
		
		System.out.println("==========================");
		bf.value = "나비";
		bf.getInfo();
		bf.flying();
		
		Humman h = sm; //캐스팅
		InterFly i = sm; //캐스팅
		
		Bug b = bf;			//캐스팅
		InterFly i1 = bf; 	//캐스팅
		
		
		
	}
	
}
