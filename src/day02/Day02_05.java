package day02;

public class Day02_05 {

	/**이것은 테스트로 만들어본 가능*/
	public int setContent(String content) {
		return -1;
	}
	
	/**이것은 프로램의 시작점.*/
	public static void main(String[] args) {
		//file - Export - javadoc 루트를 통해 API파일을 만들 수 있다.
		String name; 
		// 주석을 한글로 달면 낮은 확률로 뻑나는 경우가 있다.
		//이유는 가끔씩 주석을 인식하지 못하기 때문.

		name = "홍길동";
		System.out.println("당신의 이름은 "+name+"입니다.");
		/*주석 영역
		 * int x = 1; 
		 * System.out.println("주석자리");
		 */System.out.println("주석이 끝난다.");
		//System.out.println("주석처리");
		
	}
}
