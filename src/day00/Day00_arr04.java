package day00;

public class Day00_arr04 {
	public static void main(String[] args) {
		//�迭�� �ּҰ� ����.
		//num1(����)�� ����� num1[]�� �ּҰ�,
		//num2[]�� ����� num2[][]�� �ּҰ�.
		int num1[] =new int[25];
		int num2[][]=new int [5][5];
		System.out.println(num1);
		System.out.println(num2[0]);
		//1~45�� 5�� num1�� ���� �� �ߺ��˻� �� ��������.
		for(int i=0;i<num1.length;i++) {
			num1[i]=(int)(Math.random()*45+1);
			//0������ ���������� ������ �ο�.
			for(int j=0;j<i;j++) {
			//j= 0���� i �������� ���������� ��.
			//�̷��� �ϸ� �ο��� ���� ���� ���� ���¿����� �񱳰� �Ͼ�� ����.
			//i=0�϶� j<i�� false�̱� ������ �迭�� ù��° ���� �ο��� ������ ���ư��� ����.
			
				if(num1[i]==num1[j]) {
				//�迭�� ���� �ߺ��̸� ���� i��° ���� �ٽ� �ش�.
				//���� + j�� �̹� i�� ���� ���� �� �͵鸸�� i����������
				//�������ϱ� ����.
					i--;
					break;
					
				}else if(num1[i]<num1[j]) {
				//i��°�� ���� ��ȣ��, j��°�� ���� ��ȣ�� ���� �ν��� ��.
				//�� j�� �۾ƾ���.
				//���⼭ else�� �ᵵ �Ƚᵵ �׸��̱� ��.
				//������ �տ��� �ߺ��� �ɸ��� break�� ���������� ����.
				//�̹� �ߺ��˻簡 ���� ���Ŀ� ũ�⸦ ���ؼ� ������ �ϴ� ���̱� ������
				//���ư��� ���� ������ ����.
					int temp=num1[i];
					num1[i]=num1[j];
					num1[j]=temp;
				}
				
			}//�ߺ� �� �� �������� for�� ��.
			
		}//num1�� ���� ��.
		
		for(int i =0; i<num1.length;i++) {
			System.out.println(num1[i]);
		}
		
		
	}

}