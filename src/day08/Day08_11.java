package day08;

public class Day08_11 {

	public static void main(String[] args) {
		//난수 취급 방법.
		// int 변수명 = (int)(Math.random()*범위 + 시작수
		// 즉 내가 3~ 6까지의 수 중에 랜덤한 수를 구하고 싶을 경우
		// 시작수를 3으로 잡고 범위의 크기 즉, 3에서 6까지의 수 즉 3을 잡는다.
		//시작수 = 3 , 범위는 3 
		for(int i = 1 ; i<=10;i++) {
			int ran = (int)(Math.random()*10);
			System.out.println(ran);
			
		}
		

	}

}
