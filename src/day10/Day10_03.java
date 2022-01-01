package day10;

public class Day10_03 {

	public static void main(String[] args) {
	
		double arr1[] = new double[7];
		//일반 변수 7개를 만들었다고 생각
		double arr2[] = new double[3];
		//일반 변수 3개를 만들었다고 생각
		double arr3[] = new double[5];
		//일반 변수 5개를 만들었다고 생각
		
		double arr4[][] =new double[3][];
		//배열 변수 3개를 만들었다고 생각.
	
		arr4[0]=arr1;
		arr4[1]=arr2;
		arr4[2]=arr3;
		
		
		for(int i=0;i<arr4.length;i++) {
			for(int j=0;j<arr4[i].length;j++) {
				System.out.print(arr4[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
