package day08;

public class Day08_10 {

	public static void main(String[] args) {
		//
		//������ ����� ����� for������ �ۼ��� �� �ִٴ� ����.
		
		int sum=0;
		
		for(int i =1; i<=20;i++) {
			
			if(i%2==1) // i�� 2�� ���� �� �������� 1�϶�.
				continue; //continue�� ����.(continue�� �� ������ �����ϰ� ���� ��)
			
			sum+=i;		//sum�� ����. continue�� �ߵ��Ǹ� ������ �̷������ �ʴ´�.
			System.out.print(i); //��� 
			
			if(i==20)		// i�� 20�� �Ǹ� for���� ��������.
				break;
			System.out.print("+"); // i�� 20�� �Ǹ� ���� break�� ���� ������ �ʴ´�.
		}
		System.out.println("="+sum); // �������ڿ� ������ sum ���.
	}

}
