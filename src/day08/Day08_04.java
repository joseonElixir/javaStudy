package day08;

public class Day08_04 {

	public static void main(String[] args) {

//		for(int j =1; j<=10;j++) {
//		
//			int sum=0;
//			for(int i = 1+(j*10)-10; i <= j*10; i++) {
//				if(sum==0){
//					System.out.print(i);
//				}
//				sum+=i;
//			}
//		System.out.println("~"+(j*10)+" :"+sum);
//		}
		for(int j=1; j<=100;j+=10) { 
			//�׷��� ��Ģ�� 1~10, 11~20  �� �׷�� 10�� Ŀ����.
			//��� ���� ���� 1�� �����ϰ�, +���� 10���� �Ѵ�.
			//�׷��� ������ 10�̶� �θ� for���� �������� j�� �������� 10
			
			int sum=0;
			for(int i=j; i<=j+9 ; i++) { 
			//�������� ��Ģ�� 1~10, 11~20  �� 1�� ����. 
			//�� �ʱⰪ�� �־����� 1�� ����. �ʱⰪ�� ���ǰ��� ���̰� 9.
			//��� ���� ���� j, ���ǰ��� j+9.
				sum+=i;
				//for������ ������ i ���� ����.
			}
			System.out.println(j+"~"+(j+9)+":"+sum); 
			//�ڽ� for���� �� ���� sum���� ���. 
			
		}
		
	}

}
