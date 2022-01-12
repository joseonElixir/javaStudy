package day15;

public class CarTest {

	public static void main(String[] args) {

		BaseCar car1 = new BaseCar();

		car1.carName = "연카";
		car1.maxSpeed = 160;
		car1.getInfo();
		System.out.println("---------------------------");

		Guardian car2 = new Guardian("가디언", 200, "황금 방패");

		car2.getInfo("자본주의의 노예");
		
		System.out.println("----------------------------");
		BlackShark car3 = new BlackShark("블랙샤크", 200, "물폭탄");
		car3.getInfo();
		
		
	}

}
