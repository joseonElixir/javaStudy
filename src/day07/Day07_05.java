package day07;

public class Day07_05 {
	public static void main(String[] args) {
		
		for(int i =1; i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.print(j+"*"+i+"="+(j*i)+"  ");//��ȣ �ȿ� ��(\t)�� �־ �ȴ�.
			if((j*i)<10)
				System.out.print(" ");
			//���� ��°� �� ��ȣ�ȿ� ���� �ִ� ��� 10���� ���� ���� �����̽��� �ִ� ������ �־ �ȴ�.
			}
			System.out.println();
		}
	}
}
