package day08;

public class Day08_09 {

	public static void main(String[] args) {
		//break 보조 제어문의 활용.
		//1~1천까지 더하는 식을 출력.
		//식의 값이 1000을 넘어가면 누적 반복문을 중지하고 값을 출력.
		int sum=0;
		
		for(int i = 1; i<=100;i++) {
			sum+=i; //1. sum에 i값을 누적.
			System.out.print(i); //2. System.out.print로 i값을 출력.
			if(sum>=1000) 
				break;		//4.break 가 출력되는 시점에 +부호가 생략되게 하기 위한 배치.
			System.out.print("+"); //3. System.out.print로 + 문자를 출력.
		}
		System.out.println("="+sum); //5. = 문자와 sum값(i의 누적치)을 출력.
		

	}

}
