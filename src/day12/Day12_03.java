package day12;

public class Day12_03 {
	
	//call by reference
	//refTest에 복사된 데이터가 main의 주소값이기 때문에
	//main과 refTest의 arr가 서로 쌍둥이 변수가 됨.
	//기본자료타입 8가지를 제외한 모든 것들이 레퍼런스.
	//레퍼런스타입을 참조하면 call by reference
	//현장에서는 혼합형 메소드를 더 많이 씀. 
	//즉 레퍼런스 자료형과 기본자료형을 같이 요구하는 메소드
	// exTest(int num, int arr[]) 이런 식으로.
	public static void refTest(int arr[]) {
		arr[2]=1004;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

		System.out.println();
		refTest(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
