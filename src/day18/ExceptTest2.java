package day18;

public class ExceptTest2 {

	public static void main(String[] args) {
		System.out.println("시작");
		try {
			
			String fruit[] = {"사과", "배", "포도", "딸기"};
			
			for(int i =0; i<=fruit.length;i++) {
				System.out.println(fruit[i]);
			}
		}catch(Exception e) {
			e.printStackTrace();//예외사항 출력
			System.out.println(e);
			System.out.println("공간 초과");
		}
		
		
		System.out.println("끝");
		
	}
	
}
