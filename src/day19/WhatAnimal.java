package day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhatAnimal {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("동물을 입력 2:");
		String an = br.readLine();
		if(an.equals("강아지")) {
			System.out.println(an+"는 멍멍");
		}
		
		System.out.println();
		
	}

}
