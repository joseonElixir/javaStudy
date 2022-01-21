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
		
		//HashMap�� ������ ���� ���
		//1.
		for(String str : hm.keySet()) {
			System.out.println("Key��:"+str+" ������:"+hm.get(str));
		}
		
		System.out.println("==================================");
		
		//2.
		Iterator<String> itr = hm.keySet().iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println("Key��:"+str+" ������:"+hm.get(str));
		}
		
		System.out.println("=================================");
		
		//3
		System.out.println("Object �迭�� Key�� �����ϱ�.");
		Object [] ob =hm.keySet().toArray();
		
		for(int i=0;i<ob.length;i++) {
			System.out.println("Ű��:"+ob[i]+", ������:"+hm.get(ob[i]));
		}
		
		
		
	}
	
}
