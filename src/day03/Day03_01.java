package day03;

public class Day03_01 {

	public static void main(String[] args) {

		System.out.println("�ڵ��ϼ�");
		System.out.println("1. ���Կ����ڿ� ���������");
		int i = 10;
		System.out.println("i=" + i);
		i = i + 1;
		System.out.println("i=" + i);
		i += 1;
		// �ڰ� ������ : �������� �������̿� ���� �������.
		// i+1�� ���� �����ϰ� i=�� ������.
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
		// i/=3;// ��
		i %= 3; // ������
		System.out.println("i=" + i);

		System.out.println("2. ���׿�����");
		System.out.println("2_1. ��Ʈ����������");
		//�̸��� ��Ʈ�� ���� 2������ ��ȯ�Ͽ� ����.
		
		int m = 42;
		
		/*
		 * ~[0][0][1][0][1][0][1][0] = [1][1][0][1][0][1][0][1]
		 * ��ȣȭ ��Ʈ (�� ���ڸ� ��Ʈ) = -128�̴�. 
		 * ������ڸ� -128 + 64 + 16 + 4 + 1 
		 * 		-128 +85 = 43
		 */
		System.out.println("~m=" + ~m);

		System.out.println("2_2. ������������");
		// boolean�� ���
		boolean bool = true;
		System.out.println("!bool=" + !bool);
		
		 /*System.out.println("!m="+!m); 
		 * The operator ! is undefined for the argument
		 * type(s) int
		 */
		System.out.println("");
		
		System.out.println("3.��Ʈ ����Ʈ ������");
		//��Ʈ�� ���� 2������ ��ȯ �� ����
		/* ���� : 	�� ������ �ڸ���
		 * 	1. <<
		 *		�������� ���ϴ� �ڸ�����ŭ �̵�, ������� 0���� ä��
		 *	2. >>
		 *		���������� ���ϴ� �ڸ�����ŭ �̵� ������� ��ȣȭ��Ʈ�� ä��
		 *		��ȣȭ��Ʈ�� 0�̸� 0����, 1�̸� 1��.
		 * 3. >>>
		 * 		���������� ���ϴ� �ڸ�����ŭ �̵� ������� 0���� ä��
		 *
		 */
	
		int n = -6;
		System.out.println("n="+n);
		System.out.println("n << 2 ="+(n<<2));
		//00000110  <<2  00011000 = 6  <<2  24
		System.out.println("n >> 2 ="+(n>>2));
		//��ȣȭ ��Ʈ�� ������ 1, ����� 0
		System.out.println("n >>> 2 ="+(n>>>2));
		//int�� 4byte�̱� ������
		//[1111 1111] [1111 1111] [1111 1111] [1111 1010]
		//���� ���ڸ��� 00���� �ٲ�� ������ 10���� ���� ����.
		//[0011 1111] [1111 1111] [1111 1111] [1111 1110]
		System.out.println("");
		
		System.out.println("4. ���迬����");
		System.out.println("3>5="+(3>5));
		System.out.println("3<5="+(3<5));
		System.out.println("3==5="+(3==5));
		System.out.println("3!=5="+(3!=5));
		
		System.out.println
		("���迬���ڷ� ��ȯ�Ǵ� ���� ������ boolean");
		
		
		System.out.println("5.��Ʈ������");
		/* 1. & (and ������)
		 *  �����Ǵ� ��Ʈ�� �� �� ��� 1�̸� 1�� ��ȯ
		 *  �� ���� ��쿡 0�� ��ȯ
		 * 2. ^ (exclusive or ������),(xor ������)
		 * �����Ǵ� ��Ʈ�� ���Ͽ� ������ 0�� ��ȯ, �ٸ��� 1�� ��ȯ
		 * 3. | (or ������)
		 *  �����Ǵ� ��Ʈ�� ���Ͽ� �ϳ��� 1�̸� 1��, 
		 *  �Ѵ� 0�̸� 0�� ��ȯ
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
		
		
		System.out.println("6.��������");
		//���� ���ؼ��� ����� �ȴ�.
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
