package day21;

import java.util.*;

public class MapTest3 {

	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<String, String>();
		for(int i =0; i<10; i++) {
			hm.put(""+(int)(Math.random()*90000+10000), ""+(int)(Math.random()*90000+10000));			
		}
		
		//HashMap의 데이터 추출 방법
		//1.
		for(String str : hm.keySet()) {
			System.out.println("Key값:"+str+" 데이터:"+hm.get(str));
		}
		
		System.out.println("==================================");
		
		//2.
		Iterator<String> itr = hm.keySet().iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println("Key값:"+str+" 데이터:"+hm.get(str));
		}
		
		
		
	}
	
}
