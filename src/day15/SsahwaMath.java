package day15;

public class SsahwaMath extends YongMath {
	//��ǻ� ��ӹ����� getInfo �ϳ��ۿ� ����.(�����)
	//���� getMaxNum �޼ҵ� ���� ��ӹ޾�����.. (����)

	public double maxPlus(double num1,double num2) {//����
		return  num1 > num2 ? num1: num2;
		
	}
	
	public int getMaxNum(int num1, int num2) { // �������̵�.
		return (int)this.maxPlus(num1, num2);
	}
	public double getMaxNum(double num1, double num2) { //�޼ҵ� �����ε�
		//���� �̸��� ���� �޼ҵ��� ��� �Է¹޴� ����Ÿ���� �ٸ��ٰ� �ص� this�� ȣ������ ���Ѵ�.
		//�׷��� maxPlus��� �̸��� �޼ҵ忡�� ����� �� �ڿ� ������ getMaxNum�� �ѷ��ִ� �������
		//�������.
		return this.maxPlus(num1, num2);
	}

}
