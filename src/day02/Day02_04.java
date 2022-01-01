package day02;

public class Day02_04 {
	public static void main(String[] args) {

		int kor = 81;
		int eng = 79;
		int math = 80;

		int sum = kor + eng + math;

		System.out.println("출력결과");
		System.out.println("총점 : " + sum + "점");
		System.out.println("총점 : " + kor + eng + math + "점");
		// + 연산자는 기본적으로는 산술연산자이나, 연결연산자의 기능도 한다.
		// 괄호 안에서 선행된 방식을 따른다.
		// 위의 경우 문자열 뒤에 +가 붙어서 연결 연산자로 사용됐기 때문에
		// 이어진 + 또한 연결 연산자로 사용됐다.
		System.out.println("총점 : " + (kor + eng + math) + "점");
		//()는 우선연산자이기 때문에 () 먼저 연산된다.
		
		
	}
}
