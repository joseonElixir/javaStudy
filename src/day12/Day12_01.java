package day12;

public class Day12_01 {

	public static void xLine() {
		System.out.println("---------------");
	}
	//반복되는 밑줄을 쓰기 위한 메서드.
	
	
	public static void main(String[] args) {
		//shift+enter 개행
		xLine(); //Call By Name 형식. java에서만 있는 형식.
		//c언어에서는 call by value와 call by reference만 있다.
		System.out.println("이름 : 홍길동");
		xLine();
		System.out.println("나이 : 20살");
		xLine();
		System.out.println("주소 : 서울");
		xLine();
		
		
		
	}

}
