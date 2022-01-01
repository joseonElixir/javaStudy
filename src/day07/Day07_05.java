package day07;

public class Day07_05 {
	public static void main(String[] args) {
		
		for(int i =1; i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.print(j+"*"+i+"="+(j*i)+"  ");//괄호 안에 탭(\t)을 넣어도 된다.
			if((j*i)<10)
				System.out.print(" ");
			//위의 출력값 끝 괄호안에 탭을 넣는 대신 10보다 작은 수에 스페이스를 넣는 문장을 넣어도 된다.
			}
			System.out.println();
		}
	}
}
