package day08;

public class Day08_09 {

	public static void main(String[] args) {
		//break ���� ����� Ȱ��.
		//1~1õ���� ���ϴ� ���� ���.
		//���� ���� 1000�� �Ѿ�� ���� �ݺ����� �����ϰ� ���� ���.
		int sum=0;
		
		for(int i = 1; i<=100;i++) {
			sum+=i; //1. sum�� i���� ����.
			System.out.print(i); //2. System.out.print�� i���� ���.
			if(sum>=1000) 
				break;		//4.break �� ��µǴ� ������ +��ȣ�� �����ǰ� �ϱ� ���� ��ġ.
			System.out.print("+"); //3. System.out.print�� + ���ڸ� ���.
		}
		System.out.println("="+sum); //5. = ���ڿ� sum��(i�� ����ġ)�� ���.
		

	}

}
