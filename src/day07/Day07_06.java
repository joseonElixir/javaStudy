package day07;

public class Day07_06 {
	public static void main(String[] args) {
		
		
//		for(int i=0;i<5;i++) {		//12345 ��� �� �ٹٲ� �� ��ü +1�� �� 5ȸ �ݺ�
//			for(int j=1;j<=5;j++) { //j=i; j<=i+5; j++�� ǥ�� �� j�� ����ϴ� ��ĵ� ����.
//				System.out.print(j+i);
//			}
//			System.out.println();
//			
//		}
		for(int i=0; i<5; i++) {	//56789 ��� �� �ٹٲ� �� ��ü -1�� �� 5ȸ �ݺ�
			for(int j=1;j<=5;j++) {
				System.out.print(j+4-i);
			}
			System.out.println();
		}
		
		
	}
}
