package day12;

public class Day12_04 {
	
	public static int getMaxNum(int num1 , int num2) {
		int max= num1>num2?num1:num2;
		return max; // �޼ҵ带 �����ϴ� ����.
		//main�� �޼ҵ��̱� ������ return���� ������ �� �ֱ� ��. ���������� ����.
		//������ �� ��ȯ�� ���� ������ �� ����.
		
		
	}
	
	public static void main(String[] args) {
		
		int num1 =10;
		int num2 = 20;
		//int max = num1>num2? num1:num2;
		
		int max = getMaxNum(num1,num2);
		//���ϰ��� ������ ��´�.
		System.out.println("ū �� : "+max);
		
		
		
		

	}

}
