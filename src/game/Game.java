package game;

import java.io.*;

public class Game {

	public static void main(String[] args) throws IOException {

		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// ���� ��ǥ : ���������� ���� �����.
		while (true) { //while���� ���ؼ� �ݺ� ������ ��´�. 

			int user = 0;
			String s_user = "";
			String s_comp = "";
			System.out.println("======================");
			System.out.println("| ���� ���� �� ���� v1.0 |");
			System.out.println("----------------------");
			System.out.println("1.���� 2. ���� 3.�� 4.����");
			System.out.println("======================");

			do {
				System.out.print("Ű���� �Է�>");
				user = System.in.read() - '0';
				System.in.skip(100);
				if(!(1 <= user && user <= 4))
					System.out.println("���Է�");
				// ������ Ű�� �ԷµǸ� ��ȿ�� �˻簡 ���� ���� ���ư��� ������ �߻��Ѵ�.
				// �˳��ϰ� 100��ŵ.
				// user = Integer.parseInt(br.readLine());
				// ���ڿ��� ascii�� ��ȯ�� �� ���� ������ ������ ���.
			} while (!(1 <= user && user <= 4)); // ��ȿ�� �˻�.
			// user�� �Է°��� 1~4�� �Ѿ�� �Ѿ�� �ʰ� ���û.
			int comp = (int) (Math.random() * 3 + 1); // ���� ����
			String res = ""; // ������� ���� String���� res

			switch (user) { //�Էµ� user�� ���� ���� �Ǵ��ϴ� switch��
			case 1:
				//���׿����ڸ� �̿��� �Ǵ�.
				s_user = "����";//user�� 1�� �ԷµǸ� s_user�� "����"�� �Էµȴ�.
				res = comp == 1 ? "���º�! �ٽ�!" : (comp == 2 ? "��ǻ�� ��!" : "����� ��!");
				break;

			case 2:
				s_user = "����";
				if (comp == 1) {
					res = "����� ��!";
				} else if (comp == 2) {
					res = "���º�! �ٽ�!";
				} else {
					res = "��ǻ�� ��!";
				}
				break;

			case 3:
				s_user = "��";
				res = comp == 1 ? "��ǻ�� ��!" : (comp == 2 ? "����� ��!" : "���º�! �ٽ�!");
				break;

			case 4:
				System.out.println("������� ��û�� ���� �ý����� �����մϴ�.");
				System.exit(0);
			}

			switch (comp) {
			//comp�� �ԷµǴ� �������� ���� s_comp�� �ԷµǴ� ����.
			case 1:s_comp = "����"; break;
			case 2:s_comp = "����"; break;
			case 3:s_comp = "��"; break;
			}
			
			System.out.println("����� : " + s_user);
			System.out.println("��ǻ�� : " + s_comp);
			System.out.println(res);

		}

	}

}
