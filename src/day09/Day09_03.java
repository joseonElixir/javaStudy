package day09;

public class Day09_03 {

	public static void main(String[] args) {
		
		int x[] = {10,20,30,40,50};
		
		for(int i=0;i<x.length;i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
		System.out.println();
		int y[]=x;
		y[2]= 1004;
		for(int i=0;i<y.length;i++) {
			System.out.print(y[i]+" ");
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=0;i<x.length;i++) {
			System.out.print(x[i]+" ");
		}// y[2]의 값을 바꿨는데 x[2]의 값이 1004가 나오는 것을 확인할 수 있다.
		//그 이유는 y[]가 참조한 것이 x의 주소값(heap 영역)이기 때문.
		//즉, 이 경우 x와 y는 같은 레퍼런스 변수를 바라보는 쌍둥이 변수가 됨.
		
		
	}

}
