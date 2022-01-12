package day16;
import java.io.*;

abstract class Animal{
	abstract public void crySound();
	abstract public void getBaby(int i);
}
class AniInfo extends Animal{
	
	String name;
	String cry;
	@Override
	public void crySound() {
		System.out.println(name+"�� "+cry+"�ϰ� ����");
	}
	@Override //����� : ������̼� ��ɾ�. �ش� �޼ҵ尡 � �޼ҵ����� �������ֱ� ����.
	public void getBaby(int i) {
		System.out.println(name+"�� " +i+"���� �¾���");
	}
}
class Dog extends AniInfo{
	public Dog(){
		name = "������";
		cry = "�۸�";
	}
}
class Cat extends AniInfo{
	public Cat(){
		name = "�����";
		cry = "�߿�";
	}
}
class Duck extends AniInfo{
	public Duck(){
		name = "����";
		cry = "�в�";
	}
}

public class AnimalTest {

	public static void main(String[] args) 
	throws IOException{
		
		BufferedReader br = 
		new BufferedReader(new InputStreamReader(System.in));
		int anNum =0;
		String anName ="";
		int anName2=0;
		
		
		//��������� �����ڿ��� �ʱ�ȭ
		//���������� �������ڸ��� �ǹ������� �ʱ�ȭ.
		
		Animal an [] = new Animal[3];
		an[0] = new Cat();
		an [1] = new Dog();
		an [2] = new Duck();
		
		System.out.print("� ������ �¾����? : ");
		anName = br.readLine();
		System.out.println("��� �¾���? : ");
		anNum = Integer.parseInt(br.readLine());
		
		if("cat".equals(anName)) { 
			//�̹� �����ϴ� �����ٰ� �������� ���� ���� �ִ� ���� ��.
			//NullPointEXception ������
			anName2 = 0;
		}else if("dog".equals(anName)) {
			anName2 = 1;
		}else if(anName.equals("duck")) { // ���� ���. 
			//nullpointEXception�� �߻��� �� �ִ�.
			anName2 = 2;
		}
		an[anName2].getBaby(anNum);
		an[anName2].crySound();
		
		
		
		
		
	}
}
