package game;

import java.io.*;
//����
public class BaseballGame {

	public static void main(String[] args) throws IOException {

		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));

		System.out.println("============");
		System.out.println("���� �߱� ����");
		System.out.println("Ver1.0");
		System.out.println("============");

		int com[] = new int[3];
		int user[] = new int[3];
		
		for (int i = 0; i < com.length; i++) {
			com[i] = (int) (Math.random() * 10);
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {
					i--;
				}

			} // in for end.
		} // out for end.
		for (int i = 0; i < com.length; i++) {
			System.out.print(com[i]+",");
		}//com�� ����� �� ����
		
		System.out.println();
		System.out.println("������ ���� 3���� �� ������ ���߽ÿ�");
		System.out.println();

		for (int k = 0; k < 10; k++) {
			
			// ����3���� �Է¹��� �� ������ ���� ���
			// �ٽ� ���� 3���� �Է¹޴´�.
			for (int l = 0; l < user.length; l++) {
				System.out.print((l + 1) + "��° ���ڸ� �Է��Ͻÿ�:");
				user[l] = Integer.parseInt(br.readLine());
				for(int i=0;i<l;i++) {
					if(user[l]==user[i]) {
						System.out.println("�ߺ��� ���Դϴ�. �ٽ� �Է��ϼ���.");
						l--;
					}
				}
			} // �Է¹޴� ����.
			System.out.println();
			System.out.println((k + 1) + "��°");

			int strike = 0;
			int ball = 0;
			for (int i = 0; i < com.length; i++) {
			// �� ������ ù��° for��.
			// ���� ��ġ�� ��ȣ�� �� 1������ ���ؾ� �ϱ� ������
			// �� ����� for���� ��ġ.
			// ���� �� ����� ��ġ�� ��ġ�ϸ� ���� i�� �δ� j�� �δ� 3���� ���ư�.				
			// ���� j,i�� �θ� �� �׸��� ��ġ���� ���� �޶����� ��찡
			// �߻��ϱ� ������ �̰� ball�� ���ǿ� �ش��Ѵ�.
				if (com[i] == user[i]) {
					strike++;
				} else {
				// strike�� �ƴ� ��쿡 ������ ball�� ã�´�.
				//i���� strike�� �߻���Ű�� �� ���� ball���� out����
				//���� �ʿ䰡 ���� ������ �� ����� +1.
				//�� ����ڰ� +1�� ���¿��� strike�� �߻����� ���� ���
				//�񱳴���ڸ� �������� ball�� ���ǿ� �ش��ϴ� ���� ã�´�.
				//�ٸ� �տ��� strike�� �ƴ϶�� ������ ����Ǿ��� ������
				//���ǽĿ����� �� �κ��� ����.
				//����, com�� ���� �ߺ��� ���� ������
				//�׿� ���� ���ǽĵ� ����.
					
					for (int j = 0; j < user.length; j++) {
						if (com[i] == user[j]) {
						//
							ball++;
						}
					}
				}
			}

			if (strike == 0 && ball == 0) {
				//strike�� ball�� ���� ���
				System.out.println("out");
			} else if (strike == 3) {
				System.out.println("win.");
				System.exit(0);
				//������ �̱�� �ý����� ����.
			} else {
				System.out.println(strike + "strike "+ball+"ball");
	
			}
			System.out.println();
		}//game for end
		
		
		System.out.println("�й�");
		//10�� �̳��� �¸��� ���� ��� game for���� �������� �й谡 ��µȴ�. 

	}// main end

}
