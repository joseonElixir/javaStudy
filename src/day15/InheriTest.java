package day15;

class Super{
	
	int a=10;
	double b=20.2; //테스트라서 변수선언과 동시에 초기화.
				//원칙은 생성자를 통해서 초기화.
				//이렇게 하는건 스테틱변수만 할 수 있다.
	
	public void test() {
		System.out.println("test()메소드 수행됨.");
	
	}
}

class Sub extends Super{
	int a=100;
	int c=30;
	
	public void test2() {
		System.out.println("test2()메소드 수행됨.");
	}

	public void test()	{//오버라이딩 
		System.out.println("test()메소드 재정의.");
		System.out.println("c="+c);
	}


}


//


public class InheriTest {

	public static void main(String[] args) {
	
		
		Sub sb = new Sub();
		sb.test2();
		sb.test();
		
		System.out.println("sb.c : "+ sb.c);
		System.out.println("sb.b : "+sb.b);
		System.out.println("sb.a : "+sb.a); // Sub의 a가 호출됨.
		
		//부모의 이름으로 자식을 관리.
		Super sp = new Sub(); 
		//중첩 변수는 부모의 것, 중첩 메소드는 오버로드된 것.
		
		System.out.println("sp.a :" +sp.a); //Super의 a가 호출됨.
		System.out.println("sp.b :" +sp.b);
		//System.out.println("sp.c : "+sp.c);
		//자식객제와 부모객체의 이름이 중첩되는 영역까지만 제어 가능.
		sp.test();
		Sub sb2 = (Sub)sp; //캐스팅; 
		//
		System.out.println("sb2.c : "+sb2.c);
		sb2.test(); 
		sp.test(); 
		
		System.out.println(sp);
		System.out.println(sb2);
		
		
		
		
		
		
//		Super sp= new Super();
//		System.out.println("a :"+sp.a);
//		System.out.println("b :"+sp.b);
//		sp.test();
//		Super arr[] = new Super[3];
//		//arr[1].test(); //NullPointerEXception.
//		
//		arr[0] = new Super();
//		arr[1] = new Super();
//		arr[2] = new Super();
//		arr[1].test();
//		
//		Sub arr2[] = new Sub[30]; //객체배열은 데이터가 없는(null) 공간을 만드는 개념.
//		
//		for(int i=0; i<arr2.length;i++) {
//			arr2[i]= new Sub();
//		}//배열은 배열이군.. 스택에 주소값을 저장하고, 힙값에 데이터를 넣어준다.
//		// 대신 레퍼런스타입의 조기값은 null이기 때문에 초기화를 해줘야함.
//		
//		
//		arr2[20].test2();;
//		
		
	}
	
}
