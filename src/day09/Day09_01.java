	package day09;

public class Day09_01 {

	public static void main(String[] args) {
		int a=10;// ����� ���ÿ� �ʱ�ȭ.
		
		
		int arr[]; //�迭�� ���� ����.	
		arr= new int[3]; //�迭�� �޸� ����(���� ����ֱ�)
		arr[0] = 10; //�迭�� �ʱ�ȭ (�迭 �ȿ� �� �Է��ϱ�)
		arr[1] = 20;
		arr[2] = 30; // int[3]�̶� arr[0]~arr[2]���� ����.
		
		System.out.println("arr[0] = "+arr[0]);
		//System.out.println("arr[3] = "+arr[3]); //���� ��ȣ��.
		System.out.println("arr[2] = "+arr[2]);
		System.out.println("arr�� ���� : "+arr.length);
		
		
		double arr2[] = new double[5];
		//�迭 ���� �� ���� �޸��Ҵ� double�� ���� 5��.
		arr2[0]= 1.1;
		arr2[1]= 1.2;
		arr2[2]= 1.3;
		//���� �ʱ�ȭ.
		System.out.println("arr2[0] = "+arr2[0]);
		System.out.println("arr2[1] = "+arr2[1]);
		System.out.println("arr2[2] = "+arr2[2]);
		System.out.println("arr2[5] = "+arr2[4]);
		//�迭�� ��ü �����̴� ���� 
		//�迭�� ������� ���� �⺻������ �ʱ�ȭ�� �̷����.
		//�ش� �ڷ����� �⺻������ �ʱ�ȭ.
		//boolean�� �⺻���� false.
		System.out.println("arr2[]�� ���� : "+arr2.length);
		
		
		// 1 + 2 + 3
		System.out.println();
		System.out.println();
		int arr3[]= {10,20,30,40,50};
		//���� ���� �ʱ�ȭ�� ���ÿ� �ϴ� ���. ��õ���� ����.
		//int arr3[0] = 1; //�̰� �ȵȴٴ� ����.
		//�� ������? �����ʹ� �������̶�� Ư¡�� ����. �ٵ� �� ����� �����Ͱ� ������. 
		//�ٸ� "����" �ȹٲ� ���� �ھƳְų� test���� ��쿡 ��.
		// �迭�� �����ϱ� ��ƴٸ� �׳� arr��� ������ ���ڸ� �پ
		//arr1 , arr2 arr3 ��� ������ ������ ����ȴٰ� ��������.
		
		
		
		for(int i =0; i<arr3.length;i++) { 
			System.out.println("arr3["+i+"] = "+arr3[i]);
		}//arrayIndexOutOfBoundException�� �߻��� ���� ���ؼ� arr3.length�� ������ �Ѵ�.
		 //length�� 5�̱� ������ 0~4�� ������ ������� �̸�( < )���� ������.
		
		
		
	}

}
