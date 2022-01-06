package day14;

public class Tv {

	//속성 
	int rgb; //색상수치
	int mi; //명암수치
	int ri; //밝기 수치
	
	public Tv() { // 생성자 - 기본생성자
		rgb =50;
		mi = 50;
		ri = 50;
		
	}
	
	public Tv(int r) { //인자 생성자
	//생성자 오버로딩 - 이름은 같지만, 매개변수의 타입, 데이터 갯수, 순서가 다르게 만든다.
		//기본생성자에 rgb값만 변경해준다.
		//생성자는 초기화 시점에만 호출할 수 있다.
		this(); // 기본생성자를 호출한다.
		
		rgb=r;
	
		
	}
	public Tv(int a, int b, int c, int d, int e) {
		//매개변수를 멤버 변수의 갯수보다 많이 받을 수 있지만 활용도가 없다.
		
		
	}
	public Tv(double mi) { //명암만 따로 만드는 생성자를 int로 만들 수 없다.
			//그 이유는 매개변수의 데이터타입이 int 1개짜리인 인자 생성자가 있기 때문.
			//즉 인자 생성자는 매개변수의 데이터 타입, 갯수, 순서로 인지된다.
		rgb =99;
		this.mi=(int)mi;
		ri=99;
	}
	public Tv(int r, int mi) {
		//rgb = r;
		this(r); // 인자를 하나 가진 생성자를 호출한다. r= int
		this.mi=mi; //멤버변수 this.mi, 지역변수 mi.
		ri=50;
	}
	public Tv(int r , int mi , int ri) {
		this(r,mi); 
		rgb=r;
		this.mi=mi;
		this.ri=ri;
	}
	
	
	
	
	
	//기능
	public void getInfo() {
		System.out.println("color :"+rgb);
		System.out.println("bright:" +mi);
		System.out.println("Light :"+ri);
	
	}
	
	public void getInfo(String title) { //메소드 오버로딩.
		System.out.println(title);
		this.getInfo();
	
	}
	
	
}
