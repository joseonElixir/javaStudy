package day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Revers2{
	
	StringBuffer sb ;
	
	public void revers(BufferedReader br) 
	throws IOException{
		int arr[] = new int [5];
		int a = arr.length;
		System.out.print("�Է� :");
		sb = new StringBuffer(br.readLine());
		
		for(int i=sb.length();i>0;i--) {
		sb.append(sb.charAt(i-1));//ũ�Ⱑ 5�� �迭�� 0~4����. ����ũ���� �� ���ڸ� �߰��Ѵ�.
		System.out.println(sb); //
		System.out.println(sb.charAt(i-1));//charAt i-1��° ��ġ�� � ���ڰ� �����ϴ��� ����, ������ ���� �����̴�.
		sb.delete(i-1, i); //ũ�Ⱑ 5�� �迭�� 0~4����. ����� ��ȣ�� (a,b)�� �� a���� b�������� delete �̴�.
		}//StringBuffer Ŭ������ reverse�޼ҵ尡 �ִ�.
		System.out.println(sb.toString());
	}
	
}


public class Day20_01_1 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Revers2 r2 = new Revers2();
		//r2.revers(br);
		StringBuffer sb = new StringBuffer("�����ٶ�");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		char sc = sb.charAt(1);
		String ss = "��" + sb.charAt(2);
		String str = "��" + 1;
		System.out.println(ss);
		System.out.println(str);
	}
	
}
