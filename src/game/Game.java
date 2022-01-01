package game;

import java.io.*;

public class Game {

	public static void main(String[] args) throws IOException {

		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 수행 목표 : 가위바위보 게임 만들기.
		while (true) { //while문을 통해서 반복 구간을 잡는다. 

			int user = 0;
			String s_user = "";
			String s_comp = "";
			System.out.println("======================");
			System.out.println("| 가위 바위 보 게임 v1.0 |");
			System.out.println("----------------------");
			System.out.println("1.가위 2. 바위 3.보 4.종료");
			System.out.println("======================");

			do {
				System.out.print("키워드 입력>");
				user = System.in.read() - '0';
				System.in.skip(100);
				if(!(1 <= user && user <= 4))
					System.out.println("재입력");
				// 복수의 키가 입력되면 유효성 검사가 여러 차례 돌아가는 문제가 발생한다.
				// 넉넉하게 100스킵.
				// user = Integer.parseInt(br.readLine());
				// 문자열은 ascii로 변환할 수 없기 때문에 에러가 뜬다.
			} while (!(1 <= user && user <= 4)); // 유효성 검사.
			// user의 입력값이 1~4를 넘어가면 넘어가지 않고 재요청.
			int comp = (int) (Math.random() * 3 + 1); // 난수 생성
			String res = ""; // 결과값을 담을 String변수 res

			switch (user) { //입력된 user의 값에 따라 판단하는 switch문
			case 1:
				//삼항연산자를 이용한 판단.
				s_user = "가위";//user가 1이 입력되면 s_user에 "가위"가 입력된다.
				res = comp == 1 ? "무승부! 다시!" : (comp == 2 ? "컴퓨터 승!" : "사용자 승!");
				break;

			case 2:
				s_user = "바위";
				if (comp == 1) {
					res = "사용자 승!";
				} else if (comp == 2) {
					res = "무승부! 다시!";
				} else {
					res = "컴퓨터 승!";
				}
				break;

			case 3:
				s_user = "보";
				res = comp == 1 ? "컴퓨터 승!" : (comp == 2 ? "사용자 승!" : "무승부! 다시!");
				break;

			case 4:
				System.out.println("사용자의 요청에 의해 시스템을 종료합니다.");
				System.exit(0);
			}

			switch (comp) {
			//comp에 입력되는 랜덤값에 따라 s_comp에 입력되는 변수.
			case 1:s_comp = "가위"; break;
			case 2:s_comp = "바위"; break;
			case 3:s_comp = "보"; break;
			}
			
			System.out.println("사용자 : " + s_user);
			System.out.println("컴퓨터 : " + s_comp);
			System.out.println(res);

		}

	}

}
