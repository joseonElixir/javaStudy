package day09;

public class Day09_04 {

	public static void main(String[] args) {
		
		//����(��ġ ���۸�����.)
		//�ݶ�� ���̴ٸ� ���� ����� ���� ��������
		//�ϳ��� ���� �غ��ؼ� �ݶ� �ſ� �������,
		//�� �ݶ󺴿� ���̴ٸ� �ְ�, �� ���̴ٺ��� �ſ� ���� �ݶ� �ִ´�.
		
		int arr1[]= {10,20,30,40,50};
		int arr2[]= {100,200,300};
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.println("---------------------");
		
		
		//arr1, arr2�� ���� �����ϰ� �ʹ�.
		
		int temp[]=arr1;
		arr1=arr2;
		arr2=temp;
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		
		
		
		
	}
	
	
}
