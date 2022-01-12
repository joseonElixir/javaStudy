package day18;
import java. io.*;

public class ExceptTest5 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("��� �����͸� �Է��ϰڽ��ϱ�");
			int num = Integer.parseInt(br.readLine());
			int arr[]= new int[num];
			for(int i=0;i<arr.length;i++) {
				System.out.print("������"+(i+1)+"�� : ");
				arr[i]= Integer.parseInt(br.readLine());
			}
			System.out.println("����ϰ���� ���� ���°�� �ֳ���?");
			int result = Integer.parseInt(br.readLine())-1;
			System.out.println("������ ���� : "+arr[result]);
		}catch (NumberFormatException e) {
			System.out.println("���ڸ� �Է��Ͻÿ�");
			//e1.printStackTrace();
		}catch(NegativeArraySizeException e) {
			System.out.println("����� �Է��Ͻÿ�");
			//e3.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�Ҵ�� ������ �����Ͻÿ�");
			//e2.printStackTrace();
		}catch(IOException e) {
			System.out.println("IOException");
		}catch(Exception e) {
			System.out.println("�� ����?");
		}
		finally {
			try {
				br.close();
				System.out.println("�޸𸮰� ��ȯ�Ǿ���");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("��!");	
		
	}
	
}
