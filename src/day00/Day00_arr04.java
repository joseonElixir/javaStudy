package day00;

public class Day00_arr04 {
	public static void main(String[] args) {
		//배열의 주소값 보기.
		//num1(스택)에 저장된 num1[]의 주소값,
		//num2[]에 저장된 num2[][]의 주소값.
		int num1[] =new int[25];
		int num2[][]=new int [5][5];
		System.out.println(num1);
		System.out.println(num2[0]);
		//1~45중 5개 num1에 저장 및 중복검사 후 오름차순.
		for(int i=0;i<num1.length;i++) {
			num1[i]=(int)(Math.random()*45+1);
			//0번부터 순차적으로 랜덤값 부여.
			for(int j=0;j<i;j++) {
			//j= 0부터 i 직전까지 순차적으로 비교.
			//이렇게 하면 부여된 값이 아직 없는 상태에서는 비교가 일어나지 않음.
			//i=0일때 j<i는 false이기 때문에 배열의 첫번째 값을 부여할 때에는 돌아가지 않음.
			
				if(num1[i]==num1[j]) {
				//배열의 값이 중복이면 값을 i번째 값을 다시 준다.
				//이유 + j는 이미 i로 인해 값이 들어간 것들만을 i직전까지만
				//순차비교하기 때문.
					i--;
					break;
					
				}else if(num1[i]<num1[j]) {
				//i번째가 뒤의 번호고, j번째가 앞의 번호인 것을 인식할 것.
				//즉 j가 작아야함. (올림차순)
				//여기서 else는 써도 안써도 그만이긴 함.
				//어차피 앞에서 중복이 걸리면 break로 빠져나가기 때문.
				//이미 중복검사가 끝난 이후에 크기를 비교해서 정렬을 하는 것이기 때문에
				//돌아가는 데에 문제가 없다.
					int temp=num1[i];
					num1[i]=num1[j];
					num1[j]=temp;
				}
				
			}//중복 비교 및 순차정렬 for문 끝.
			
		}//num1에 저장 끝.
		
		for(int i =0; i<num1.length;i++) {
			System.out.println(num1[i]);
		}
		
		
	}

}
