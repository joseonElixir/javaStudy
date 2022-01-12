package day15;

public class YongMathTest {

	public static void main(String[] args) {
		SsahwaMath test = new SsahwaMath();
		System.out.println("3과 5중에 큰 수 : "+test.getMaxNum(3, 5));
		System.out.println("6.1과 3.6중에 큰 수 : "+test.getMaxNum(6.1, 3.6));
	
		test.getInfo();
		System.out.println("끝!");
	}
	
	
	
}
