package day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhatAnimal {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ �Է� 2:");
		String an = br.readLine();
		if(an.equals("������")) {
			System.out.println(an+"�� �۸�");
		}
		
		System.out.println();
		
	}

}
