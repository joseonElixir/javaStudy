package day14;

public class TvTest {

	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		
		t1.rgb =90;
		t1.mi = 40;
		t1.ri = 60;
		t1.getInfo();
		System.out.println();
		System.out.println("===============");
		
		Tv t2 = new Tv();
		t2.getInfo();
		

		System.out.println("===============");
		
		Tv t3 = new Tv(80); //인자를 확인해서 인자 생성자를 호출해서 객체를 만들어줌.
		t3.getInfo();

		System.out.println("===============");
		
		Tv t4 = new Tv(66,44);
		Tv t5 = new Tv(71,61,51);
		t4.getInfo();

		System.out.println("===============");
		t5.getInfo();

		System.out.println("===============");
		Tv t6 = new Tv(11.0);
		t6.getInfo();
		System.out.println();
		t6.getInfo("오버로딩된 Tv");
		
	}

}
