package day20;
import java.io.*;
import java.util.Scanner;

class Revers{
	String user;
	char carr[];
	StringBuffer ruser; 
	
	public void revers(BufferedReader br) 
	throws IOException{
		System.out.print("�����Է�:");
		user = br.readLine();
		carr = new char [user.length()];
		
		for(int i= 0;i<carr.length;i++) { //�ʿ���� ���� 
			carr[i]=user.charAt(i);
		}
		
		ruser = new StringBuffer(""); 
		for(int i=user.length()-1;i>=0;i--) {
			ruser.append(carr[i]); //�׳� user.charAt(i)�� �ϸ� �ȴ�.
		}
	
		System.out.println("��°��:"+ruser);
		System.out.println(ruser.reverse());
	}
	
}


public class Day20_01 {

	public static void main(String[] args) 
	throws IOException{
		Revers rs = new Revers();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		rs.revers(br);
		System.out.println();
		//T
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է�:");
		String str = sc.nextLine();
		System.out.println("str="+str);
		//String temp="";
		StringBuffer sb=new StringBuffer(); //String�� �����Һ�. �� String���� �Է��� ������
		//���� �����Ϳ� ���� �����͸� ���� ���ο� �����Ͱ� ź���Ѵ�.
		for(int i=str.length()-1; i>=0; i--) {
			sb.append(str.charAt(i)); //sb�� ������ �޺κп� (str�� (i)��° ����)�� ���δ�.
			System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println("�ٽ� : "+sb.toString());
		
	}
	
}
