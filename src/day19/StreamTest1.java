package day19;

public class StreamTest1 {

	public static void main(String[] args) {
		
		String str = "java";
		String str2 = "java";
		//equal을 통해 String에 문자열을 입력하면
		//heap에 정보를 스캔한 후 저장하려는 것과 동일한 기존 정보가 있으면
		//새로운 메모리가 아닌 기존 정보의 주소값이 stack에 쌓인다.
		String str3 = new String("java");
		
		if (str.equals(str2)) {
			System.out.println("str.equals(str2) : 같다");
		}else {			
			System.out.println("str==str2 : 같지않다");
		}
		
		if (str==str2) {
			System.out.println("str==str2 : 같다");
		}else {			
			System.out.println("str==str2 : 같지않다");
		}
		String res = str==str3?"같다":"같지않다";
		System.out.println("str.equals(str3) : "+res);
		
		String res2 = str.equals(str3)?"같다":"같지않다";
		System.out.println("str==str3 : "+res2);
	}
	
	
}
