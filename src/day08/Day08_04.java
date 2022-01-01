package day08;

public class Day08_04 {

	public static void main(String[] args) {

//		for(int j =1; j<=10;j++) {
//		
//			int sum=0;
//			for(int i = 1+(j*10)-10; i <= j*10; i++) {
//				if(sum==0){
//					System.out.print(i);
//				}
//				sum+=i;
//			}
//		System.out.println("~"+(j*10)+" :"+sum);
//		}
		for(int j=1; j<=100;j+=10) { 
			//그룹의 규칙은 1~10, 11~20  각 그룹당 10씩 커진다.
			//고로 시작 값을 1로 지정하고, +값을 10으로 한다.
			//그룹의 간격이 10이라 부모 for문의 지역변수 j의 증감값이 10
			
			int sum=0;
			for(int i=j; i<=j+9 ; i++) { 
			//데이터의 규칙은 1~10, 11~20  즉 1씩 증가. 
			//즉 초기값이 주어지고 1씩 증가. 초기값과 조건값의 차이가 9.
			//고로 시작 값은 j, 조건값이 j+9.
				sum+=i;
				//for문에서 나오는 i 값의 누적.
			}
			System.out.println(j+"~"+(j+9)+":"+sum); 
			//자식 for문이 다 돌면 sum값을 출력. 
			
		}
		
	}

}
