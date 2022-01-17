package day19;

import java.io.IOException;
import java.util.*;

class YongException extends Exception{
	
	public YongException() {
		super("����� ���� ���� : �̼������� �� �߻��ϴ� ����.");
		
	}
	
}


public class UserExceptTest {
		
	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in); //throws�� ���� �ʾƵ� �Ǵ� ����.
		
		System.out.print("����� ���̴� : ");
		int age = sc.nextInt(); //�ٸ� ������ ���� ���������� �ʴ´ٰ� �Ѵ�.
		sc.nextLine(); //�׷��� ������ ���ۿ� �����ִ� �����͸� ������ ���ؼ� �̷������� �ʱ�ȭ�� �������.
		System.out.println("�Է��� �� Ȯ�� : "+ age);
		try {
			if(age<20) {
				throw new YongException();
			}
			System.out.println("������ �� �����ؾ��ϴ� ���");
			System.out.println("���� ȯ��");

		}catch(YongException e) {
			System.out.println("�̼������� �� �����ϴ� �κ�");
			System.out.println("�ֵ��� ����.");
			e.printStackTrace();
		}
		//����� ���� ������ �������� Ư�� ������ Ư�� ���ǿ��� �Ѵ� ��ũ��
		//�ʵ忡�� ��ȣ���� ���� ����� �ƴ϶�� �Ѵ�.
		//���� ? if������ ����� ���� �����ϱ⵵ �ϰ�, ������ ������ �ַ��� if���� ����ϴµ�
		//���� Ŭ������ ���� Exception��ӹ޴�
		//���ŷο� �۾��� �ؾ��ϱ� ����.
		
		System.out.println("�̰��� �������� ����� ���");
		
		
		
		
	}
	
}
