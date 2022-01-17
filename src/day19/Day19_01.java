package day19;
import java.io.*;
class WordSearch{
	//문자열에서 특정 문자의 갯수를 찾는 프로그램.
	String user;
	String search;
	char temp;
	int count=0;
	int count2=0;
	int count3=0;
	public void search(BufferedReader br) 
	throws IOException{
		System.out.println("문장 입력 : ");
		user = br.readLine();
		System.out.println("찾을 문자 :");
		search = br.readLine();
		System.out.println("char타입 찾을 문자 2 :");
		temp = (char)br.read();
	}
	public void detect() {
		String[] sarr= user.split("");
		//String 배열에 user에 담긴 문자 단위("")로 쪼개서 저장하는 메소드.
		//조건이 " "면 문자열을 띄어쓰기가 등장할 때마다 쪼갠다. 
		//예를들어 "무궁화 꽃이 피었습니다." 라는 문장이 있고 조건이 " "일 경우
		//String 배열에 {"무궁화","꽃이","피었습니다."} 가 저장된다.
	
		for(int i=0;i<user.length();i++) {
			if(user.length()>=i+search.length()&&
				search.equals(user.substring(i,i+search.length()))) { 
				//String class의 substring : 범위를 지정하여 해당 범위의 문자열을 리턴한다.
				//문자를 쪼개서 찾을 문자와 일일이 대조하여 count++한다.
				count++;
			}
			if(sarr[i].equals(search)) {
				count2++;
			}
			if(user.charAt(i)==temp) { 
				//charAt은 문자열에서 괄호안의 번호째의 문자를 문자(char타입)으로 리턴하는 메소드.
				count3++;				
			}
		}
		System.out.println(search+"는 총 "+count+"개 입니다.");
		System.out.println("count2 : "+count2+", count3 : "+count3);
		
	}
}


public class Day19_01 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		WordSearch ws = new WordSearch();
		
		ws.search(br); // 문자 입력 및 찾을 문자 입력
		ws.detect(); //연산 후 출력
		
		
		
		
	}
	

}
