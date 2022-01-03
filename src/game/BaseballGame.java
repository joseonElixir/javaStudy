package game;

import java.io.*;
//과제
public class BaseballGame {

	public static void main(String[] args) throws IOException {

		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));

		System.out.println("============");
		System.out.println("숫자 야구 게임");
		System.out.println("Ver1.0");
		System.out.println("============");

		int com[] = new int[3];
		int user[] = new int[3];
		
		for (int i = 0; i < com.length; i++) {
			com[i] = (int) (Math.random() * 10);
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {
					i--;
				}

			} // in for end.
		} // out for end.
		for (int i = 0; i < com.length; i++) {
			System.out.print(com[i]+",");
		}//com에 저장된 값 노출
		
		System.out.println();
		System.out.println("임의의 숫자 3개와 그 순서를 맞추시오");
		System.out.println();

		for (int k = 0; k < 10; k++) {
			
			// 숫자3개를 입력받은 후 맞추지 못할 경우
			// 다시 숫자 3개를 입력받는다.
			for (int l = 0; l < user.length; l++) {
				System.out.print((l + 1) + "번째 숫자를 입력하시오:");
				user[l] = Integer.parseInt(br.readLine());
				for(int i=0;i<l;i++) {
					if(user[l]==user[i]) {
						System.out.println("중복된 값입니다. 다시 입력하세요.");
						l--;
					}
				}
			} // 입력받는 순번.
			System.out.println();
			System.out.println((k + 1) + "번째");

			int strike = 0;
			int ball = 0;
			for (int i = 0; i < com.length; i++) {
			// 비교 로직의 첫번째 for문.
			// 같은 위치의 번호를 각 1번씩만 비교해야 하기 때문에
			// 주 대상자 for문에 배치.
			// 만약 비교 대상자 위치에 배치하면 값을 i로 두던 j로 두던 3번씩 돌아감.				
			// 만약 j,i로 두면 두 항목의 위치값이 서로 달라지는 경우가
			// 발생하기 때문에 이건 ball의 조건에 해당한다.
				if (com[i] == user[i]) {
					strike++;
				} else {
				// strike가 아닐 경우에 나머지 ball을 찾는다.
				//i에서 strike를 발생시키면 그 값이 ball인지 out인지
				//비교할 필요가 없기 때문에 주 대상을 +1.
				//주 대상자가 +1된 상태에서 strike가 발생하지 않을 경우
				//비교대상자를 돌려가며 ball의 조건에 해당하는 값을 찾는다.
				//다만 앞에서 strike가 아니라는 조건이 선행되었기 때문에
				//조건식에서는 그 부분을 생략.
				//또한, com의 값이 중복이 없기 때문에
				//그에 대한 조건식도 생략.
					
					for (int j = 0; j < user.length; j++) {
						if (com[i] == user[j]) {
						//
							ball++;
						}
					}
				}
			}

			if (strike == 0 && ball == 0) {
				//strike와 ball이 없을 경우
				System.out.println("out");
			} else if (strike == 3) {
				System.out.println("win.");
				System.exit(0);
				//게임을 이기면 시스템을 종료.
			} else {
				System.out.println(strike + "strike "+ball+"ball");
	
			}
			System.out.println();
		}//game for end
		
		
		System.out.println("패배");
		//10번 이내에 승리를 못할 경우 game for문을 빠져나와 패배가 출력된다. 

	}// main end

}
