package day19;

public class StringTest2 {

	public static void main(String[] args) {
		String str = "hello";
		
		String arr[] = {"a","b","c"};
		
		System.out.println("str = "+str.toString());
		System.out.println(arr);
		//우리가 toString을 안써도 자동으로 써줌.
		//정보클래스에서는 정보값이, 기능클래스에서는 참조값이 출력된다.
		
		
		System.out.println(str.concat(" java"));
	
		System.out.println(str.substring(2,4)); //원하는 범위의 정보를 출력하는 substring 기능.
		
		StringBuffer sb = new StringBuffer("hello java"); //StringBuffer 클래스. 문자열의 원본을 편집하는 기능.
		System.out.println(sb.toString() );
		sb.append(" jsp"); //정보를 이어붙일 수 있다.
		System.out.println(sb); 
		sb.insert(6, "hi!!");//원하는 위치에 원하는 정보를 넣을 수 있다.
		System.out.println(sb);
		sb.delete(10, 14);//원하는 범위의 정보를 지울 수 있다.
		System.out.println(sb);
		//문자열의 조작. 원하는 조작으로 모든 문자열을 제어할 수 있다.
		
		
		
		
		
		
	}
	
}
