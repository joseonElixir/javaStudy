package day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Revers2{
	
	StringBuffer sb ;
	
	public void revers(BufferedReader br) 
	throws IOException{
		int arr[] = new int [5];
		int a = arr.length;
		System.out.print("입력 :");
		sb = new StringBuffer(br.readLine());
		
		for(int i=sb.length();i>0;i--) {
		sb.append(sb.charAt(i-1));//크기가 5면 배열은 0~4까지. 원래크기의 끝 문자를 추가한다.
		System.out.println(sb); //
		System.out.println(sb.charAt(i-1));//charAt i-1번째 위치에 어떤 문자가 존재하는지 리턴, 지워질 문자 리턴이다.
		sb.delete(i-1, i); //크기가 5변 배열은 0~4까지. 지우는 번호는 (a,b)일 때 a부터 b이전까지 delete 이다.
		}//StringBuffer 클래스의 reverse메소드가 있다.
		System.out.println(sb.toString());
	}
	
}


public class Day20_01_1 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Revers2 r2 = new Revers2();
		//r2.revers(br);
		StringBuffer sb = new StringBuffer("가나다라마");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		char sc = sb.charAt(1);
		String ss = "가" + sb.charAt(2);
		String str = "가" + 1;
		System.out.println(ss);
		System.out.println(str);
	}
	
}
