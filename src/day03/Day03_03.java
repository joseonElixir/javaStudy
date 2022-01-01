package day03;

public class Day03_03 {
	public static void main(String[] args) {

		byte num = 1;

		for (int i = 0; i < 300; i++) {

			System.out.println("num = " + num);
			num++;
		}

		int i = 1;
		int j = i++;// j예 기존의 i값인 1이 대입된 뒤에 i에 ++작업이 진행.(후위증감연산자)
					
		//이 타이밍에서 i= 2 j=2
		i = ((i > ++j) // i= 1, j=3 이유? 전위증감연산자이기 때문에 선증감 후연산.
				&&		// i > ++ j 의 논리식으로 리턴되는 값은 false이기 때문에
						//논리연산자 && 은 뒤의 코드를 수행하지 않음.
				(i++ == j)) ?  // 수행되지 않는 코드.
						i += j : i; //조건식이 false이기 때문에 이 또한 수행되지 않는다.
					//다만 (i++ == j)가 수행되지 않는 이유와 다르다는 것을 인지.
		
		System.out.println("i=" + i);
		System.out.println("j=" + j);
		
		
	}
}