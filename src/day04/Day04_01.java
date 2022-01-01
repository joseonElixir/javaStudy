package day04;

public class Day04_01 {

	public static void main(String[] args) {

		
		int num1 = 30; 
		int num2 = 20;
		
		int max = num1 > num2 ? num1 : num2 ;
		//삼항연산자는 리턴값을 가지기 때문에 돌려받을 변수를 정해줘야한다.
		
		System.out.println("큰 수 : " + max);
	}	
	
}
