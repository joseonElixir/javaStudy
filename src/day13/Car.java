package day13;

public class Car {
	
	//������� ����
	String color;
	String carName;
	String userName;
	int tire;
	
	public Car() { // ������ ����. �ʱⰪ�� �ش�.
		
		carName = "�ƹݶ�";
		color ="white";
	}
	//�������� ����(��������� ������ ����޼ҵ��� ���� �ٷ� �� ����.
	
	
	//�޼ҵ� ���� ����
	public void driveCar() {
		//static�� �Ⱦ��� ���� : Car Ŭ������ ���ӵǴ� �޼ҵ� ��, Car Ŭ������ ������� �ʴ� �̻�
		//�޸𸮿� �ö��� ����.
		System.out.println(userName+"�� "+carName+"(����:"+color+")��(��) ������ �����մϴ�.");
		int exi= (int)(Math.random()*11+1);
		if(exi%2==0&&!carName.equals("�׽���")) {
			System.out.println("��� �߻�. Ÿ�̾� ����.");
			tire--;
		}else {
			System.out.println("�����ϰ� ������ �Ϸ��߽��ϴ�.");
		}
		System.out.println();
		
	}
	
	public void parkingCar() {
		System.out.println("�������� �����մϴ�.");
		System.out.println();
	}
	
	public void driveEnd() {
		System.out.println("������ �����մϴ�.");
		System.out.println();
	}
	//������ �Ҷ� ���Ǽ��� �����ް� ���� ��
	//���� ������ �ִ� ���� �߸��Ǿ��� �� 
	//����� ������ ���� ���ϰ� Ȯ���ϱ� ���ؼ�
	//getInfo�� ����� ������ ������.
	public void getInfo() {
		System.out.println("INFORMATION");
		System.out.println("�𵨸� : "+carName);
		System.out.println("���� : "+color);
		System.out.println("���ָ� : "+userName);
		System.out.println("Ÿ�̾� ���� : "+tire);
		System.out.println();
	}
	
	
}
