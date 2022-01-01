package day08;

public class Day08_07 {

	public static void main(String[] args) {

		for(int j=0; j<=5;j++) {
			
			if(j==3)
				break;
			
			for(int i = 1; i <=10; i++) {
				
				if(i==5) {
					break; //if를 제외한 나와 가장 가까운 제어문을 중지한다.
				}
				System.out.println(i);
			}
		}

	}

}
