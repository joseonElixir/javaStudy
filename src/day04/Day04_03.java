package day04;

public class Day04_03 {

	public static void main(String[] args) {

		String name = "Hong";
		int age = 20;
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.print("name : \t" + name + "\n");
		System.out.print("age : \r" + age + "\n");
		/* \r은 \n과 같아보이지만 실제로는 덮어쓰는거임. 
		 * cmd 상에서는 해당 줄의 가장 앞줄로 넘어가서 덮어쓰기 됨.
		 */
		System.out.printf("이름 : %s 이다!\n", name);
		System.out.printf("나이 : %d 이다!\n", age);
		System.out.printf("이름 : %s\n나이 : %d\n", name,age);
		
		System.out.println("저의 이름은\""+name+"\"입니다.");
		System.out.println("저의 이름은\"홍길동\"입니다.");
		System.out.println("나이는\""+age+"살\"입니다.");
		System.out.println("\\ \' 등의 특수문자를 사용할 때 앞에 \\를 입력.");
		System.out.println("구글링을 잘하는 것이 코딩을 잘하는 법");
		// 역슬래시 \는 기능이 있는 문자에는 기능을 죽이고,
		//기능이 없는 문자에 기능을 부여할 수 있음.
		
		
	
	
	
	
	}

}
