package day20;

import java.util.*;
public class Day20_04 {

	public static void main(String[] args) {
		String str= "���,����,����,��,����";
		
		String[] fruit = str.split(","); // �ϳ��� ���ڿ��� �ش� �������� �ɰ��� String �迭�� ����.
		for(int i =0;i<fruit.length;i++) {
			
			System.out.println(fruit[i]);
		}
		System.out.println("----------------------------");
		
		StringTokenizer st = new  StringTokenizer(str, ",");
		
		while(st.hasMoreTokens()){
			System.out.println(st.countTokens());
			String temp = st.nextToken();
			System.out.println(temp);
		}
		
		System.out.println(st.countTokens());
		System.out.println(st.hasMoreTokens());
		
	}
	
}
