package day00;

public class Day00_sw01 {
	public static void main(String[] args) {

		int num = (int)(Math.random()*10+1);
		int res = 0;
		switch (num) {
		case 1:
		case 2:
		case 3:
			res=1;
			break;
		case 4:
		case 5:
		case 6:
			res=2;
			break;
		case 7:
		case 8:
		case 9:
			res=3;
			break;
		default:res = 0;
			break;//������ �����ص� ��. ������ ���ϼ��� ���� ���ִ� ���� ����.
		}
		System.out.println("ret : "+res);
		
		
	}
}
