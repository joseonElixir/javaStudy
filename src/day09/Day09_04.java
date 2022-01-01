package day09;

public class Day09_04 {

	public static void main(String[] args) {
		
		//스왑(마치 저글링같은.)
		//콜라와 사이다를 서로 상대의 병에 담고싶을때
		//하나의 컵을 준비해서 콜라를 컵에 따라놓고,
		//빈 콜라병에 사이다를 넣고, 빈 사이다병에 컵에 들은 콜라를 넣는다.
		
		int arr1[]= {10,20,30,40,50};
		int arr2[]= {100,200,300};
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.println("---------------------");
		
		
		//arr1, arr2를 서로 스왑하고 싶다.
		
		int temp[]=arr1;
		arr1=arr2;
		arr2=temp;
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		
		
		
		
	}
	
	
}
