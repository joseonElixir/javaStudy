package day21;

import java.util.*;
import java.util.Map.Entry;

class Room{
	
	HashMap<Integer, String> hm = new HashMap<Integer, String>();
	
	public Room() {
		for(int i=100; i<=300; i+=100) {
			for(int j=1;j<=3;j++) {
				hm.put(i+j, "���");
			}
		}
	}
	
	public void select() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==�� ����==");
		System.out.print("���ȣ �Է� : ");
		int num = sc.nextInt();
		if (hm.get(num)==null) {
			System.out.println("�������� �ʴ� ���Դϴ�.");
			return;
		}
		if(hm.get(num).equals("�����")) {
			System.out.println("�̹� "+num+"ȣ�� ����Ǿ��ֽ��ϴ�.");
			return;
		}
		System.out.println(num+"ȣ ����Ǿ����ϴ�.");
		hm.put(num, "�����");
		
	}
	
	public void remove() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==���� ���==");
		System.out.print("���ȣ �Է� : ");
		int num = sc.nextInt();
		if (hm.get(num)==null) {
			System.out.println("�������� �ʴ� ���Դϴ�.");
			return;
		}
		if(hm.get(num).equals("���")) {
			System.out.println(num+"ȣ�� �������Դϴ�.");
			return;
		}
		System.out.println(num+"ȣ ������ ��ҵǾ����ϴ�.");
		hm.put(num, "���");
		
	}
	
	
	
	public void getInfo() {
		Iterator<Integer> key = hm.keySet().iterator(); 
		//Iterator Interface Generic Integer key ���� = 
		//HashMap���� hm. key���� Set�� �����ϴ� keySet(). Set Interface iterator(); �޼ҵ�
		
		System.out.println("==���� ����==");
		for(int num : hm.keySet()) { //for���� Colon�� ���� object : List�� ����Ʈ�� ����ִ� ���� ������� �����.
			System.out.print(num);
		}
		while(key.hasNext()) {
			int k = key.next();
			System.out.println(k+":"+hm.get(k));
		
		}
		
	}
	
}


public class MapTest2 {
	
	public static void main(String[] args) {
		
		Room room = new Room();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("==================");
			System.out.println("���ڿ���");
			System.out.println("==================");
			System.out.println("1. �� �����ϱ�");
			System.out.println("2. �� ���� ����ϱ�");
			System.out.println("3. ���� ���º���");
			System.out.println("4. ���� ");
			System.out.println("==================");
			System.out.print("�޴�>");
			int num = sc.nextInt();
			
			switch(num) {
			
			case 1 : room.select();break;
			case 2 : room.remove();break;
			case 3 : room.getInfo();break;
			case 4 : System.out.println("�ý��� ����"); System.exit(0);
			
			}
		}	
	}

}
