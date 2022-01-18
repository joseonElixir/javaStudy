package day21;

import java.util.*;
import java.util.Map.Entry;

class Room{
	
	HashMap<Integer, String> hm = new HashMap<Integer, String>();
	
	public Room() {
		for(int i=100; i<=300; i+=100) {
			for(int j=1;j<=3;j++) {
				hm.put(i+j, "빈방");
			}
		}
	}
	
	public void select() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==방 예약==");
		System.out.print("방번호 입력 : ");
		int num = sc.nextInt();
		if (hm.get(num)==null) {
			System.out.println("존재하지 않는 방입니다.");
			return;
		}
		if(hm.get(num).equals("예약됨")) {
			System.out.println("이미 "+num+"호는 예약되어있습니다.");
			return;
		}
		System.out.println(num+"호 예약되었습니다.");
		hm.put(num, "예약됨");
		
	}
	
	public void remove() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==예약 취소==");
		System.out.print("방번호 입력 : ");
		int num = sc.nextInt();
		if (hm.get(num)==null) {
			System.out.println("존재하지 않는 방입니다.");
			return;
		}
		if(hm.get(num).equals("빈방")) {
			System.out.println(num+"호는 빈방상태입니다.");
			return;
		}
		System.out.println(num+"호 예약이 취소되었습니다.");
		hm.put(num, "빈방");
		
	}
	
	
	
	public void getInfo() {
		Iterator<Integer> key = hm.keySet().iterator(); 
		//Iterator Interface Generic Integer key 변수 = 
		//HashMap변수 hm. key값의 Set을 리턴하는 keySet(). Set Interface iterator(); 메소드
		
		System.out.println("==예약 상태==");
		for(int num : hm.keySet()) { //for문에 Colon을 쓰면 object : List로 리스트에 들어있는 값을 순서대로 출력함.
			System.out.print(num);
		}
		while(key.hasNext()) {
			int k = key.next();
			System.out.println(k+":"+hm.get(k));
		
		}
		
	}
	
}


public class MapTest2 {
	
	public static void main(String[] args) {
		
		Room room = new Room();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("==================");
			System.out.println("숙박예약");
			System.out.println("==================");
			System.out.println("1. 방 예약하기");
			System.out.println("2. 방 예약 취소하기");
			System.out.println("3. 예약 상태보기");
			System.out.println("4. 종료 ");
			System.out.println("==================");
			System.out.print("메뉴>");
			int num = sc.nextInt();
			
			switch(num) {
			
			case 1 : room.select();break;
			case 2 : room.remove();break;
			case 3 : room.getInfo();break;
			case 4 : System.out.println("시스템 종료"); System.exit(0);
			
			}
		}	
	}

}
