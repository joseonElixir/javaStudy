package day04;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Day04_10_01 {

	public static void main(String[] args) 
	throws IOException{

		BufferedWriter bw = 
			new BufferedWriter(new OutputStreamWriter(System.out));
		String str = "good.";
		bw.write(str + "\n");
		bw.flush();
		bw.close();
		
	}

}
