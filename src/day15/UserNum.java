package day15;

public class UserNum { //���� Ŭ����

	int mul;
	
	


	public UserNum(int mul) {
		this.mul= mul; //this�� Ŭ������ ��ǥ�ϴ� ���� ȣ���ϴ� Ű����.
						//this�� �Ⱦ��� ���� ��ġ���� ���� ����� ������ ȣ���Ѵ�.
	}
	
	public void printMultiplyNumber(int num) {
		System.out.println(num*mul);
	}
	
	public void printMultiplyNumber(int[] num) {
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]*mul+" ");
			
		}
	}
	
}
