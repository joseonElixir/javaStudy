package day20;
import java.io.*;
import java.util.Scanner;

class Revers{
	String user;
	char carr[];
	StringBuffer ruser; 
	
	public void revers(BufferedReader br) 
	throws IOException{
		System.out.print("문장입력:");
		user = br.readLine();
		carr = new char [user.length()];
		
		for(int i= 0;i<carr.length;i++) { //필요없는 구문 
			carr[i]=user.charAt(i);
		}
		
		ruser = new StringBuffer(""); 
		for(int i=user.length()-1;i>=0;i--) {
			ruser.append(carr[i]); //그냥 user.charAt(i)를 하면 된다.
		}
	
		System.out.println("출력결과:"+ruser);
		System.out.println(ruser.reverse());
	}
	
}


public class Day20_01 {

	public static void main(String[] args) 
	throws IOException{
		Revers rs = new Revers();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		rs.revers(br);
		System.out.println();
		//T
		Scanner sc = new Scanner(System.in);
		System.out.print("문장입력:");
		String str = sc.nextLine();
		System.out.println("str="+str);
		//String temp="";
		StringBuffer sb=new StringBuffer(); //String은 원본불변. 즉 String으로 입력을 받으면
		//기존 데이터에 붙일 데이터를 더한 새로운 데이터가 탄생한다.
		for(int i=str.length()-1; i>=0; i--) {
			sb.append(str.charAt(i)); //sb의 데이터 뒷부분에 (str의 (i)번째 정보)를 붙인다.
			System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println("다시 : "+sb.toString());
		
	}
	
}
