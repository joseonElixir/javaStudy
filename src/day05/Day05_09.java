package day05;
import java.io.*;
public class Day05_09 {

	public static void main(String[] args) 
	throws IOException{
	//입력받은 문자가 숫자인지 문자인지 특수문자인지 판단하는 코드.
		System.out.print("입력 : ");
		int word = System.in.read(); //ascii코드로 입력받아서 판단하는 용도.
		//char cword =(char)word; //가비지코드.
		String res = ""; //if문을 통해 문자열을 받을 변수 선언.
		if(word>='0'&&word<='9') {
			res = "숫자";
		}else if((word>='A'&&word<='Z')||(word>='a'&&word<='z')) {
			res = "영문자";
		}else { 
			res= "기타문자";
		}
		System.out.println("입력한 "+(char)word+"는 "+res+"입니다.");
		//(char)word는 내가 생각해내지 못한 코드. 메모리할당을 안하고 정수값으로
		//'문자'를 표현할 수 있다. 
		//System.out.println("입력한 "+cword+"는 "+res+"입니다.");
		//가비지변수 cword
	
	}

}
