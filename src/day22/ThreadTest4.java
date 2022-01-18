package day22;
import java.util.*;
public class ThreadTest4 {

	public static void main(String[] args) {
		
		while(true) {
			Calendar now =Calendar.getInstance();
			
			int h = now.get(Calendar.HOUR);
			int m = now.get(Calendar.MINUTE);
			int s = now.get(Calendar.SECOND);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
			String str = h+"시"+m+"분"+s+"초";
			System.out.print("\r"+str);
		}//console창에서는 그냥 개행되지만, cmd창에서는 해당 열에서 갱신된다.
		//cmd 작동 방법 : cd 명령어로 bin파일까지로 위치 변경 후 
		//javac day22.TreadTest.java 는 class 파일 없을때 하고
		//java day22.TreadTest 하면 된다.
		
	}
	
}
