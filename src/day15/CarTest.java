package day15;

public class CarTest {

	public static void main(String[] args) {

		BaseCar car1 = new BaseCar();

		car1.carName = "��ī";
		car1.maxSpeed = 160;
		car1.getInfo();
		System.out.println("---------------------------");

		Guardian car2 = new Guardian("�����", 200, "Ȳ�� ����");

		car2.getInfo("�ں������� �뿹");
		
		System.out.println("----------------------------");
		BlackShark car3 = new BlackShark("����ũ", 200, "����ź");
		car3.getInfo();
		
		
	}

}
