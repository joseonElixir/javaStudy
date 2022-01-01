package day09;

public class Day09_lotto02 {

	public static void main(String[] args) {
		int arr[]=new int[30];
		int i=0;
		//값을 6개 중복없이 입력받기
		// 생각해볼 수 있는 경우의 수
		//랜덤한 값을 전부 받은 뒤에 1개씩 중복검사하는 방법.: 비효율적임
		//값을 1개씩 받을때마다 중복검사하는 방법. 
		while(i<arr.length) {
			int j=0;
			System.out.println("while 1 : "+(i+1));
			arr[i]= (int)(Math.random()*45+1);
			//i번째에 랜덤 값 부여.
			System.out.println("arr["+i+"] = "+arr[i]);
			while(j<i) {
				//j가 i보다 작을때 실행.
				//즉, i=0일때 실행되지 않고, i=1일때 j=1 직전까지 실행됨.
				System.out.println("while2 : "+(j+1));
				if(arr[i]==arr[j]) {
					// 앞서 while에서 j<i라는 조건을 줬기 때문에 두개의 데이터가
					//중복되면 i와j의 데이터가 중복되는지 검사.
					System.out.println("arr["+i+"]="+arr[i]+", arr["+j+"]="+arr[j]);
					System.out.println("arr["+i+"]==arr["+j+"]");
					i--;//중복이면 i값을 뺀다.
					break;
					//중복은 최대 1회 발생하므로, 중복이 발생하면 while문을 나온다.
				}
				j++;
				
			}// while2 end.
			i++;
			
			
		}// while1 end.
		for(int k=0; k<arr.length;k++) {
			System.out.println(arr[k]);
		}

		for(int k=0; k<arr.length-1;k++) {
			
			for(int z=k+1;z<arr.length;z++) {
				
				if(arr[k]>arr[z]) {
					int tmp=arr[k];
					arr[k]=arr[z];
					arr[z]=tmp;
				}
				
			}
			
		}
		System.out.println();
		for(int k=0; k<arr.length;k++) {
			System.out.println(arr[k]);
		}
			
		
		

	}

}
