package day15;



class Kaka { //�θ� Ŭ����
	String kakaname;
	
	public void openKaka() {//��� �޼ҵ�
		
		System.out.println("�׳� �� �Խ��ϴ�.");
		
	}
	
}

class Banana extends Kaka{ //��� 
	public Banana() {
		kakaname = "�ٳ���ű";
	}
	public void openKaka()	{ // �������̵� 
		System.out.println(kakaname + "�� ������ �� �Խ��ϴ�.");
	}
	
}

class Prin extends Kaka{ //��� 
	public Prin() {
		kakaname = "�����۽�";
	}
	public void openKaka() { // �������̵� 
		System.out.println(kakaname+"�� �Ѳ��� ��� �Խ��ϴ�.");
	}

}

class Sea extends Kaka{ //��� 
	
	public Sea() {
		kakaname = "����";
	}
	public void openKaka() { //�������̵�
		System.out.println(kakaname+"�� ���ڸ� �� �Խ��ϴ�.");
	}
	
	
	
	
}



public class KakaTest {

	public static void main(String[] args) {
		
		Prin p = new Prin();
		p.openKaka();
		Banana b = new Banana();
		b.openKaka();
		Sea s = new Sea();
		s.openKaka();
		
		
		Kaka krr[]= new Kaka[3]; //��ü�迭. �θ�ü�� ����
		//��ü�迭�� ����Ǹ� �⺻���� null. 
		//�׷��� ������ ���� ���� �־������.
		krr[0]=new Banana(); //�θ�ü�� �迭���� ������ �ڽİ�ü�� �������.
		krr[1]= new Prin();
		krr[2]= new Sea();
		System.out.println("---------------------------------");
		for(int i =0; i<krr.length;i++) {
			//�ϳ��� ��ü�� �������� Ŭ������ �ٷ�� ���.
			//�������� ���� ����.
			
			krr[i].openKaka(); //�ڽİ�ü���� �������̵��� �޼ҵ带 ȣ����.
			//���࿡ �θ�ü�� �޼ҵ带 ȣ���ϰ� ������ super Ű���带 ���.
			
		}
		
		
		
	}
}
