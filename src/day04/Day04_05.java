package day04;

import java.io.*;
public class Day04_05 {

	public static void main(String[] args) 
	throws IOException{
		
		System.out.print("ù��° : ");
		int a = System.in.read();
		System.in.skip(3);
		System.out.print("�ι�° : ");
		int b = System.in.read();
		System.in.skip(2);
		System.out.print("����° : ");
		int c = System.in.read();
		System.in.skip(2);
		
		System.out.println("a="+a+"/b="+b+"/c="+c);
		/*���� : ������ ���� /r�� /n���� �����Ǿ��ֱ� ������
		 * ���� �Է��ϰ� ���ͷ� �ѱ� ���� ���ۿ� /r�� /n�� ���� ������
		 * 10�� 13�� b�� c�� ����ȴ�.
		 * �� ������ System.in.skip();�� ����ؼ�
		 * �Է¹��� ������ �����͸� ����������.
		 * 
		 * 
		 */
		
		
		
		
		
	}

}
