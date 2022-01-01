package day00;

public class Day00_arr02 {

	public static void main(String[] args) {

		
	int num[]= new int[20];
	int temp=0;
	
	for(int i=0;i<num.length;i++) {
		num[i]=(int)(Math.random()*100);
	}
	
	for(int i=0; i<num.length-1;i++) {
		
		for(int j=1;j<num.length;j++) {
			if(i<j&& num[j]%2==0 &&num[j]!=0) { 
				//짝수 구하는 알고리즘.
				//0은 예외처리로. 이렇게 되면 0이 홀수로 감.
				temp=num[i];
				num[i]=num[j];
				num[j]=temp; //스왑(저글링)
			}
		}
		
	}
	System.out.println();
	System.out.println();
	
	temp=0;
	for(int i =0; i<num.length;i++) {
		if(num[i]%2==0 ) {
			System.out.print("짝수 ");
		} else { 
			System.out.print("홀수 "); 
			temp++;
			}
		
		System.out.println(num[i]);
		
		if(temp==1) {
			System.out.println();
			
		}
		
	}
		
		
		
	}

}
