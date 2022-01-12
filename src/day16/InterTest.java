package day16;

class Humman{
	String name;
	int age;
	public void getInfo() {
		System.out.println("�̸� ="+name);
		System.out.println("���� ="+age);
	}
}

class Bug{
	String value;
	
	public void getInfo() {
		System.out.println("�����Դϴ�.");
	}
}

class Butterfly extends Bug implements InterFly{
	
	public Butterfly() {
	}
	public void getInfo() {
		super.getInfo();
		System.out.println(value+"�Դϴ�.");
	}
	@Override
	public void flying() {
		System.out.println("InterFly�� �������̽� ��ӹ޾� �ۼ��� Butterfly");
		System.out.println(SPEED+"�� �ӵ��� ������.");
	}
}

interface InterFly{//�������̽��� ������ �߻�޼ҵ��� �����̶�.
	//���� �޼ҵ帶�� abstract�� �Ƚ��൵ �ȴ�.
	//�������̽����� ����Ǵ� ������ ��� ����� �ȴ�.
	int SPEED = 100; // ��� ����� �Ǿ������.
	public void flying();
	
}

class Fly{
	int speed;
	public void flying() {
		System.out.println(speed+"�ӵ��� ���� �ֽ��ϴ�.");
	}
}

class SuperMan extends Humman implements InterFly{ //�������̽� ����� ���߻���� �����ϴ�.
	int power;
	
	public void getInfo() {
		super.getInfo();
		System.out.println("�Ŀ� :" +power);
		flying();
	}

	@Override
	public void flying() {
		System.out.println("���۸��� ����");	
	}
}


public class InterTest {

	public static void main(String[] args) {
		
		SuperMan sm = new SuperMan();
		Butterfly bf = new Butterfly();
		sm.name ="Ŭ����Ʈ";
		sm.power = 90;
		sm.age = 30;
		sm.getInfo();
		
		System.out.println("==========================");
		bf.value = "����";
		bf.getInfo();
		bf.flying();
		
		Humman h = sm; //ĳ����
		InterFly i = sm; //ĳ����
		
		Bug b = bf;			//ĳ����
		InterFly i1 = bf; 	//ĳ����
		
		
		
	}
	
}
