package day00;

public class Day00_for02 {

	public static void main(String[] args) {
		// �Ҽ� �Ǻ��� �����.

		for (int num = 1; num <= 10; num++) {

			int fac = 0;
			for (int i = 1; i <= num; i++) {
				if(num%i==0) //�������� ���Ҷ��� ū ������ ���� ������ ������
					//���±��� ���� ���� ū������ �� ������ ������ 
					fac=fac+1;
				System.out.println(num+"%"+i+"="+(num%i));
			}
		
			if(fac==2){
				System.out.println("�Ҽ� :"+num);

			}
		}
	}
}
