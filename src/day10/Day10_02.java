package day10;

public class Day10_02 {
	
	public static void main(String[] args) {
			
		//����.
		int arrr[][];
		
		//����.
		arrr= new int[3][2];
		
		//�ʱ�ȭ.
		arrr[0][0] = 12;
		arrr[0][1] = 20;
		//arrr[0][2] = 30; //ArrayIndexOutOfBoundException �߻��Ѵ�.
		arrr[1][0] = 40;
		
		System.out.println(arrr[0][0]);
		System.out.println(arrr[1][0]);
		//�迭�� ��ü�� �����Ҷ� �ش�Ÿ���� �⺻������ �ʱ�ȭ�� �Ǿ��ִ�.
		System.out.println(arrr[2][1]); //=0
		
		for(int i=0;i<arrr.length;i++) {// �������迭�� y���� ����� for��
			//�迭�� ũ�⸦ ����� �迭�� ũ��.
			for(int j=0;j<arrr[i].length;j++) {
				//[i]�迭�� ũ�⸦ ����� [i]�迭�� ũ��.
				//�׷��� ������ 2�����迭�� �ᱹ 1���� �迭�̴�.
				//�迭�� ��ȣ�� �ϳ��� ������ ������ ��.
				System.out.print(arrr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
	
}
