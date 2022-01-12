package day18;
import java.io.*;
class AAA{
	public void aaa()throws IOException{
		 //throws를 사용하면 JVM에게 에러가 전가되는가
		 //사실은 자신을 호출하는 객체에게 떠넘겨진다.
		 //가장 마지막에 호출하는 것이 JVM.
		 
		//throw new IOException();
		//throw new NullPointerException();
		 
	}
}

class BBB{
	public void bbb() throws IOException {
		AAA a = new AAA();
		a.aaa();
	}
}

public class ThrowsTest6 {
	public static void main(String[] args) throws IOException{
		//최종적으로 메인메소드를 호출하는 것이 JVM이기 때문에 JVM이 알아서함
	
		BBB b = new BBB();
		b.bbb();
		System.out.println("sadsa");
	
	}
}
