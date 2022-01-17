package day19;

class Outer2 {
	String str = "###";

	public void test() {
		String str2 = "$$$";
		System.out.println("str :" + str);
		System.out.println("str2:" + str2);

		class Local {
			String str3 = "***"; // 멤버변수

			public void test2() {
				System.out.println("str3=" + str3);
				System.out.println("str="+str); //나를 품은 메소드의 클래스의 멤버변수에 접근 가능
				System.out.println("str2="+str2);//나를 품은 메소드의 지역변수에 접근 가능
			}
		}
		
		Local lo = new Local();
		lo.test2(); //여기서 실행되는 것이 test 메소드가 실행되는 순간 생성 및 실행됨.

	}
	
	public void test3() {
		//Local lo2 =new Local(); 
		//로컬클래스
	}
	
	
}



public class LocalTest {

	public static void main(String[] args) {

		Outer2 o2 = new Outer2();
		o2.test();
		

	}

}
