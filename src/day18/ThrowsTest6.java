package day18;
import java.io.*;
class AAA{
	public void aaa()throws IOException{
		 //throws�� ����ϸ� JVM���� ������ �����Ǵ°�
		 //����� �ڽ��� ȣ���ϴ� ��ü���� ���Ѱ�����.
		 //���� �������� ȣ���ϴ� ���� JVM.
		 
		//throw new IOException();
		//throw new NullPointerException();
		 
	}
}

class BBB{
	public void bbb() throws IOException {
		AAA a = new AAA();
		a.aaa();
	}
}

public class ThrowsTest6 {
	public static void main(String[] args) throws IOException{
		//���������� ���θ޼ҵ带 ȣ���ϴ� ���� JVM�̱� ������ JVM�� �˾Ƽ���
	
		BBB b = new BBB();
		b.bbb();
		System.out.println("sadsa");
	
	}
}
