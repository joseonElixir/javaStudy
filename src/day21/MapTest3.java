package day21;

import java.util.*;
import java.util.HashMap;
import java.util.Iterator;

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
		
		System.out.println("=================================");
		
		//3
		System.out.println("Object 배열로 Key값 추출하기.");
		Object [] ob =hm.keySet().toArray();
		
		for(int i=0;i<ob.length;i++) {
			System.out.println("키값:"+ob[i]+", 데이터:"+hm.get(ob[i]));
		}
		
		
		
	}
	
}
