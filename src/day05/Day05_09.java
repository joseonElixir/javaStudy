package day05;
import java.io.*;
public class Day05_09 {

	public static void main(String[] args) 
	throws IOException{
	//�Է¹��� ���ڰ� �������� �������� Ư���������� �Ǵ��ϴ� �ڵ�.
		System.out.print("�Է� : ");
		int word = System.in.read(); //ascii�ڵ�� �Է¹޾Ƽ� �Ǵ��ϴ� �뵵.
		//char cword =(char)word; //�������ڵ�.
		String res = ""; //if���� ���� ���ڿ��� ���� ���� ����.
		if(word>='0'&&word<='9') {
			res = "����";
		}else if((word>='A'&&word<='Z')||(word>='a'&&word<='z')) {
			res = "������";
		}else { 
			res= "��Ÿ����";
		}
		System.out.println("�Է��� "+(char)word+"�� "+res+"�Դϴ�.");
		//(char)word�� ���� �����س��� ���� �ڵ�. �޸��Ҵ��� ���ϰ� ����������
		//'����'�� ǥ���� �� �ִ�. 
		//System.out.println("�Է��� "+cword+"�� "+res+"�Դϴ�.");
		//���������� cword
	
	}

}
