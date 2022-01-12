package day16;
import java.io.*;

abstract class Animal_T{ // ���� ��Ű�� �ȿ� ���� �̸��� Ŭ������ �����ϸ� �浹�� ����.
	abstract public void crySound();
	abstract public void getBaby(int i);
}

class Dog1 extends Animal_T{

	@Override
	public void crySound() {
		System.out.println("�������� �۸��ϰ� ����");
	}
	@Override //����� : ������̼� ��ɾ�. �ش� �޼ҵ尡 � �޼ҵ����� �������ֱ� ����.
	public void getBaby(int i) {
		System.out.println("�������� " +i+"���� �¾���");
	}
}
class Cat1 extends Animal_T{
	@Override
	public void crySound() {
		System.out.println("����̴� �߿��ϰ� ����");
	}
	@Override //����� : ������̼� ��ɾ�. �ش� �޼ҵ尡 � �޼ҵ����� �������ֱ� ����.
	public void getBaby(int i) {
		System.out.println("����̰� " +i+"���� �¾���");
	}
}
class Duck1 extends Animal_T{
	@Override
	public void crySound() {
		System.out.println("������ �в��ϰ� ����");
	}
	@Override //����� : ������̼� ��ɾ�. �ش� �޼ҵ尡 � �޼ҵ����� �������ֱ� ����.
	public void getBaby(int i) {
		System.out.println("������ " +i+"���� �¾���");
	}
}

public class AnimalTest_T {

	public static void main(String[] args) 
	throws IOException{
		
		System.out.println("1.������ 2. ����� 3.����");
		System.out.println("� ������ �¾����?");
		int user = System.in.read() -'0';
		System.in.skip(2);
		System.out.println("��� �¾���? : ");
		int baby = System.in.read() -'0';
		System.in.skip(2);		
		
		//��������� �����ڿ��� �ʱ�ȭ
		//���������� �������ڸ��� �ǹ������� �ʱ�ȭ.
		Animal_T an = null;
		switch(user) {
		case 1 : an = new Dog1(); break;
		case 2 : an = new Cat1(); break;
		case 3 : an = new Duck1();
		}
		
		an.getBaby(baby);
		an.crySound();
	
		
	}
}
