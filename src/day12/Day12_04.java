package day12;

public class Day12_04 {
	
	public static int getMaxNum(int num1 , int num2) {
		int max= num1>num2?num1:num2;
		return max; // 메소드를 종료하는 역할.
		//main도 메소드이기 때문에 return으로 종료할 수 있긴 함. 권장하지는 않음.
		//종료할 때 반환할 값을 서술할 수 있음.
		
		
	}
	
	public static void main(String[] args) {
		
		int num1 =10;
		int num2 = 20;
		//int max = num1>num2? num1:num2;
		
		int max = getMaxNum(num1,num2);
		//리턴값을 변수에 담는다.
		System.out.println("큰 수 : "+max);
		
		
		
		

	}

}
