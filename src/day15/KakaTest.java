package day15;



class Kaka { //부모 클래스
	String kakaname;
	
	public void openKaka() {//멤버 메소드
		
		System.out.println("그냥 뜯어서 먹습니다.");
		
	}
	
}

class Banana extends Kaka{ //상속 
	public Banana() {
		kakaname = "바나나킥";
	}
	public void openKaka()	{ // 오버라이딩 
		System.out.println(kakaname + "의 봉지를 뜯어서 먹습니다.");
	}
	
}

class Prin extends Kaka{ //상속 
	public Prin() {
		kakaname = "프링글스";
	}
	public void openKaka() { // 오버라이딩 
		System.out.println(kakaname+"의 뚜껑을 열어서 먹습니다.");
	}

}

class Sea extends Kaka{ //상속 
	
	public Sea() {
		kakaname = "고래밥";
	}
	public void openKaka() { //오버라이딩
		System.out.println(kakaname+"의 상자를 뜯어서 먹습니다.");
	}
	
	
	
	
}



public class KakaTest {

	public static void main(String[] args) {
		
		Prin p = new Prin();
		p.openKaka();
		Banana b = new Banana();
		b.openKaka();
		Sea s = new Sea();
		s.openKaka();
		
		
		Kaka krr[]= new Kaka[3]; //객체배열. 부모객체를 선언
		//객체배열이 선언되면 기본값이 null. 
		//그렇기 때문에 실제 값을 넣어줘야함.
		krr[0]=new Banana(); //부모객체의 배열변수 공간에 자식객체를 집어넣음.
		krr[1]= new Prin();
		krr[2]= new Sea();
		System.out.println("---------------------------------");
		for(int i =0; i<krr.length;i++) {
			//하나의 객체에 여러개의 클래스를 다루는 기법.
			//다형성의 최종 목적.
			
			krr[i].openKaka(); //자식객체에서 오버라이딩된 메소드를 호출함.
			//만약에 부모객체의 메소드를 호출하고 싶으면 super 키워드를 사용.
			
		}
		
		
		
	}
}
