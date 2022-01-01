package day04;
/**
 * java.io.IOException을 임포트해온다.
 * IOException 대신 io파일 전체를 임포트해오기 위해
 *  (*)을 사용한다.
 * */
import java.io.*;

public class Day04_06 {
/**
 * throws IOException을 사용해서 IOException에서
 * 발생하는 모든 예외사항을 JVM(자바 버추얼 머신)에 던진다.(직무유기)
 * */
	public static void main(String[] args) 
	throws IOException{
		
		System.out.print("첫번째 수 : ");
		int num1 = System.in.read();
		num1 = num1 - 48; // 숫자 1의 아스키 코드값은 49
		//입력하는 값(문자열 1)과 저장되는 값(숫자 1)을 맞추기 위해 
		//입력받은 뒤의 값을 조정해준다.
		System.in.skip(100); 
		//엔터의 데이터 2개를 날리기 위해 스킵을 사용.
		System.out.print("두번째 수 : ");
		int num2 = System.in.read();
		System.in.skip(100); // 굳이 안해줘도 됨. 
		num2 = num2 - '0'; // '0'의 아스키코드 값은 48.
		//num2 역시 값을 조정해주고 뒤의 데이터를 날린다.
		
		int sum = num1 + num2; // 입력받은 값을 합해준다.
		
		System.out.println(num1+"+"+num2+"="+sum);
		
		// 위 과정은   'ㄱ' 과 'ㅏ' 를 갖고 '가' 를 만드시오 수준의 
		//문제라는것을 인지할 것.
		
	}

}
