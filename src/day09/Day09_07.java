package day09;

public class Day09_07 {
//�ߺ����� ���� �߻�.
	public static void main(String[] args) {
		int jac[]=new int[45];
		int tmp=0;
		for(int i=0;i<jac.length;i++) {
			jac[i]=(int)(Math.random()*45+1);
			for(int j=0;j<i;j++) {
				if(jac[i]==jac[j]) { 
					//i=0�� ��� ���ǽ��� false�� �ȵ��ư�.
					//i=1�ϰ�� ���ǽ��� true, ����j++�Ǹ� ���ǽ��� false�� �ȴ�.
					//i���� j���� �ߺ��� ���� ����.
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
