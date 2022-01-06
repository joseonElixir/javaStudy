package day14;

public class UserNumber {
	
	
	int mul;
	
	public UserNumber(int mul) {
		this.mul=mul;
	}
	
	public void printMultiplyNumber(int num) {
		
		System.out.println(num*mul);
	}
	public void printMultiplyNumber(int[]num) {
		
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]*mul+" "); 
		}
		
	}
	
	
	

}
