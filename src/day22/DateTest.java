package day22;

import java.util.*;


public class DateTest {

	public static void main(String[] args) {

		while(true) {
			
			Calendar now = Calendar.getInstance();
			
			int h = now.get(Calendar.HOUR);
			int mn = 0x00+now.get(Calendar.MINUTE);
			int sec = +(now.get(Calendar.SECOND)); 
			int s = 0x001;
			System.out.print("\r"+h+"��"+mn+"��"+sec+"��");
			//cmdâ���� �鿩���Ⱑ �Ǿ �ǽð����� �����Ͱ� ���ϴ� ��ó�� ��������, 
			//1�ʿ� �ѹ��� �����Ͱ� �������
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// �̱������� ��ǥ���� Ŭ����. ��ü�� �̹� ��������ֱ� ������ new�� �� �� ����.
		// �̱��� ��� : ��üŸ�� �Ҵ� ���. �̹� ������� ��ü�� �����޴� ����.
		// ������Ÿ�� ��� : ���ο� ��ü�� ���� ����� ���� �޸��Ҵ�(new) + �����ڸ� ���� ������ ����� ���.
		//System.out.println(y + "��" + (m + 1) + "��" + d + "��");

		

	}

}
