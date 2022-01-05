package day13;

public class Maka {

	// 모든 객체는 속성과 기능으로 나누어져 있다.

	// 물건이 대표하는 값 - 속성 - 멤버변수
	String color; // 메소드가 아닌 클래스에서 선언되는 변수이기 때문에 멤버변수.

	// --생성자 멤버변수의 초기화 목적(변칙메서드)
	public Maka() {
		color = "black";
	}

	// 물건이 대표하는 기능 - 행위 - 멤버메소드
	// 생성자 영역
	// 멤버 메소드의 특징 - 메모리에 바로 올라가면 안된다.

	public void makaWrite() {

		System.out.println(color + "색상의 마카로 글을 씁니다.");

	}// 여기까지가 추상화(객체모델링)이다.

}
