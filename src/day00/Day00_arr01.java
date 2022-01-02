package day00;

import java.io.*;

public class Day00_arr01 {

	public static void main(String[] args) throws IOException {
		// 내림 및 오른차순 정렬 방법
		// 이중 for문의 사용방식 두가지.
		//배열의 각 개체간의 비교, 그리고 값 및 배치 변경.

		int num[] = new int[20];
		int temp = 0;
		for (int i = 0; i < num.length; i++) {

			num[i] = (int) (Math.random() * 100);

		}//num[]에 값 입력
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}//num[]에 저장된 값들 전부 출력

		System.out.println();
		System.out.println("정렬");
		for (int i = 0; i < num.length; i++) {// 주 대상자

			for (int j = i+1; j < num.length; j++) {// 비교 대상자. 비교대상자는 주 대상자를 기준으로
				//다른 값들을 비교하는 장치.
				//첫번째 경우. 비교 대상자는 항상 주 대상자보다 1 큰상태에서 시작.
				//비교 대상자가 배열의 끝까지 간 후 주 대상자 +1 
			//for(int j = 0; j<i;j++){
				//두번째 경우. 비교 대상자는 항상 0에서 시작 후 주 대상자보다 1작은 상태에서 종료. 
				//이후 주 대상자 +1
				if ( num[i] > num[j]) {
					
					// 주 대상자는 비교대상자보다 항상 작아야함.
					// -> 상황에 따라 다름.
					// 두가지 경우가 있는데
					// 첫번째 경우의 조건은 주 대상자가 0부터 시작하며 
					//비교 대상자는 주 대상자 +1부터 시작해서
					//배열의 끝까지 비교 후 주 대상자의 값이 +1 되는 경우.
					//두번째 경우의 조건은 
					//주 대상자가 1부터 시작하고 비교 대상자가 0부터 시작하여
					//주 대상자 -1까지 비교 후 주 대상자에 +1되는 경우.
					//첫번째 경우는 단순히 올림차순 및 내림차순 정렬에 유리하고,
					//두번째 경우는 올림차순 및 내림차순도 할 수 있는 동시에 
					//중복 비교도 할 수 있다. 연산 횟수는 똑같다.
					
					
					// num i < num j : 내림차순 9 8 7 6 5
					// num i > num j :오름차순 1 2 3 4
					temp = num[j];
					num[j] = num[i];
					num[i] = temp;
					// 0번보다 1번이 클 경우
					// 큰 값을 0번에 = 내림차순.
				}
			}
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}

}
