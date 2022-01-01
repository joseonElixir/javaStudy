package day05;

import java.io.*;

public class Day05_08 {

	public static void main(String[] args) 
	throws IOException{
		
		System.out.print("입력 : ");
		int a =System.in.read();
		String str = "";
		if (a=='b'||a=='B') { // 'b'를 입력해도 98로 인식한다. 
			str = "Brother";	//입력받는 '문자'는 ascii 정수코드로 인식된다.
		}else if (a==102||a==70) { //'f' = ascii 102 , 'F' = ascii 70
			str = "Fother";
		}else if (a==109||a==77) {
			str = "Mother";			
		}else if (a==115||a==83) {
			str = "Sister";
		}
		System.out.print("출력 : "+str);

		//a : 97 ,  A : 65 32차이.
		

	}

}
