package day06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day06_02 {

	public static void main(String[] args) 
	throws IOException{
		
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		
		
		System.out.print("연도 입력 : ");
		int year = Integer.parseInt(br.readLine());
		//1900  평년 , 2000 윤년
		//if ((year%4!=0||year%100==0)&&(year%400!=0)){
		//그냥 단순하게 4!, 100 , 400!
		//로 평년을 구할 수 있다.
		if ((year%4!=0||year%100==0)) {
			if(year%400==0) {
			System.out.println(year+"년은 윤년입니다.");
			}else {
				System.out.println(year+"년은 평년입니다.");				
			}			
		}else {
			System.out.println(year+"년은 윤년입니다.");			
		}
		/*
		if((year%4==0)&&(year%100!=0||year%400==0)) 
		//4, 100!, 400 = 윤년
		//4== true일 경우  뒤의 && 연산식을 수행,
		//4== false일 경우 뒤의 && 연산식ㅇ을 수행하지 않음. 보통의 평년
		//100!= true일 경우 뒤의 || 연산식을 수행하지 않음 = 4년단위 윤년
		//100!= false일 경우 뒤의 || 연산식을 수행
		//400== true일 경우 400년단위 윤년
		//400== false일 경우 100년단위 평년
		*/
		/*
		if((year%4==0&&year%100!=0)||(year%400==0)) 
		//4, 100!, 400 = 윤년
		if((year%4!=0||year%100==0)&&(year%400!=0)) 
		//4!, 100, 400! = 평년
		if((year%4!=0)||(year%100==0&&year%400!=0))
		//4!, 100, 400! = 평년 
		*/

	}
}
