package day02;

public class Day02_03 {
	public static void main(String[] arge) {

		System.out.println("1.���ڷ���");

		boolean bool1;
		bool1 = true;
		System.out.println("bool1 = " + bool1);

		boolean bool2 = false;
		System.out.println("bool2 = " + bool2);

		System.out.println("2. ���� �ڷ���");
		byte by;
		by = 10;
		System.out.println("by = " + by);

		// byte by2 = 127; // byte type�� -128~127
		/*
		 * Type mismatch: cannot convert from int to byte. int�� ������ �⺻���̱� ������ int ����
		 * byte�� ��ȯ�� �� ���ٰ� ��µ�. �ڷ����� ���� �����÷ο� Ư�� �ڷ������� ������ ����� ���Ŀ� �ش� �ڷ��� �̻����� ���ڰ� �þ��
		 * �� ��� �����ڵ尡 ���� �ʴ´�.
		 */
		byte by3 = 127;
		by3++;
		System.out.println("by3=" + by3);
		by3++;
		System.out.println("by3=" + by3);
		// �� ��� �����ڵ尡 ���� ����.
		// ��� ���ϴ� ��������� �ٸ� ����� ���´�..

		char ch = 'A' + 1;
		System.out.println("ch 1 = " + ch);
		// �ƽ�Ű�ڵ忡 ���� ������ ������.
		// 0 = ascii 48
		// A = ascii 65
		// a == ascii 97
		// �ܿ��θ� ������������?
		System.out.println("ch 2 = " + (ch+1));
		//���� �������� �ڷ����� �������� �ʾұ� ������ 
		//�⺻ �����ڷ���(int)���� ��µ�.
		System.out.println("ch 3 = " + (char)(ch+1));
		// �ڷ����� �����߱� ������ char �ڷ������� ��µ�.
		
		short sh = 1004;
		System.out.println("sh = " + sh);
		// 2byte ü���� ���α׷���
		// ������ ��ȯ�ϱ� ���� �������.
		// ���� �� �ʿ����.

		int in = 2147483647; // ������ �⺻ �ڷ���.
		in++;
		System.out.println("in = " + in);

		byte num1 = 3;
		byte num2 = 4;
		int result = num1 + num2;
		// byte result2=num1+num2;
		// type mismatch: cannot convert from int to byte
		// ������ ����� ���� ���� �⺻ �ڷ���(int)�� ����
		// �׷��⿡ ������ ����.
		System.out.println("result = " + result);

		byte result2 = (byte)(num1+num2);
		System.out.println("result2="+result2);
		//����ȯ(ĳ����)
		
		long lo; // ����
		lo = 1234L; // �ʱ�ȭ
		System.out.println("lo = " + lo);
		// �ʱ�ȭ �� ���Ե� ���� int �ڷ������� �ν�,
		// �ʱ�ȭ�� �ɶ� int�� ����� ���� long���� ��ȯ.
		// Long type�� ���� ���� L�� ���༭
		// �������Ҷ� LongŸ������ ���������ֱ�.

		System.out.println("3.�Ǽ� �ڷ���");
		// float fl= 3.14;
		// �����Ϸ��� ���� �ν��Ҷ� �⺻ �ڷ����� double�� ���,
		// �׶� ������ �߻���.
		float fl = 3.14F;
		// F�� �ٿ��� float�� �ν��ϰ� �����.
		float f2 = (float)3.14;
		// ����ȯ�ϱ�.  
		System.out.println("fl = " + fl);
		System.out.println("f2 = " + f2);
		// (1)byte (2)char (2)short (4)int (8)long
		// (4)float (8)double
		
		double dou = 3.14;
		System.out.println("dou = " + dou);

	}

}
