package day16;

//pm

abstract class Dohyung{
	//불완전한 메소드를 담고있는 불완전 클래스. 
	//이 상태에서는 생성자로 선언될 수 없다.
	
	String name;
	
	public void getInfo() {
		
		System.out.println("도형 넓이 구하기 프로그램 v1.0");
	}
	
	abstract public void area(int i, int j); 
	//불완전 메소드.
	
}


class Rect extends Dohyung{
	
	public Rect() {
		name ="사각형";
	}
	
	@Override
	public void area(int x, int y) {//오버라이드. (완전히 똑같이)
		int result = x*y;
		System.out.println(name+"의 넓이 : "+ result);
		
	}
	
}


class Triangle extends Dohyung{
	
	public Triangle() {
		name = "삼각형";
	}
	
	public void area(int x, int y) {
		int result = x*y/2;
		System.out.println(name+"의 넓이 :"+result);
	}
	
}


abstract class Circle extends Dohyung{
	//새로운 추상 매소드의 추가
	abstract public void area(int i);
	
}


class Circle2 extends Circle{

	public Circle2() {
		name = "원";
	}
	
	@Override
	public void area(int i) {
		double result = i*i*Math.PI;
		System.out.println(name+"의 넓이 : "+ result);
		
	}

	@Override
	public void area(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	
}




public class DohyungTest {
	
	public void goArea(int i, int j) {
		System.out.println("가로 :"+i+"세로 :"+j+"인 도형의 넓이");
		
		Rect r = new Rect();
		r.area(i, j);
		
		Triangle t =new Triangle();
		t.area(i, j);
		
		Circle2 c = new Circle2();
		c.area(i);
		
		//Dohyung d = new Dohyung();
		//추상클래스의 객체 생성은 불가능하다.
		//부모로서의 선언은 가능하다.
		
		Dohyung d2 = new Rect();
		d2.area(i, j);
		Dohyung d3 = new Triangle();
		d3.area(i, j);
		
		d3.getInfo();
		Dohyung d4 = new Circle2();
		d4.area(5, 5); // 공백.
		System.out.println();
		Circle d5 = (Circle)d4; // 다운캐스팅
		d5.area(i);
		
		Dohyung dr[] = new Dohyung[3];
		System.out.println("====================");
		
		dr[0]= new Rect();
		dr[1] = new Triangle();
		dr[2] = new Circle2();
		
		for(int z =0; z<dr.length;z++) {
			if(dr[z] instanceof Circle2) {
				Circle2 tmp = (Circle2)dr[z];
				tmp.area(z);
			}else {
				dr[z].area(3, 3);
			}
		}	
	}
	
	
	public static void main(String[] args) {
		
		DohyungTest dt = new DohyungTest();
		dt.goArea(10, 20);
		
		
		
	}

}




