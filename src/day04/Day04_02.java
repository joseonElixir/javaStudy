package day04;

public class Day04_02 {
	public static void main(String[] args) {
		
		int kor = 80;
		int eng = 75;
		
		String korname = "����";
		String engname = "����";
		
		int sum = kor+eng;
		int avg = sum/2;
		int max = kor > eng ? kor : eng;
		String higher = kor > eng ? korname : engname;
		//��Ʈ�� ���̾ �����ϰ� �ڸ��ƿ� �ױ۸��ø� �񱳸� �ߴ�.
		//�׸��� �� ���� ���� ��� ���ϰ����� �ڸ��� ������ �������ְ�,
		//�� ���� ������ ��� �ױ۸��� ������ �������ش�.
		// �ڸ��� > �ױ۸����� ������ ���̱� ������ �ڸ��Ƴ����� ���ϵǾ���,
		//�� ��� ���̾�� �ڸ��Ƴۿ� ����� ���� ����Ǿ���.
		
		
		System.out.println(korname + " = "+kor);
		System.out.println(engname + " = "+eng);
		
		System.out.println("���� = "+sum);
		System.out.println("��� = "+avg);
		
		System.out.println(higher +"������ ���� �����̽��ϴ�.");
		System.out.println(higher+" ���� = " + max);
		
		
		
	}
}
