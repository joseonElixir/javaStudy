package day22;

import java.util.*;


public class DateTest {

	public static void main(String[] args) {

		while(true) {
			
			Calendar now = Calendar.getInstance();
			
			int h = now.get(Calendar.HOUR);
			int mn = 0x00+now.get(Calendar.MINUTE);
			int sec = +(now.get(Calendar.SECOND)); 
			int s = 0x001;
			System.out.print("\r"+h+"시"+mn+"분"+sec+"초");
			//cmd창에서 들여쓰기가 되어서 실시간으로 데이터가 변하는 것처럼 보이지만, 
			//1초에 한번씩 데이터가 덮어쓰여짐
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// 싱글톤방식의 대표적인 클래스. 객체가 이미 만들어져있기 때문에 new를 할 수 없다.
		// 싱글톤 방식 : 객체타입 할당 방식. 이미 만들어진 객체를 제공받는 형태.
		// 프로토타입 방식 : 새로운 객체를 직접 만들어 정적 메모리할당(new) + 생성자를 통해 새로이 만드는 방식.
		//System.out.println(y + "년" + (m + 1) + "월" + d + "일");

		

	}

}
