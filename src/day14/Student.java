package day14;

public class Student {

	private String name;
	private int age;
	private String address;
	private String phoneNum;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private int avg;
	

	
	public String getName() {//getter -- 반환 o 매개변수 x
		return this.name;
	}
	public void setName(String name) {//setter -- 반환 x 매개변수 o
		this.name = name;
	}
	public int getAge() {//intget, voidset
		return this.age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getAddress() {//Strigget voidset
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNum() {//Stringget , voidset
		return this.phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum=phoneNum;
	}
	public int getKor() {//intget voidset
		return this.kor;
	}
	public void setKor(int kor) {
		this.kor= kor;
	}
	public int getEng() {//intget voidset
		return this.eng;
	}
	public void setEng(int eng) {
		this.eng=eng;
	}
	public int getMath() {//intget voidset
		return this.math;
	}
	public void setMath(int math) {
		this.math= math;
	}
	public int getSum() {//intget voidset
		return this.sum;
	}
	public void setSum(int sum) {
		this.sum=sum;
	}
	public int getAvg() {//intget voidset
		return this.avg;
	}
	public void setAvg(int avg) {
		this.avg=avg;
	}
	
	
	
	
	
	
	
}
