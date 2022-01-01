package day09;

public class Day09_07 {
//중복검출 랜덤 발생.
	public static void main(String[] args) {
		int jac[]=new int[45];
		int tmp=0;
		for(int i=0;i<jac.length;i++) {
			jac[i]=(int)(Math.random()*45+1);
			for(int j=0;j<i;j++) {
				if(jac[i]==jac[j]) { 
					//i=0일 경우 조건식이 false라서 안돌아감.
					//i=1일경우 조건식이 true, 이후j++되면 조건식이 false가 된다.
					//i값과 j값은 중복될 수가 없음.
					i--; 
				}
			}
		}
		
		for(int i=0;i<jac.length;i++) {
			System.out.println(jac[i]);
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<jac.length;i++) {
			for(int j=1;j<jac.length;j++) {
				
				if(i<j&&jac[i]>jac[j]) {
					tmp=jac[i];
					jac[i]=jac[j];
					jac[j]=tmp;
					
				}
			}
		}
		
		for(int i=0;i<jac.length;i++) {
			System.out.println(jac[i]);
		}
		
	}

}
