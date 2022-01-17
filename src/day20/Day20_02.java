package day20;

import java.io.*;

class Suggest{
	
	String []arr={"java 참 쉬워요", "java의 기초","jsp 기초","jsp 기초부터 중급까지"};
	String user;
	public Suggest() {
		user="";
	}
	
	public void con(BufferedReader br) throws IOException{
		System.out.print("검색어 : ");
		user = br.readLine();
		System.out.println();
		System.out.println("검색결과.");
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length();j++){
				if(arr[i].length()>=j+user.length()&&
						arr[i].substring(j,j+user.length()).equals(user)) {
					System.out.println(arr[i]);
					break;
				}//indexOf의 기능을 for문으로 구현하면 이렇게 된다.
				//대상을 비교자의 크기만큼 substring으로 쪼개서 
				//해당 범위 구문을 순차적으로 equals로 비교하는 방식. 
			}//걍 indexOf 쓰자; 이래서 아는게 힘이다.
		}	
	}
}




public class Day20_02 {

	
	public static void main(String[] args) 
	throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Suggest sb = new	 Suggest();
		sb.con(br);
	
//		String str1 = "가나다라마";
//		String str2 ="";
//		
//		str1.substring(0, 1);
//		str2 = str1.substring(0, 1);
//		System.out.println(str1);
//		System.out.println(str2);
		
		
		
		System.out.println("다음 방식");
		System.out.println();
		System.out.print("검색어:");
		String str = br.readLine();
		String []arr={"java 참 쉬워요", "java의 기초","jsp 기초","jsp 기초부터 중급까지"};
		for(int i=0; i<arr.length;i++) {
			if(arr[i].indexOf(str)!=-1) { //indexOf는 문자열에 비교문자열을 찾아서 리턴값을 주는 메소드이다.
				//리턴값의 특징은 비교 문자열이 문자열의 0번째부터 시작하면 리턴 0, 2번째부터 시작하면 리턴 2를 주는 식이고,
				//비교 문자열과 중복값이 없으면 -1을 리턴한다. 즉 배열의 인덱스를 리턴한다. 
				System.out.println(arr[i]);
			}
		}	
	}
}
