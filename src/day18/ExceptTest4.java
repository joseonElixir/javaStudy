package day18;

public class ExceptTest4 {

	public static void main(String[] args) {
		
		try {
			
		System.out.println("ù��°: " +args[0]);
		System.out.println("�ι�°: " +args[1]);
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println(num1+"/"+num2+"="+(num1/num2));
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("����� ���� �Է��Ͻÿ�");
		}catch (NumberFormatException e1) {
			System.out.println("���ڸ� �Է��Ͻÿ�");
		}catch (ArithmeticException e2) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}catch(Exception e3) {
			System.out.println("�� ��?��");
		}
		
	}
	
}
