	package day09;

public class Day09_01 {

	public static void main(String[] args) {
		int a=10;// 선언과 동시에 초기화.
		
		
		int arr[]; //배열의 변수 선언.	
		arr= new int[3]; //배열의 메모리 생성(갯수 잡아주기)
		arr[0] = 10; //배열의 초기화 (배열 안에 값 입력하기)
		arr[1] = 20;
		arr[2] = 30; // int[3]이라서 arr[0]~arr[2]까지 있음.
		
		System.out.println("arr[0] = "+arr[0]);
		//System.out.println("arr[3] = "+arr[3]); //없는 번호임.
		System.out.println("arr[2] = "+arr[2]);
		System.out.println("arr의 길이 : "+arr.length);
		
		
		double arr2[] = new double[5];
		//배열 선언 및 동적 메모리할당 double의 공간 5개.
		arr2[0]= 1.1;
		arr2[1]= 1.2;
		arr2[2]= 1.3;
		//값을 초기화.
		System.out.println("arr2[0] = "+arr2[0]);
		System.out.println("arr2[1] = "+arr2[1]);
		System.out.println("arr2[2] = "+arr2[2]);
		System.out.println("arr2[5] = "+arr2[4]);
		//배열이 객체 개념이다 보니 
		//배열로 만들어진 값은 기본적으로 초기화가 이루어짐.
		//해당 자료형의 기본값으로 초기화.
		//boolean의 기본값은 false.
		System.out.println("arr2[]의 길이 : "+arr2.length);
		
		
		// 1 + 2 + 3
		System.out.println();
		System.out.println();
		int arr3[]= {10,20,30,40,50};
		//선언 생성 초기화를 동시에 하는 방법. 추천하지 않음.
		//int arr3[0] = 1; //이게 안된다는 말씀.
		//그 이유는? 데이터는 유동성이라는 특징을 가짐. 근데 이 방법은 데이터가 고정됨. 
		//다만 "절대" 안바뀔 값을 박아넣거나 test용일 경우에 씀.
		// 배열을 이해하기 어렵다면 그냥 arr라는 변수가 숫자만 붙어서
		//arr1 , arr2 arr3 등등 변수가 여러개 선언된다고 생각하자.
		
		
		
		for(int i =0; i<arr3.length;i++) { 
			System.out.println("arr3["+i+"] = "+arr3[i]);
		}//arrayIndexOutOfBoundException의 발생을 막기 위해서 arr3.length를 범위로 한다.
		 //length는 5이기 때문에 0~4의 범위를 잡기위해 미만( < )으로 잡은것.
		
		
		
	}

}
