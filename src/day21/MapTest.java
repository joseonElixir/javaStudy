package day21;

import java.util.*;

public class MapTest {
	
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String,String>(); //���׸����� Ű�� ����� ���� StringŸ������ ����.
		
		
		map.put("apple","���	"); // key �� value. key�� �ּҰ�, value�� �ǵ����Ͱ�.
		map.put("plate","����	"); // �ּҰ����� � ������Ÿ���̵� �� �� �� ����.
		map.put("one", "�ϳ�");
		map.put("two", "��");
		System.out.println("apple is ? : "+map.get("apple"));
		System.out.println("one is ? :"+map.get("one"));
		map.put("apple", "IPhone");
		System.out.println("apple is? :"+map.get("apple"));
		//������ Ű���� ���� ��� ���� �����͸� �����ϴ� �����̱� ������ add�� �ƴ� put�̴�.
	
	}
}
