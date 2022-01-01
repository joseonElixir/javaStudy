package day07;

public class Day07_06 {
	public static void main(String[] args) {
		
		
//		for(int i=0;i<5;i++) {		//12345 출력 후 줄바꿈 후 전체 +1로 총 5회 반복
//			for(int j=1;j<=5;j++) { //j=i; j<=i+5; j++로 표현 후 j를 출력하는 방식도 가능.
//				System.out.print(j+i);
//			}
//			System.out.println();
//			
//		}
		for(int i=0; i<5; i++) {	//56789 출력 후 줄바꿈 후 전체 -1로 총 5회 반복
			for(int j=1;j<=5;j++) {
				System.out.print(j+4-i);
			}
			System.out.println();
		}
		
		
	}
}
