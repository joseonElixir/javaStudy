package day09;

public class Day09_lotto02 {

	public static void main(String[] args) {
		int arr[]=new int[30];
		int i=0;
		//���� 6�� �ߺ����� �Է¹ޱ�
		// �����غ� �� �ִ� ����� ��
		//������ ���� ���� ���� �ڿ� 1���� �ߺ��˻��ϴ� ���.: ��ȿ������
		//���� 1���� ���������� �ߺ��˻��ϴ� ���. 
		while(i<arr.length) {
			int j=0;
			System.out.println("while 1 : "+(i+1));
			arr[i]= (int)(Math.random()*45+1);
			//i��°�� ���� �� �ο�.
			System.out.println("arr["+i+"] = "+arr[i]);
			while(j<i) {
				//j�� i���� ������ ����.
				//��, i=0�϶� ������� �ʰ�, i=1�϶� j=1 �������� �����.
				System.out.println("while2 : "+(j+1));
				if(arr[i]==arr[j]) {
					// �ռ� while���� j<i��� ������ ��� ������ �ΰ��� �����Ͱ�
					//�ߺ��Ǹ� i��j�� �����Ͱ� �ߺ��Ǵ��� �˻�.
					System.out.println("arr["+i+"]="+arr[i]+", arr["+j+"]="+arr[j]);
					System.out.println("arr["+i+"]==arr["+j+"]");
					i--;//�ߺ��̸� i���� ����.
					break;
					//�ߺ��� �ִ� 1ȸ �߻��ϹǷ�, �ߺ��� �߻��ϸ� while���� ���´�.
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
