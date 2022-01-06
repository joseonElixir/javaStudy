package day14;

public class Year {

	private int year;

	public Year() { // 생성자 오버로드를 할 경우에 기본생성자를 작성하지 않을 경우에
		// 값을 입력받는 생성자가 기본 생성자가 됨. 그렇기 때문에 기본 생성자를 만들고
		// 그 후에 오버로드를 해줘야 함.
		year = 0;
	}

	public Year(int year) { // 생성자 오버로드
		this();
		this.year = year;
	}

	public void getInfo() {
		if ((year % 4 != 0 || year % 100 == 0) && year % 400 != 0) {
			System.out.println(year + "년은 평년입니다.");
		} else {
			System.out.println(year + "년은 윤년입니다.");
		}
	}

	public void getInfo(int year) { // 메소드 오버로드
		this.year = year;
		this.getInfo();
	}

}
