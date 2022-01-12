package day18;

class Test{
	int a;
	public void test() {
		System.out.println("이것은 테스트 메소드입니다.");
	}
	
}


public class ExceptTest {

	public static void main(String[] args) {
		try {
			System.out.println("======시작=======");
		Test test= null;//지역변수는 선언과 동시 초기화
		test.test();
		} catch (NullPointerException e) { //NullPointerException : 에러의 정보가 담겨있는 정보 클래스.
			//널포인터익셉션 클래스 변수를 선언한거임.
			System.out.println("비어있는 객채를 사용하려 하였음");
			//System.out.println(e);
			e.printStackTrace(); //에러정보를 출력할 수 있음.
			
		}
		System.out.println("=======끝======");
	}
	
}


