package day20;

import java.io.*;

class Suggest{
	
	String []arr={"java �� ������", "java�� ����","jsp ����","jsp ���ʺ��� �߱ޱ���"};
	String user;
	public Suggest() {
		user="";
	}
	
	public void con(BufferedReader br) throws IOException{
		System.out.print("�˻��� : ");
		user = br.readLine();
		System.out.println();
		System.out.println("�˻����.");
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length();j++){
				if(arr[i].length()>=j+user.length()&&
						arr[i].substring(j,j+user.length()).equals(user)) {
					System.out.println(arr[i]);
					break;
				}//indexOf�� ����� for������ �����ϸ� �̷��� �ȴ�.
				//����� ������ ũ�⸸ŭ substring���� �ɰ��� 
				//�ش� ���� ������ ���������� equals�� ���ϴ� ���. 
			}//�� indexOf ����; �̷��� �ƴ°� ���̴�.
		}	
	}
}




public class Day20_02 {

	
	public static void main(String[] args) 
	throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Suggest sb = new	 Suggest();
		sb.con(br);
	
//		String str1 = "�����ٶ�";
//		String str2 ="";
//		
//		str1.substring(0, 1);
//		str2 = str1.substring(0, 1);
//		System.out.println(str1);
//		System.out.println(str2);
		
		
		
		System.out.println("���� ���");
		System.out.println();
		System.out.print("�˻���:");
		String str = br.readLine();
		String []arr={"java �� ������", "java�� ����","jsp ����","jsp ���ʺ��� �߱ޱ���"};
		for(int i=0; i<arr.length;i++) {
			if(arr[i].indexOf(str)!=-1) { //indexOf�� ���ڿ��� �񱳹��ڿ��� ã�Ƽ� ���ϰ��� �ִ� �޼ҵ��̴�.
				//���ϰ��� Ư¡�� �� ���ڿ��� ���ڿ��� 0��°���� �����ϸ� ���� 0, 2��°���� �����ϸ� ���� 2�� �ִ� ���̰�,
				//�� ���ڿ��� �ߺ����� ������ -1�� �����Ѵ�. �� �迭�� �ε����� �����Ѵ�. 
				System.out.println(arr[i]);
			}
		}	
	}
}
