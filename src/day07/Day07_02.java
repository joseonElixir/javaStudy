package day07;
import java.io.*;

public class Day07_02 {

	public static void main(String[] args) 
	throws IOException{
		
		BufferedReader br = new BufferedReader
		(new InputStreamReader(System.in));
		
		System.out.print("È½¼ö ÀÔ·Â:");
		int  num = Integer.parseInt(br.readLine());
		
		for (int i = 1; i<=num; i++) {
			System.out.println(i+", ¾È³çÇÏ¼¼¿ä.");
		}
		
	}

}
