package day18;

public class ExceptTest4 {

	public static void main(String[] args) {
		
		try {
			
		System.out.println("첫번째: " +args[0]);
		System.out.println("두번째: " +args[1]);
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println(num1+"/"+num2+"="+(num1/num2));
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행시 값을 입력하시오");
		}catch (NumberFormatException e1) {
			System.out.println("숫자를 입력하시오");
		}catch (ArithmeticException e2) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(Exception e3) {
			System.out.println("아 몰?루");
		}
		
	}
	
}
