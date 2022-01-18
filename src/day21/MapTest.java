package day21;

import java.util.*;

public class MapTest {
	
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String,String>(); //제네릭에서 키와 밸류를 각각 String타입으로 설정.
		
		
		map.put("apple","사과	"); // key 와 value. key는 주소값, value는 실데이터값.
		map.put("plate","접시	"); // 주소값으로 어떤 데이터타입이든 다 쓸 수 있음.
		map.put("one", "하나");
		map.put("two", "둘");
		System.out.println("apple is ? : "+map.get("apple"));
		System.out.println("one is ? :"+map.get("one"));
		map.put("apple", "IPhone");
		System.out.println("apple is? :"+map.get("apple"));
		//동일한 키값이 있을 경우 기존 데이터를 갱신하는 개념이기 때문에 add가 아닌 put이다.
	
	}
}
