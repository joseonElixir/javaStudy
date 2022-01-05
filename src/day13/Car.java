package day13;

public class Car {
	
	//멤버변수 영역
	String color;
	String carName;
	String userName;
	int tire;
	
	public Car() { // 생성자 생성. 초기값을 준다.
		
		carName = "아반떼";
		color ="white";
	}
	//생성자의 영역(멤버변수의 영역과 멤버메소드의 영역 바로 그 사이.
	
	
	//메소드 선언 영역
	public void driveCar() {
		//static을 안쓰는 이유 : Car 클래스에 종속되는 메소드 즉, Car 클래스가 선행되지 않는 이상
		//메모리에 올라가지 않음.
		System.out.println(userName+"의 "+carName+"(색상:"+color+")이(가) 주행을 시작합니다.");
		int exi= (int)(Math.random()*11+1);
		if(exi%2==0&&!carName.equals("테슬라")) {
			System.out.println("사고 발생. 타이어 결함.");
			tire--;
		}else {
			System.out.println("안전하게 주행을 완료했습니다.");
		}
		System.out.println();
		
	}
	
	public void parkingCar() {
		System.out.println("주차모드로 변경합니다.");
		System.out.println();
	}
	
	public void driveEnd() {
		System.out.println("주행을 종료합니다.");
		System.out.println();
	}
	//개발을 할때 편의성을 제공받고 싶을 때
	//내가 가지고 있는 값이 잘못되었을 때 
	//선언된 변수를 보기 편하게 확인하기 위해서
	//getInfo를 만드는 습관을 가지기.
	public void getInfo() {
		System.out.println("INFORMATION");
		System.out.println("모델명 : "+carName);
		System.out.println("색상 : "+color);
		System.out.println("차주명 : "+userName);
		System.out.println("타이어 갯수 : "+tire);
		System.out.println();
	}
	
	
}
