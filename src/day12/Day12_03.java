package day12;

public class Day12_03 {
	
	//call by reference
	//refTest�� ����� �����Ͱ� main�� �ּҰ��̱� ������
	//main�� refTest�� arr�� ���� �ֵ��� ������ ��.
	//�⺻�ڷ�Ÿ�� 8������ ������ ��� �͵��� ���۷���.
	//���۷���Ÿ���� �����ϸ� call by reference
	//���忡���� ȥ���� �޼ҵ带 �� ���� ��. 
	//�� ���۷��� �ڷ����� �⺻�ڷ����� ���� �䱸�ϴ� �޼ҵ�
	// exTest(int num, int arr[]) �̷� ������.
	public static void refTest(int arr[]) {
		arr[2]=1004;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

		System.out.println();
		refTest(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
