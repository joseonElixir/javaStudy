package day20;

import java.util.Scanner;

class Bullshit{
	String user;
	String arr[] = {"�ٺ�","�˰�","��û��"};
	
	public void masikg(Scanner sc) {
		System.out.println("�Է� : ");
		user = sc.nextLine();
		for(int i=0;i<arr.length;i++) {
			user= user.replaceAll(arr[i], "***");
		}
		System.out.println(user);
		
		
	}
	
	
}

public class Day20_03 {

	public static void main(String[] args) {
		Bullshit bs = new Bullshit();
		Scanner sc = new Scanner(System.in);
		
		//bs.masikg(sc);

		System.out.println("");
		System.out.println("�ι�° ���");
		System.out.println("");
		String user;
		String arr[] = {"�ٺ�","�˰�","��û��"};
		System.out.println("�Է� : ");
		user = sc.nextLine();
		StringBuffer sb = new StringBuffer(user);
		for(int i=0;i<arr.length;i++) {
			while(true) {
				if(sb.indexOf(arr[i])==-1) {
					break;
				}
				int num = sb.indexOf(arr[i]);
				sb.replace(num, num+arr[i].length(), "***");
				
			}//replaceAll�� ����� replace�� �Ἥ ������ ��. �� replaceAll ����.
			
		}
		System.out.println(sb);
		
		System.out.println();
		System.out.println("����° ��� (��¥ ũ�⿡ ���� ����ŷ �Է�)");
		System.out.println();
		System.out.println("�Է�");
//		user = sc.nextLine();
//		sb = new StringBuffer(user);
		sb = new StringBuffer(sc.nextLine()); //StringBuffer�� �Է¹����� �ȴ� ��.
		
		for(int i=0;i<arr.length;i++) {//arr�� ����� ��Ӿ� ������ŭ for���� ����.
			while(true) {
			int os = sb.indexOf(arr[i]); // ��Ӿ��� ������index (offset index). ���ʿ��ϳ� �ڵ��� ���ü��� ���� �ۼ�.		
			int len= arr[i].length();		//��Ӿ� ũ�� (length). ���� ���ʿ��ϳ� �ڵ��� ���ü��� ���� �ۼ�.
				if(os!=-1) { 
						// ��Ӿ �������� ���� ��� os�� -1�� ���ϵǰ� ArrayIndexOutOfBoundException�� �߻��Ѵ�.
					sb.delete(os,os+len);		//�Էµ� sb���� ��Ӿ �ش�Ǵ� �������� (���� �ε����� �� �ε��� ����)
					for(int j=0;j<len;j++) {			
						sb.insert(os, "*");		//��Ӿ��� ũ�⸸ŭ asterisk ����
					}
				}else {break;} //os�� -1�� �� ��� while���� �������´�.
			}//while end
		}//for end
		
		System.out.println(sb);
		
		
		
		
		
	}

}
