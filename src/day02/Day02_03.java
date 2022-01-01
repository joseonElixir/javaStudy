package day02;

public class Day02_03 {
	public static void main(String[] arge) {

		System.out.println("1.논리자료형");

		boolean bool1;
		bool1 = true;
		System.out.println("bool1 = " + bool1);

		boolean bool2 = false;
		System.out.println("bool2 = " + bool2);

		System.out.println("2. 정수 자료형");
		byte by;
		by = 10;
		System.out.println("by = " + by);

		// byte by2 = 127; // byte type은 -128~127
		/*
		 * Type mismatch: cannot convert from int to byte. int가 정수의 기본형이기 때문에 int 에서
		 * byte로 변환할 수 없다고 출력됨. 자료형의 간접 오버플로우 특정 자료형으로 변수가 선언된 이후에 해당 자료형 이상으로 숫자가 늘어나게
		 * 될 경우 에러코드가 뜨지 않는다.
		 */
		byte by3 = 127;
		by3++;
		System.out.println("by3=" + by3);
		by3++;
		System.out.println("by3=" + by3);
		// 위 경우 에러코드가 뜨지 않음.
		// 대신 원하는 결과값과는 다른 결과가 나온다..

		char ch = 'A' + 1;
		System.out.println("ch 1 = " + ch);
		// 아스키코드에 의해 연산이 가능함.
		// 0 = ascii 48
		// A = ascii 65
		// a == ascii 97
		// 외워두면 쓸데있을지도?
		System.out.println("ch 2 = " + (ch+1));
		//연산 과정에서 자료형을 선언하지 않았기 때문에 
		//기본 정수자료형(int)으로 출력됨.
		System.out.println("ch 3 = " + (char)(ch+1));
		// 자료형을 선언했기 때문에 char 자료형으로 출력됨.
		
		short sh = 1004;
		System.out.println("sh = " + sh);
		// 2byte 체계의 프로그램과
		// 정보를 교환하기 위해 만들어짐.
		// 굳이 쓸 필요없음.

		int in = 2147483647; // 정수의 기본 자료형.
		in++;
		System.out.println("in = " + in);

		byte num1 = 3;
		byte num2 = 4;
		int result = num1 + num2;
		// byte result2=num1+num2;
		// type mismatch: cannot convert from int to byte
		// 연산한 결과로 나온 값은 기본 자료형(int)로 저장
		// 그렇기에 에러가 나옴.
		System.out.println("result = " + result);

		byte result2 = (byte)(num1+num2);
		System.out.println("result2="+result2);
		//형변환(캐스팅)
		
		long lo; // 선언
		lo = 1234L; // 초기화
		System.out.println("lo = " + lo);
		// 초기화 시 기입된 값을 int 자료형으로 인식,
		// 초기화가 될때 int로 저장된 값을 long으로 변환.
		// Long type을 쓸때 값을 L을 써줘서
		// 컴파일할때 Long타입으로 인지시켜주기.

		System.out.println("3.실수 자료형");
		// float fl= 3.14;
		// 컴파일러가 값을 인식할때 기본 자료형인 double로 잡고,
		// 그때 에러가 발생함.
		float fl = 3.14F;
		// F를 붙여서 float로 인식하게 만들기.
		float f2 = (float)3.14;
		// 형변환하기.  
		System.out.println("fl = " + fl);
		System.out.println("f2 = " + f2);
		// (1)byte (2)char (2)short (4)int (8)long
		// (4)float (8)double
		
		double dou = 3.14;
		System.out.println("dou = " + dou);

	}

}
