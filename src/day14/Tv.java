package day14;

public class Tv {

	//�Ӽ� 
	int rgb; //�����ġ
	int mi; //��ϼ�ġ
	int ri; //��� ��ġ
	
	public Tv() { // ������ - �⺻������
		rgb =50;
		mi = 50;
		ri = 50;
		
	}
	
	public Tv(int r) { //���� ������
	//������ �����ε� - �̸��� ������, �Ű������� Ÿ��, ������ ����, ������ �ٸ��� �����.
		//�⺻�����ڿ� rgb���� �������ش�.
		//�����ڴ� �ʱ�ȭ �������� ȣ���� �� �ִ�.
		this(); // �⺻�����ڸ� ȣ���Ѵ�.
		
		rgb=r;
	
		
	}
	public Tv(int a, int b, int c, int d, int e) {
		//�Ű������� ��� ������ �������� ���� ���� �� ������ Ȱ�뵵�� ����.
		
		
	}
	public Tv(double mi) { //��ϸ� ���� ����� �����ڸ� int�� ���� �� ����.
			//�� ������ �Ű������� ������Ÿ���� int 1��¥���� ���� �����ڰ� �ֱ� ����.
			//�� ���� �����ڴ� �Ű������� ������ Ÿ��, ����, ������ �����ȴ�.
		rgb =99;
		this.mi=(int)mi;
		ri=99;
	}
	public Tv(int r, int mi) {
		//rgb = r;
		this(r); // ���ڸ� �ϳ� ���� �����ڸ� ȣ���Ѵ�. r= int
		this.mi=mi; //������� this.mi, �������� mi.
		ri=50;
	}
	public Tv(int r , int mi , int ri) {
		this(r,mi); 
		rgb=r;
		this.mi=mi;
		this.ri=ri;
	}
	
	
	
	
	
	//���
	public void getInfo() {
		System.out.println("color :"+rgb);
		System.out.println("bright:" +mi);
		System.out.println("Light :"+ri);
	
	}
	
	public void getInfo(String title) { //�޼ҵ� �����ε�.
		System.out.println(title);
		this.getInfo();
	
	}
	
	
}
