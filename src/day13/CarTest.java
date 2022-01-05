package day13;

public class CarTest {
	
	
	public static void main(String[] args) {
		
		//객체 생성 및 객체 활용
		Car car = new Car(); //메소드(클래스) 선언 및 변수화 
		
		car.userName = "홍길동";//멤버변수 호출 및 초기화
		car.carName = "리막";
		car.color = "red";
		car.tire = 4;
		
		car.getInfo();  //멤버메소드 호출
		car.driveCar();
		car.parkingCar();
		car.driveEnd();
		car.getInfo();
		System.out.println("---------------------------------");
		Car subC = new Car(); // 메소드 선언 및 변수화
		
		subC.userName = "홍길동"; // 멤버변수 호출 및 초기화
		subC.color = "whtie";
		subC.carName = "테슬라";
		subC.tire = 4;
		
		subC.getInfo(); // 멤버 메소드 호출
		subC.driveCar();
		subC.parkingCar();
		subC.driveEnd();
		subC.getInfo();
		
		System.out.println("=====================================");
		
		Car c3 = new Car();
		c3.getInfo();
		
		
		
		
	}
	
	
}
