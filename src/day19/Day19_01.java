package day19;
import java.io.*;
class WordSearch{
	//���ڿ����� Ư�� ������ ������ ã�� ���α׷�.
	String user;
	String search;
	char temp;
	int count=0;
	int count2=0;
	int count3=0;
	public void search(BufferedReader br) 
	throws IOException{
		System.out.println("���� �Է� : ");
		user = br.readLine();
		System.out.println("ã�� ���� :");
		search = br.readLine();
		System.out.println("charŸ�� ã�� ���� 2 :");
		temp = (char)br.read();
	}
	public void detect() {
		String[] sarr= user.split("");
		//String �迭�� user�� ��� ���� ����("")�� �ɰ��� �����ϴ� �޼ҵ�.
		//������ " "�� ���ڿ��� ���Ⱑ ������ ������ �ɰ���. 
		//������� "����ȭ ���� �Ǿ����ϴ�." ��� ������ �ְ� ������ " "�� ���
		//String �迭�� {"����ȭ","����","�Ǿ����ϴ�."} �� ����ȴ�.
	
		for(int i=0;i<user.length();i++) {
			if(user.length()>=i+search.length()&&
				search.equals(user.substring(i,i+search.length()))) { 
				//String class�� substring : ������ �����Ͽ� �ش� ������ ���ڿ��� �����Ѵ�.
				//���ڸ� �ɰ��� ã�� ���ڿ� ������ �����Ͽ� count++�Ѵ�.
				count++;
			}
			if(sarr[i].equals(search)) {
				count2++;
			}
			if(user.charAt(i)==temp) { 
				//charAt�� ���ڿ����� ��ȣ���� ��ȣ°�� ���ڸ� ����(charŸ��)���� �����ϴ� �޼ҵ�.
				count3++;				
			}
		}
		System.out.println(search+"�� �� "+count+"�� �Դϴ�.");
		System.out.println("count2 : "+count2+", count3 : "+count3);
		
	}
}


public class Day19_01 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		WordSearch ws = new WordSearch();
		
		ws.search(br); // ���� �Է� �� ã�� ���� �Է�
		ws.detect(); //���� �� ���
		
		
		
		
	}
	

}
