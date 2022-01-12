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
		System.out.println(name+"는 "+cry+"하고 울어요");
	}
	@Override //골뱅이 : 어노테이션 명령어. 해당 메소드가 어떤 메소드인지 가르쳐주기 위함.
	public void getBaby(int i) {
		System.out.println(name+"가 " +i+"마리 태어났어요");
	}
}
class Dog extends AniInfo{
	public Dog(){
		name = "강아지";
		cry = "멍멍";
	}
}
class Cat extends AniInfo{
	public Cat(){
		name = "고양이";
		cry = "야옹";
	}
}
class Duck extends AniInfo{
	public Duck(){
		name = "오리";
		cry = "꽥꽥";
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
		
		
		//멤버변수는 생성자에서 초기화
		//지역변수는 선언하자마자 의무적으로 초기화.
		
		Animal an [] = new Animal[3];
		an[0] = new Cat();
		an [1] = new Dog();
		an [2] = new Duck();
		
		System.out.print("어떤 동물이 태어났나요? : ");
		anName = br.readLine();
		System.out.println("몇마리 태어났어요? : ");
		anNum = Integer.parseInt(br.readLine());
		
		if("cat".equals(anName)) { 
			//이미 존재하는 값에다가 존재하지 않을 수도 있는 값을 비교.
			//NullPointEXception 방지용
			anName2 = 0;
		}else if("dog".equals(anName)) {
			anName2 = 1;
		}else if(anName.equals("duck")) { // 기존 방식. 
			//nullpointEXception이 발생할 수 있다.
			anName2 = 2;
		}
		an[anName2].getBaby(anNum);
		an[anName2].crySound();
		
		
		
		
		
	}
}
