package day08;

public class Day08_07 {

	public static void main(String[] args) {

		for(int j=0; j<=5;j++) {
			
			if(j==3)
				break;
			
			for(int i = 1; i <=10; i++) {
				
				if(i==5) {
					break; //if�� ������ ���� ���� ����� ����� �����Ѵ�.
				}
				System.out.println(i);
			}
		}

	}

}
