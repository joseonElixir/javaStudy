package day00;


public class Day00_cls01 {


	public static void main(String[] args) {
		
		Day00_cls01 d = new Day00_cls01();
		
		Car c1 = new Car();
		System.out.println("c1�� ���ο� ��ü�� �����ߴ�!");
		Car c2 = new Car();
		System.out.println("c2�� ���ο� ��ü�� �����ߴ�!");
		
		c1.setColor(1);
		String c1Br = c1.brand;
		c2.setColor(2);
		System.out.println(c1.getColor());
		System.out.println(c2.getColor());
		c1Br = "hyundai";
		System.out.println(c1Br);
		System.out.println(c1.brand);
	}
}
