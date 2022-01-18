package day21;

import java.util.*;

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
		
		
		
	}
	
}
