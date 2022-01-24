package day21;

import java.util.ArrayList;
import java.util.Vector;

public class VectorTest {
	
	public static void main(String[] args) {
		
		/*    컬렉션 				| 배열 
		 * 1. 객체만 저장가능 		| 기본 데이터와 객체 모두 저장가능
		 * 2. 가변길이 배열 		| 고정크기
		 * 3. 타종데이터도 삽입가능	| 동종의 데이터만 넣을 수 있음.
		 * 타종간의 데이터를 섞어서 넣는건 좋은 개발 방식은 아님.
		 * 그렇기 때문에 대체로 제네릭을 통해 입력받는 데이터를 제한함.
		 * */
		
		
		//벡터와 어레이리스트는 같다. 객체형태로 값을 저장하기 위해서임.
		
		Vector v = new Vector(3, 4); // 기본크기 3 부족하면 4씩 증가. 물론 이딴거 안씀.
		//벡터는 기본생성자로 쓰는게 기본임.
		System.out.println("v의 크기 :"+v.capacity()); // 카파시티 : 내 공간의 크기를 보여줌
		//카파시티 == 랭스, 하지만 실제 정보가 담겨있지 않기 때문에 capacity를 총 크기로 잡고 for문을 돌려서
		//출력을 하게 되면 ArrayIndexOutOfBoundEXception이 발생한다.
		System.out.println("v의 실제 데이터 개수 : "+ v.size());
		//size = 실 데이터가 들어가있는 공간의 갯수. 즉, 할당받은 공간 중 null이 아닌 것들의 합을 출력.
		
		for(int i=1;i<10;i++) {
			v.add(new Integer(i)); //인자값을 레퍼런스 타입으로 받는다.
					//래퍼클래스(integer)로 감싸서 데이터를 삽입. 
					//가로줄같은 경우는 그냥 신경 안써도 됨.(경고성 메시지)
		}			//가로줄이 생긴 이유는 autoBoxing(기본 데이터타입을 레퍼런스타입으로 자동으로 바꿔줌)
		System.out.println("v의 크기 :"+ v.capacity());
		System.out.println("v의 실제 데이터 갯수 :"+ v.size());
		
		v.add(new Double(1.23));
		v.add(2.34);
		v.add("hi mfker");
		
		System.out.println("v의 크기 :"+v.capacity()); //거의 쓸일없음
		System.out.println("v의 실제 데이터 개수 :"+v.size());
		try {
			//for(int i=0; i<v.capacity();i++) { 
			for(int i=0; i<v.size();i++) { 
				//범위를 capacity로 잡으면 ArrayIndexOutOfBoundsException이 발생한다. 
				System.out.println(v.get(i));			
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
		//System.out.println(v.get(5));
		//벡터로부터 데이터를 가져올때.
		int in =(int) v.get(5); //v.get(5)는 오브젝트 타입이라 다운캐스팅을 해야함. 
		//즉 object type <=> Primitive Data Type 으로 다운캐스팅. 
		//이때 원래라면 래퍼클래스 타입을 한번 거쳐야 하는데,
		//JVM에서 자동으로 unboxing을 해줌으로써 Integer Type에서 int type으로 넘어올 수 있는것.
		int in2 =(Integer) v.get(5); 
			//unBoxing : 레퍼클래스에 있는 데이터를 기본데이터로, 
			//Boxing : 기본 클레스에 있는 데이터를 레퍼클래스로
			//간단하게 말해 래퍼 클래스란 기본 타입의 객체화를 말한다.
			//object - Integer - int 단계에서 다운캐스팅과정에서 언박싱이 일어남.
			//그리고 이렇게 자동으로 언박싱 및 박싱이 일어나는 것을 오토박싱, 오토언박싱이라고 불림.
		
		//FM 으로 형변환을 하자면
		Integer in3= (Integer)v.get(5); // 다운캐스팅.(말그대로 형변환)
		int in4 =in3.intValue();	// 언박싱 (참조 타입에서 기본 데이터타입으로 변경하는 메소드)
		
		
		
		System.out.println(in);
		
		double dou = (Double)v.get(10);
		System.out.println("dou="+ dou);
		String str =(String)v.get(11);
		System.out.println("str="+str);
		
		//자료형이 다 다르니 가져올때마다 자료형에 맞는 형변환을 해야함.
		//가져올때마다 자료형을 확인해야만 하는 번거로운 상황이 연출됨.
		//그렇기 때문에 그냥 자료형을 통일함.
		//이것또한 다시 빼내올때 일일이 다운캐스팅을 하는 번거로운 상황 발생.
		//그걸위해 개발된게 제네릭
		
		Vector<String> v2 = new Vector<String>(); // 꺽쇄 가 제네릭. 이게 기본 문법
		//Vector<String> v2 = new Vector<>(); // 1.7버전부터 이렇게 작성해도 되게끔 만들어졌으나..
		//버전이 다른 상황에서 물먹을 수 있으니 그냥 기본문법 쓰자.
		v2.add("hi");
		v2.add("java");
		v2.add("jsp");
		v2.add("HTML");
		
		for(int i = 0;i<v2.size();i++) {
			String tmp = v2.get(i);
			System.out.println(tmp);
		}
		
		
		System.out.println("-----------------------------");
		
		ArrayList<Integer> arr = new ArrayList<Integer>(); //ArrayList 생성 및 제Generic 정의.
		arr.add(11);
		arr.add(22);
		arr.add(33);
		//vector와 똑같은 부모인 Collection을 상속받기 때문에 기본적인 메소드가 동일하다.
		//고로 거의 비슷한 느낌으로 쓸 수 있다. 물론 내부 설계는 크게 다를 수 있지만, 사용자의 입장에서는
		//큰 차이가 없다.
		for(int i=0;i<arr.size();i++) {
			int tmp = arr.get(i);
			System.out.println(tmp);
		}
		
		
		
	}

}
