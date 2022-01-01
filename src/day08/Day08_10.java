package day08;

public class Day08_10 {

	public static void main(String[] args) {
		//
		//누적과 출력의 기능은 for문에서 작성될 수 있다는 것은.
		
		int sum=0;
		
		for(int i =1; i<=20;i++) {
			
			if(i%2==1) // i를 2로 나눈 뒤 나머지는 1일때.
				continue; //continue를 실행.(continue의 뒷 내용을 무시하고 다음 턴)
			
			sum+=i;		//sum에 누적. continue가 발동되면 누적이 이루어지지 않는다.
			System.out.print(i); //출력 
			
			if(i==20)		// i가 20이 되면 for문을 빠져나옴.
				break;
			System.out.print("+"); // i가 20이 되면 앞의 break에 의해 나오지 않는다.
		}
		System.out.println("="+sum); // 이퀄문자와 누적값 sum 출력.
	}

}
