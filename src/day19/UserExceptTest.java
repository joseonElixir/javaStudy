package day19;

import java.io.IOException;
import java.util.*;

class YongException extends Exception{
	
	public YongException() {
		super("사용자 지정 예외 : 미성년자일 때 발생하는 에러.");
		
	}
	
}


public class UserExceptTest {
		
	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in); //throws를 하지 않아도 되는 장점.
		
		System.out.print("당신의 나이는 : ");
		int age = sc.nextInt(); //다만 버퍼의 값을 삭제해주지 않는다고 한다.
		sc.nextLine(); //그렇기 때문에 버퍼에 남아있는 데이터를 날리기 위해서 이런식으로 초기화를 해줘야함.
		System.out.println("입력한 값 확인 : "+ age);
		try {
			if(age<20) {
				throw new YongException();
			}
			System.out.println("성인일 때 수행해야하는 기능");
			System.out.println("성인 환영");

		}catch(YongException e) {
			System.out.println("미성년자일 때 수행하는 부분");
			System.out.println("애들은 가라.");
			e.printStackTrace();
		}
		//사용자 정의 에러를 만들어놓고 특정 영역을 특정 조건에서 넘는 테크닉
		//필드에서 선호도가 높은 기술은 아니라고 한다.
		//이유 ? if문으로 충분히 구현 가능하기도 하고, 어차피 조건을 주려면 if문도 써야하는데
		//따로 클래스를 만들어서 Exception상속받는
		//번거로운 작업을 해야하기 때문.
		
		System.out.println("이것은 공통으로 수행될 기능");
		
		
		
		
	}
	
}
