package day21;

public class TestJisung {

	public static void main(String[] args) {
		
		Integer a = new Integer(10);
		
		Integer b = new Integer(20);
		System.out.println(a);
		System.out.println(b);
		Integer c = a+b;
		System.out.println(c);
		if(a==b) { // 둘다 Integer a = 10; 으로 입력하면 트루가, 둘다 new Integer(10);으로 입력하면 팔스가 뜸.
			//이 경우 heap에 중복되는 데이터가 쌓이는 것을 방지하기 위해서 힙영역을 스캔해서 같은 값이면 같은 위치를 공유한다.
			System.out.println("트루");
		}else {
			System.out.println("팔스");
		}
		
	}
}
