package day12;

public class Day12_02 {
//CallByValue 형식
	public static void valueTest(int a, int b) { 
		int temp=a;
		a=b;
		b=temp;
		//stack에 할당된 valueTest 영역에서의 a,b
		System.out.println("a="+a+", b="+b);
	}
	
	
	public static void main(String[] args) {

		int a=10;
		int b=20;
		//stack에 할당된 main 영역에서의 a,b 
		//(valueTest의 a,b와는 무관.)
		System.out.println("a:"+a+", b:"+b);
		valueTest(a,b);
		System.out.println("a:"+a+", b:"+b);
		
	}

}
