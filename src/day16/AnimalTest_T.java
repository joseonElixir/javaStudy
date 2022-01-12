package day16;
import java.io.*;

abstract class Animal_T{ // 같은 패키지 안에 같은 이름의 클래스가 존재하면 충돌이 난다.
	abstract public void crySound();
	abstract public void getBaby(int i);
}

class Dog1 extends Animal_T{

	@Override
	public void crySound() {
		System.out.println("강아지는 멍멍하고 울어요");
	}
	@Override //골뱅이 : 어노테이션 명령어. 해당 메소드가 어떤 메소드인지 가르쳐주기 위함.
	public void getBaby(int i) {
		System.out.println("강아지가 " +i+"마리 태어났어요");
	}
}
class Cat1 extends Animal_T{
	@Override
	public void crySound() {
		System.out.println("고양이는 야옹하고 울어요");
	}
	@Override //골뱅이 : 어노테이션 명령어. 해당 메소드가 어떤 메소드인지 가르쳐주기 위함.
	public void getBaby(int i) {
		System.out.println("고양이가 " +i+"마리 태어났어요");
	}
}
class Duck1 extends Animal_T{
	@Override
	public void crySound() {
		System.out.println("오리는 꽥꽥하고 울어요");
	}
	@Override //골뱅이 : 어노테이션 명령어. 해당 메소드가 어떤 메소드인지 가르쳐주기 위함.
	public void getBaby(int i) {
		System.out.println("오리가 " +i+"마리 태어났어요");
	}
}

public class AnimalTest_T {

	public static void main(String[] args) 
	throws IOException{
		
		System.out.println("1.강아지 2. 고양이 3.오리");
		System.out.println("어떤 동물이 태어났나요?");
		int user = System.in.read() -'0';
		System.in.skip(2);
		System.out.println("몇마리 태어났어요? : ");
		int baby = System.in.read() -'0';
		System.in.skip(2);		
		
		//멤버변수는 생성자에서 초기화
		//지역변수는 선언하자마자 의무적으로 초기화.
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
