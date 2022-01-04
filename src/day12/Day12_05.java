package day12;
import java.io.*;
public class Day12_05 {

	public static void gugu(int a ) { //call by value
		for(int i=1;i<=9;i++) {
			System.out.println(a+"*"+i+"="+(a*i));
		}
	}
	
	public static void main(String[] args) 
	throws IOException{
		
		System.out.print("´Ü ÀÔ·Â :");
		int dan = System.in.read()-'0';
		System.in.skip(2);
		gugu(dan);
		
	}
}
