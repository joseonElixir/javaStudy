package day20;

import java.util.*;
public class Day20_04 {

	public static void main(String[] args) {
		String str= "사과,포도,딸기,배,수박";
		
		String[] fruit = str.split(","); // 하나의 문자열을 해당 기준으로 쪼개서 String 배열에 저장.
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
