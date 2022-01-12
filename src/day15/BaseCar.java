package day15;

public class BaseCar {
	
	String carName;
	int maxSpeed;
	
	public BaseCar() { 
		//기본생성자는 쓰지 않아도 의무적으로 만들어야함.
		//이유 : 부모클래스의 입장에서 자식클래스에게 상속하게 될 경우,
		//기본생성자가 없으면 직접 자식 생성자에 생성자의 인자를 super()의 괄호 안에
		//일일이 넣어줘야한다.
		//자식클래스는 부모 클래스의 변수를 초기화받기 위해 부모클래스를 호출한다.
		//즉 메모리에서는 부모 클래스 A , 자식 클래스 B가 존재할 떄
		//B 클래스를 부르게 되면 A클래스가 호출된 뒤에 초기화 후 B 클래스가 호출되고,
		//마지막으로 그 두개의 묶음을 B 클래스의 이름으로 관리한다.
		//
	}
	
	public BaseCar(String carName , int speed) { //인자 생성자.
		//JVM 입장에서는 인자생성자만 만들어져도 기본생성자를 따로 만들어주지 않음.
		//그렇기 때문에 인자 생성자만 만들어놓고 기본생성자를 사용하려고 메인메소드에서 선언하면
		//물먹음. 그렇기에 기본생성자는 쓰든 안쓰든 의무적으로 만들어야함.
		
		this.carName = carName;
		this.maxSpeed = speed;
		
	}
	
	public void getInfo() {
		System.out.println("카트 이름 : "+carName);
		System.out.println("최고속도 : "+maxSpeed);
	}

}
