package day21;

class User<T>{ //꺽쇄 안에 T를 넣음으로써 변수에 대한 타입을 사용자 설정(object)으로 만들 수 있음.
				//메인에서 클래스를 호출할 때 제네릭으로 변수타입을 지정할 수 있다.
	T tmp; 
	
	
	
}

public class UserTest {

	public static void main(String[] args) {
	
		User u1 = new User();
		//u1.tmp; // 변수가 오브젝트 타입
		User<String> u2 = new User<String>();
		//u2.tmp; // 변수가 스트링 타입
		
	}
	
}
