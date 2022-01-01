package day03;

public class Day03_01 {

	public static void main(String[] args) {

		System.out.println("자동완성");
		System.out.println("1. 대입연산자와 산술연산자");
		int i = 10;
		System.out.println("i=" + i);
		i = i + 1;
		System.out.println("i=" + i);
		i += 1;
		// 자가 연산자 : 연산자의 순서차이에 의해 만들어짐.
		// i+1의 값을 저장하고 i=에 대입함.
		System.out.println("i=" + i);
		i++;
		System.out.println("i=" + i);
		i = i - 1;
		System.out.println("i=" + i);
		i -= 1;
		System.out.println("i=" + i);
		i--;
		System.out.println("i=" + i);
		i *= 2;
		System.out.println("i=" + i);
		// i/=3;// 몫
		i %= 3; // 나머지
		System.out.println("i=" + i);

		System.out.println("2. 단항연산자");
		System.out.println("2_1. 비트부정연산자");
		//이름에 비트가 들어가면 2진수로 변환하여 계산됨.
		
		int m = 42;
		
		/*
		 * ~[0][0][1][0][1][0][1][0] = [1][1][0][1][0][1][0][1]
		 * 부호화 비트 (맨 앞자리 비트) = -128이다. 
		 * 계산하자면 -128 + 64 + 16 + 4 + 1 
		 * 		-128 +85 = 43
		 */
		System.out.println("~m=" + ~m);

		System.out.println("2_2. 논리부정연산자");
		// boolean에 사용
		boolean bool = true;
		System.out.println("!bool=" + !bool);
		
		 /*System.out.println("!m="+!m); 
		 * The operator ! is undefined for the argument
		 * type(s) int
		 */
		System.out.println("");
		
		System.out.println("3.비트 시프트 연산자");
		//비트가 들어가면 2진수로 변환 후 연산
		/* 형식 : 	항 연산자 자리수
		 * 	1. <<
		 *		왼쪽으로 원하는 자릿수만큼 이동, 빈공간은 0으로 채움
		 *	2. >>
		 *		오른쪽으로 원하는 자릿수만큼 이동 빈공간은 부호화비트로 채움
		 *		부호화비트가 0이면 0으로, 1이면 1로.
		 * 3. >>>
		 * 		오른쪽으로 원하는 자릿수만큼 이동 빈공간은 0으로 채움
		 *
		 */
	
		int n = -6;
		System.out.println("n="+n);
		System.out.println("n << 2 ="+(n<<2));
		//00000110  <<2  00011000 = 6  <<2  24
		System.out.println("n >> 2 ="+(n>>2));
		//부호화 비트가 음수면 1, 양수면 0
		System.out.println("n >>> 2 ="+(n>>>2));
		//int는 4byte이기 때문에
		//[1111 1111] [1111 1111] [1111 1111] [1111 1010]
		//에서 앞자리가 00으로 바뀌기 때문에 10억의 값이 나옴.
		//[0011 1111] [1111 1111] [1111 1111] [1111 1110]
		System.out.println("");
		
		System.out.println("4. 관계연산자");
		System.out.println("3>5="+(3>5));
		System.out.println("3<5="+(3<5));
		System.out.println("3==5="+(3==5));
		System.out.println("3!=5="+(3!=5));
		
		System.out.println
		("관계연산자로 반환되는 값은 무조건 boolean");
		
		
		System.out.println("5.비트연산자");
		/* 1. & (and 연산자)
		 *  대조되는 비트를 비교 후 모두 1이면 1을 반환
		 *  그 외의 경우에 0을 반환
		 * 2. ^ (exclusive or 연산자),(xor 연산자)
		 * 대조되는 비트를 비교하여 같으면 0을 반환, 다르면 1을 반환
		 * 3. | (or 연산자)
		 *  대조되는 비트를 비교하여 하나라도 1이면 1을, 
		 *  둘다 0이면 0을 반환
		 */
		int a = 6;
		int b = 14;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("a&b ="+(a&b));
		System.out.println("a|b ="+(a|b));
		System.out.println("a^b ="+(a^b));
		/*
		 * a = 0000 0110
		 * b = 0000 1110
		 * 
		 * |   0000 1110 = 14
		 * &   0000 0110 = 6
		 * ^   0000 1000 = 8
		 */
		
		
		System.out.println("6.논리연산자");
		//논리에 대해서만 사용이 된다.
		System.out.println("true && true  ="+(true&&true));
		System.out.println("true && false ="+(true&&false));
		System.out.println("false&& true  ="+(false&&true));
		System.out.println("false&& false ="+(false&&false));
		System.out.println("true || true  ="+(true||true));
		System.out.println("true || false ="+(true||false));
		System.out.println("false|| true  ="+(false||true));
		System.out.println("false|| false ="+(false||false));

		
	}

}
