package day06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day06_02 {

	public static void main(String[] args) 
	throws IOException{
		
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		
		
		System.out.print("���� �Է� : ");
		int year = Integer.parseInt(br.readLine());
		//1900  ��� , 2000 ����
		//if ((year%4!=0||year%100==0)&&(year%400!=0)){
		//�׳� �ܼ��ϰ� 4!, 100 , 400!
		//�� ����� ���� �� �ִ�.
		if ((year%4!=0||year%100==0)) {
			if(year%400==0) {
			System.out.println(year+"���� �����Դϴ�.");
			}else {
				System.out.println(year+"���� ����Դϴ�.");				
			}			
		}else {
			System.out.println(year+"���� �����Դϴ�.");			
		}
		/*
		if((year%4==0)&&(year%100!=0||year%400==0)) 
		//4, 100!, 400 = ����
		//4== true�� ���  ���� && ������� ����,
		//4== false�� ��� ���� && ����Ĥ��� �������� ����. ������ ���
		//100!= true�� ��� ���� || ������� �������� ���� = 4����� ����
		//100!= false�� ��� ���� || ������� ����
		//400== true�� ��� 400����� ����
		//400== false�� ��� 100����� ���
		*/
		/*
		if((year%4==0&&year%100!=0)||(year%400==0)) 
		//4, 100!, 400 = ����
		if((year%4!=0||year%100==0)&&(year%400!=0)) 
		//4!, 100, 400! = ���
		if((year%4!=0)||(year%100==0&&year%400!=0))
		//4!, 100, 400! = ��� 
		*/

	}
}
