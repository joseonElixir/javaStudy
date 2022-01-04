package ex00;

import java.io.*;

public class ex00_arr {

	public static void main(String[] args) 
	throws IOException{
		
		int sum1[] = new int[10];
		int sum2[] = new int[10];
		int sum3[] = new int[10];
		int s1=0;
		int s2=0;
		int s3=0;
		
		
		for(int i=0; i<30;i++) {
			//총 30회의 랜덤값을 각각의 sum에 배수의 차이대로 뿌리기.
			//그 후 각 배열에 저장된 값과 각 배열의 합을 출력.
			for(int j=0;j<i;j++) {
				
				int num = (int)(Math.random()*30+1);
				if(num%3==0 && s3<sum3.length) {
					sum3[s3]=num;
					s3++;
				}else if (num%2==0 && s2<sum2.length) {
					sum2[s2]=num;
					s2++;
				}else if (s1<sum1.length) {
					sum1[s1]=num;
					s1++;
				}
			
			}//in for end
		}// out for end
		
		s3 =0;
		s2 =0;
		s1 =0;
		
		for(int i=0; i<sum1.length;i++) {
		System.out.println(sum3[i]+"\t"+sum2[i]+"\t"+sum1[i]);
			s3+=sum3[i];
			s2+=sum2[i];
			s1+=sum1[i];
		}
		System.out.println();
		System.out.println(s3+"\t"+s2+"\t"+s1);
		
		
		
		
	}

}
