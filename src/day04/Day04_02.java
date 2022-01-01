package day04;

public class Day04_02 {
	public static void main(String[] args) {
		
		int kor = 80;
		int eng = 75;
		
		String korname = "국어";
		String engname = "영어";
		
		int sum = kor+eng;
		int avg = sum/2;
		int max = kor > eng ? kor : eng;
		String higher = kor > eng ? korname : engname;
		//스트링 하이어를 선언하고 코리아와 잉글리시를 비교를 했다.
		//그리고 그 값이 참일 경우 리턴값으로 코리아 네임을 리턴해주고,
		//그 값이 거짓일 경우 잉글리시 네임을 리턴해준다.
		// 코리아 > 잉글리시의 조건이 참이기 때문에 코리아네임이 리턴되었고,
		//그 결과 하이어에는 코리아넴에 저장된 값이 저장되었다.
		
		
		System.out.println(korname + " = "+kor);
		System.out.println(engname + " = "+eng);
		
		System.out.println("총점 = "+sum);
		System.out.println("평균 = "+avg);
		
		System.out.println(higher +"점수를 높게 받으셨습니다.");
		System.out.println(higher+" 점수 = " + max);
		
		
		
	}
}
