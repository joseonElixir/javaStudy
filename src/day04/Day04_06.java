package day04;
/**
 * java.io.IOException�� ����Ʈ�ؿ´�.
 * IOException ��� io���� ��ü�� ����Ʈ�ؿ��� ����
 *  (*)�� ����Ѵ�.
 * */
import java.io.*;

public class Day04_06 {
/**
 * throws IOException�� ����ؼ� IOException����
 * �߻��ϴ� ��� ���ܻ����� JVM(�ڹ� ���߾� �ӽ�)�� ������.(��������)
 * */
	public static void main(String[] args) 
	throws IOException{
		
		System.out.print("ù��° �� : ");
		int num1 = System.in.read();
		num1 = num1 - 48; // ���� 1�� �ƽ�Ű �ڵ尪�� 49
		//�Է��ϴ� ��(���ڿ� 1)�� ����Ǵ� ��(���� 1)�� ���߱� ���� 
		//�Է¹��� ���� ���� �������ش�.
		System.in.skip(100); 
		//������ ������ 2���� ������ ���� ��ŵ�� ���.
		System.out.print("�ι�° �� : ");
		int num2 = System.in.read();
		System.in.skip(100); // ���� �����൵ ��. 
		num2 = num2 - '0'; // '0'�� �ƽ�Ű�ڵ� ���� 48.
		//num2 ���� ���� �������ְ� ���� �����͸� ������.
		
		int sum = num1 + num2; // �Է¹��� ���� �����ش�.
		
		System.out.println(num1+"+"+num2+"="+sum);
		
		// �� ������   '��' �� '��' �� ���� '��' �� ����ÿ� ������ 
		//������°��� ������ ��.
		
	}

}
