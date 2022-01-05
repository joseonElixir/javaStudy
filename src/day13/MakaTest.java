package day13;

public class MakaTest {

	public static void main(String[] args) {
		System.out.println("프로그램의 시작.");
		
		Maka m1 = new Maka(); // Maka = m1을 만들기 위한 설계도.
		
		m1.color = "blue"; // 멤버변수 호출 및 선언. 접근연산자인 dot(.)을 사용.
		
		m1.makaWrite(); // 멤버 메소드 호출.
		
		Maka m2 = new Maka();//	
		m2.color = "red";
		m2.makaWrite(); 
		m1.makaWrite();  //m1과 m2는 다른것이다.
		//이것이 객체 지향.
		
		Maka m3 = new Maka();
		m3.color = "yellow";
		m3.makaWrite();
		
		Maka m4 = new Maka(); //new 뒤에 있는 Maka()는 생성자다. 
		//만약에 생성자를 만들지 않으면 JVM이 텅빈 생성자를 자동으로 만들어줌.
		//"new 뒤에 나오는 놈은 생성자다." 
		m4.makaWrite();
		
		
		System.out.println("프로그램의 끝.");
	}

}
