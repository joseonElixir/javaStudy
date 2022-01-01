package day10;

public class Day10_02 {
	
	public static void main(String[] args) {
			
		//선언.
		int arrr[][];
		
		//생성.
		arrr= new int[3][2];
		
		//초기화.
		arrr[0][0] = 12;
		arrr[0][1] = 20;
		//arrr[0][2] = 30; //ArrayIndexOutOfBoundException 발생한다.
		arrr[1][0] = 40;
		
		System.out.println(arrr[0][0]);
		System.out.println(arrr[1][0]);
		//배열은 객체를 생성할때 해당타입의 기본값으로 초기화가 되어있다.
		System.out.println(arrr[2][1]); //=0
		
		for(int i=0;i<arrr.length;i++) {// 이차원배열의 y축을 담당할 for문
			//배열의 크기를 물어보면 배열의 크기.
			for(int j=0;j<arrr[i].length;j++) {
				//[i]배열의 크기를 물어보면 [i]배열의 크기.
				//그렇기 때문에 2차원배열도 결국 1차원 배열이다.
				//배열의 번호를 하나의 변수로 보았을 때.
				System.out.print(arrr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
	
}
