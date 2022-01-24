package day21;

import java.util.ArrayList;
import java.util.Vector;

public class VectorTest {
	
	public static void main(String[] args) {
		
		/*    �÷��� 				| �迭 
		 * 1. ��ü�� ���尡�� 		| �⺻ �����Ϳ� ��ü ��� ���尡��
		 * 2. �������� �迭 		| ����ũ��
		 * 3. Ÿ�������͵� ���԰���	| ������ �����͸� ���� �� ����.
		 * Ÿ������ �����͸� ��� �ִ°� ���� ���� ����� �ƴ�.
		 * �׷��� ������ ��ü�� ���׸��� ���� �Է¹޴� �����͸� ������.
		 * */
		
		
		//���Ϳ� ��̸���Ʈ�� ����. ��ü���·� ���� �����ϱ� ���ؼ���.
		
		Vector v = new Vector(3, 4); // �⺻ũ�� 3 �����ϸ� 4�� ����. ���� �̵��� �Ⱦ�.
		//���ʹ� �⺻�����ڷ� ���°� �⺻��.
		System.out.println("v�� ũ�� :"+v.capacity()); // ī�Ľ�Ƽ : �� ������ ũ�⸦ ������
		//ī�Ľ�Ƽ == ����, ������ ���� ������ ������� �ʱ� ������ capacity�� �� ũ��� ��� for���� ������
		//����� �ϰ� �Ǹ� ArrayIndexOutOfBoundEXception�� �߻��Ѵ�.
		System.out.println("v�� ���� ������ ���� : "+ v.size());
		//size = �� �����Ͱ� ���ִ� ������ ����. ��, �Ҵ���� ���� �� null�� �ƴ� �͵��� ���� ���.
		
		for(int i=1;i<10;i++) {
			v.add(new Integer(i)); //���ڰ��� ���۷��� Ÿ������ �޴´�.
					//����Ŭ����(integer)�� ���μ� �����͸� ����. 
					//�����ٰ��� ���� �׳� �Ű� �Ƚᵵ ��.(��� �޽���)
		}			//�������� ���� ������ autoBoxing(�⺻ ������Ÿ���� ���۷���Ÿ������ �ڵ����� �ٲ���)
		System.out.println("v�� ũ�� :"+ v.capacity());
		System.out.println("v�� ���� ������ ���� :"+ v.size());
		
		v.add(new Double(1.23));
		v.add(2.34);
		v.add("hi mfker");
		
		System.out.println("v�� ũ�� :"+v.capacity()); //���� ���Ͼ���
		System.out.println("v�� ���� ������ ���� :"+v.size());
		try {
			//for(int i=0; i<v.capacity();i++) { 
			for(int i=0; i<v.size();i++) { 
				//������ capacity�� ������ ArrayIndexOutOfBoundsException�� �߻��Ѵ�. 
				System.out.println(v.get(i));			
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
		//System.out.println(v.get(5));
		//���ͷκ��� �����͸� �����ö�.
		int in =(int) v.get(5); //v.get(5)�� ������Ʈ Ÿ���̶� �ٿ�ĳ������ �ؾ���. 
		//�� object type <=> Primitive Data Type ���� �ٿ�ĳ����. 
		//�̶� ������� ����Ŭ���� Ÿ���� �ѹ� ���ľ� �ϴµ�,
		//JVM���� �ڵ����� unboxing�� �������ν� Integer Type���� int type���� �Ѿ�� �� �ִ°�.
		int in2 =(Integer) v.get(5); 
			//unBoxing : ����Ŭ������ �ִ� �����͸� �⺻�����ͷ�, 
			//Boxing : �⺻ Ŭ������ �ִ� �����͸� ����Ŭ������
			//�����ϰ� ���� ���� Ŭ������ �⺻ Ÿ���� ��üȭ�� ���Ѵ�.
			//object - Integer - int �ܰ迡�� �ٿ�ĳ���ð������� ��ڽ��� �Ͼ.
			//�׸��� �̷��� �ڵ����� ��ڽ� �� �ڽ��� �Ͼ�� ���� ����ڽ�, �����ڽ��̶�� �Ҹ�.
		
		//FM ���� ����ȯ�� ���ڸ�
		Integer in3= (Integer)v.get(5); // �ٿ�ĳ����.(���״�� ����ȯ)
		int in4 =in3.intValue();	// ��ڽ� (���� Ÿ�Կ��� �⺻ ������Ÿ������ �����ϴ� �޼ҵ�)
		
		
		
		System.out.println(in);
		
		double dou = (Double)v.get(10);
		System.out.println("dou="+ dou);
		String str =(String)v.get(11);
		System.out.println("str="+str);
		
		//�ڷ����� �� �ٸ��� �����ö����� �ڷ����� �´� ����ȯ�� �ؾ���.
		//�����ö����� �ڷ����� Ȯ���ؾ߸� �ϴ� ���ŷο� ��Ȳ�� �����.
		//�׷��� ������ �׳� �ڷ����� ������.
		//�̰Ͷ��� �ٽ� �����ö� ������ �ٿ�ĳ������ �ϴ� ���ŷο� ��Ȳ �߻�.
		//�װ����� ���ߵȰ� ���׸�
		
		Vector<String> v2 = new Vector<String>(); // ���� �� ���׸�. �̰� �⺻ ����
		//Vector<String> v2 = new Vector<>(); // 1.7�������� �̷��� �ۼ��ص� �ǰԲ� �����������..
		//������ �ٸ� ��Ȳ���� ������ �� ������ �׳� �⺻���� ����.
		v2.add("hi");
		v2.add("java");
		v2.add("jsp");
		v2.add("HTML");
		
		for(int i = 0;i<v2.size();i++) {
			String tmp = v2.get(i);
			System.out.println(tmp);
		}
		
		
		System.out.println("-----------------------------");
		
		ArrayList<Integer> arr = new ArrayList<Integer>(); //ArrayList ���� �� ��Generic ����.
		arr.add(11);
		arr.add(22);
		arr.add(33);
		//vector�� �Ȱ��� �θ��� Collection�� ��ӹޱ� ������ �⺻���� �޼ҵ尡 �����ϴ�.
		//��� ���� ����� �������� �� �� �ִ�. ���� ���� ����� ũ�� �ٸ� �� ������, ������� ���忡����
		//ū ���̰� ����.
		for(int i=0;i<arr.size();i++) {
			int tmp = arr.get(i);
			System.out.println(tmp);
		}
		
		
		
	}

}
