package day13;

public class MakaTest {

	public static void main(String[] args) {
		System.out.println("���α׷��� ����.");
		
		Maka m1 = new Maka(); // Maka = m1�� ����� ���� ���赵.
		
		m1.color = "blue"; // ������� ȣ�� �� ����. ���ٿ������� dot(.)�� ���.
		
		m1.makaWrite(); // ��� �޼ҵ� ȣ��.
		
		Maka m2 = new Maka();//	
		m2.color = "red";
		m2.makaWrite(); 
		m1.makaWrite();  //m1�� m2�� �ٸ����̴�.
		//�̰��� ��ü ����.
		
		Maka m3 = new Maka();
		m3.color = "yellow";
		m3.makaWrite();
		
		Maka m4 = new Maka(); //new �ڿ� �ִ� Maka()�� �����ڴ�. 
		//���࿡ �����ڸ� ������ ������ JVM�� �ֺ� �����ڸ� �ڵ����� �������.
		//"new �ڿ� ������ ���� �����ڴ�." 
		m4.makaWrite();
		
		
		System.out.println("���α׷��� ��.");
	}

}
