package day10;

import java.io.*;

public class Day10_04 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));

		int stu[][] = new int[5][5];
		for (int i = 0; i < stu.length; i++) { // 그룹(행)에 대한 for
			int sum = 0;
			int avg = 0;
			for (int j = 0; j < stu[i].length; j++) { // 데이터(열)에 대한 for
				// 범위를 length -2로 잡을 수 있다.
				// 그 후 아래의 전체 if문을 지우고(어차피 length-2가 3이기 때문)
				// stu[i][3] = sum
				// stu[i][4] = avg 로 주면 된다.(j를 쓰는 대신 이렇게 고정값으로)

				if (j < 3) {
					System.out.println("학생 "+(i+1)+"의 "+(j+1)+"번째 점수를 입력하시오");
					System.out.print("> ");
					stu[i][j] = (int) (Math.random() * 60 + 40);
					// Integer.parseInt(br.readLine());
					System.out.println();
					sum += stu[i][j];
					//arr[i][3]+=arr[i][j]; //이렇게 누적할 수 있다.
					//그야말로 변수.
					avg = sum / 3;
				} else if (j == 3) {
					stu[i][j] = sum;
				} else if (j == 4) {
					stu[i][j] = avg;
				}
			}
			//arr[i][4]=arr[i][3]/3; 
			//이렇게 이전에 입력된 합을 나눠서 입력할 수 있다.
			System.out.println();

		} // for 1 2차원배열에 점수 입력, 합계와 평균 저장.
			// stu[n][3]==sum
			// stu[n][4]==avg

		for (int i = 0; i < stu.length; i++) {
			System.out.println("학생" + (i + 1));
			for (int j = 0; j < stu[i].length; j++) {
				if (0 <= j && j <= 2) {
					System.out.print("과목 " + (j + 1) + ": ");
				} else if (j == 3) {
					System.out.print("합계 : ");
				} else {
					System.out.print("평균 : ");
				}
				System.out.print(stu[i][j] + "  ");
			}

			System.out.println();
		} // for end. 출력
		System.out.println();

		for (int i = 0; i < stu.length - 1; i++) {//주 대상자
			for (int j = i + 1; j < stu.length; j++) {//비교 대상자
				if (stu[i][4] < stu[j][4]) {
					int temp[] = stu[i]; // int[] temp라고 써도됨.
					stu[i] = stu[j];
					stu[j] = temp;
				}
			}
		} // for end. avg 기준 내림차순 정렬.

		System.out.println("내림차순 정렬");

		for (int i = 0; i < stu.length; i++) {
			System.out.println("학생" + (i + 1));
			for (int j = 0; j < stu[i].length; j++) {
				if (0 <= j && j <= 2) {
					System.out.print("과목 " + (j + 1) + ": ");
				} else if (j == 3) {
					System.out.print("합계 : ");
				} else {
					System.out.print("평균 : ");
				}
				System.out.print(stu[i][j] + "  ");
			}

			System.out.println();
		}

	}

}
