package day05;

import java.io.*;

public class Day05_08 {

	public static void main(String[] args) 
	throws IOException{
		
		System.out.print("�Է� : ");
		int a =System.in.read();
		String str = "";
		if (a=='b'||a=='B') { // 'b'�� �Է��ص� 98�� �ν��Ѵ�. 
			str = "Brother";	//�Է¹޴� '����'�� ascii �����ڵ�� �νĵȴ�.
		}else if (a==102||a==70) { //'f' = ascii 102 , 'F' = ascii 70
			str = "Fother";
		}else if (a==109||a==77) {
			str = "Mother";			
		}else if (a==115||a==83) {
			str = "Sister";
		}
		System.out.print("��� : "+str);

		//a : 97 ,  A : 65 32����.
		

	}

}
