package day22;
import java.util.*;
public class ThreadTest4 {

	public static void main(String[] args) {
		
		while(true) {
			Calendar now =Calendar.getInstance();
			
			int h = now.get(Calendar.HOUR);
			int m = now.get(Calendar.MINUTE);
			int s = now.get(Calendar.SECOND);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
			String str = h+"��"+m+"��"+s+"��";
			System.out.print("\r"+str);
		}//consoleâ������ �׳� ���������, cmdâ������ �ش� ������ ���ŵȴ�.
		//cmd �۵� ��� : cd ��ɾ�� bin���ϱ����� ��ġ ���� �� 
		//javac day22.TreadTest.java �� class ���� ������ �ϰ�
		//java day22.TreadTest �ϸ� �ȴ�.
		
	}
	
}
