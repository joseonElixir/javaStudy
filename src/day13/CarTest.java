package day13;

public class CarTest {
	
	
	public static void main(String[] args) {
		
		//��ü ���� �� ��ü Ȱ��
		Car car = new Car(); //�޼ҵ�(Ŭ����) ���� �� ����ȭ 
		
		car.userName = "ȫ�浿";//������� ȣ�� �� �ʱ�ȭ
		car.carName = "����";
		car.color = "red";
		car.tire = 4;
		
		car.getInfo();  //����޼ҵ� ȣ��
		car.driveCar();
		car.parkingCar();
		car.driveEnd();
		car.getInfo();
		System.out.println("---------------------------------");
		Car subC = new Car(); // �޼ҵ� ���� �� ����ȭ
		
		subC.userName = "ȫ�浿"; // ������� ȣ�� �� �ʱ�ȭ
		subC.color = "whtie";
		subC.carName = "�׽���";
		subC.tire = 4;
		
		subC.getInfo(); // ��� �޼ҵ� ȣ��
		subC.driveCar();
		subC.parkingCar();
		subC.driveEnd();
		subC.getInfo();
		
		System.out.println("=====================================");
		
		Car c3 = new Car();
		c3.getInfo();
		
		
		
		
	}
	
	
}
