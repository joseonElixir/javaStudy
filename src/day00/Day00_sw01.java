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
			break;//원래는 생략해도 됨. 하지만 통일성을 위해 써주는 것을 권장.
		}
		System.out.println("ret : "+res);
		
		
	}
}
