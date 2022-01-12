package day15;

public class SsahwaMath extends YongMath {
	//사실상 상속받은게 getInfo 하나밖에 없다.(흙수저)
	//물론 getMaxNum 메소드 또한 상속받았지만.. (야지)

	public double maxPlus(double num1,double num2) {//계산식
		return  num1 > num2 ? num1: num2;
		
	}
	
	public int getMaxNum(int num1, int num2) { // 오버라이딩.
		return (int)this.maxPlus(num1, num2);
	}
	public double getMaxNum(double num1, double num2) { //메소드 오버로딩
		//같은 이름을 가진 메소드의 경우 입력받는 변수타입이 다르다고 해도 this로 호출하지 못한다.
		//그래서 maxPlus라는 이름의 메소드에서 계산을 한 뒤에 각각의 getMaxNum에 뿌려주는 방식으로
		//만들었다.
		return this.maxPlus(num1, num2);
	}

}
