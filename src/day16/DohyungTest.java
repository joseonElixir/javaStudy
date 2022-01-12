package day16;

//pm

abstract class Dohyung{
	//�ҿ����� �޼ҵ带 ����ִ� �ҿ��� Ŭ����. 
	//�� ���¿����� �����ڷ� ����� �� ����.
	
	String name;
	
	public void getInfo() {
		
		System.out.println("���� ���� ���ϱ� ���α׷� v1.0");
	}
	
	abstract public void area(int i, int j); 
	//�ҿ��� �޼ҵ�.
	
}


class Rect extends Dohyung{
	
	public Rect() {
		name ="�簢��";
	}
	
	@Override
	public void area(int x, int y) {//�������̵�. (������ �Ȱ���)
		int result = x*y;
		System.out.println(name+"�� ���� : "+ result);
		
	}
	
}


class Triangle extends Dohyung{
	
	public Triangle() {
		name = "�ﰢ��";
	}
	
	public void area(int x, int y) {
		int result = x*y/2;
		System.out.println(name+"�� ���� :"+result);
	}
	
}


abstract class Circle extends Dohyung{
	//���ο� �߻� �żҵ��� �߰�
	abstract public void area(int i);
	
}


class Circle2 extends Circle{

	public Circle2() {
		name = "��";
	}
	
	@Override
	public void area(int i) {
		double result = i*i*Math.PI;
		System.out.println(name+"�� ���� : "+ result);
		
	}

	@Override
	public void area(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	
}




public class DohyungTest {
	
	public void goArea(int i, int j) {
		System.out.println("���� :"+i+"���� :"+j+"�� ������ ����");
		
		Rect r = new Rect();
		r.area(i, j);
		
		Triangle t =new Triangle();
		t.area(i, j);
		
		Circle2 c = new Circle2();
		c.area(i);
		
		//Dohyung d = new Dohyung();
		//�߻�Ŭ������ ��ü ������ �Ұ����ϴ�.
		//�θ�μ��� ������ �����ϴ�.
		
		Dohyung d2 = new Rect();
		d2.area(i, j);
		Dohyung d3 = new Triangle();
		d3.area(i, j);
		
		d3.getInfo();
		Dohyung d4 = new Circle2();
		d4.area(5, 5); // ����.
		System.out.println();
		Circle d5 = (Circle)d4; // �ٿ�ĳ����
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




