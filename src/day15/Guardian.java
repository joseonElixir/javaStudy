package day15;

public class Guardian extends BaseCar { // 상속(명시적 상속)
		
	String item;
	
	//인자 생성자
	public Guardian(String carName, int speed, String item) {
		//super(); //상속받는 자식의 생성자에는 무조건 (자동으로 안보이게) 이 super가 입력되어있다.
		
		this.carName = carName;
		this.maxSpeed = speed;
		this.item = item;
	}
	
	public void getInfo() { //오버라이딩. 이미 상속받은 getInfo라는 메소드가 있지만,
		
						//같은 이름으로 그 기능을 새롭게 재정의해서 쓸 수 있다.
		super.getInfo();//상속받은 메소드의 값을 불러온다.
		System.out.println("아이템 : "+item);
	}
	
	public void getInfo(String title) { //오버로딩
		System.out.println(title);
		this.getInfo();
	}
	
	
	
	
}
