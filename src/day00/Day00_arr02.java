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
				//¦�� ���ϴ� �˰���.
				//0�� ����ó����. �̷��� �Ǹ� 0�� Ȧ���� ��.
				temp=num[i];
				num[i]=num[j];
				num[j]=temp; //����(���۸�)
			}
		}
		
	}
	System.out.println();
	System.out.println();
	
	temp=0;
	for(int i =0; i<num.length;i++) {
		if(num[i]%2==0 ) {
			System.out.print("¦�� ");
		} else { 
			System.out.print("Ȧ�� "); 
			temp++;
			}
		
		System.out.println(num[i]);
		
		if(temp==1) {
			System.out.println();
			
		}
		
	}
		
		
		
	}

}
