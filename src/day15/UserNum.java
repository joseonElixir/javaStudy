package day15;

public class UserNum { //도구 클래스

	int mul;
	
	


	public UserNum(int mul) {
		this.mul= mul; //this는 클래스를 대표하는 값을 호출하는 키워드.
						//this를 안쓰면 지금 위치에서 가장 가까운 변수를 호출한다.
	}
	
	public void printMultiplyNumber(int num) {
		System.out.println(num*mul);
	}
	
	public void printMultiplyNumber(int[] num) {
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]*mul+" ");
			
		}
	}
	
}
