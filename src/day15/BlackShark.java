package day15;

public class BlackShark extends BaseCar{
	
	String skill;
	
	public BlackShark(String name, int speed,String skill) {
		this.carName = name;
		this.maxSpeed= speed;
		this.skill=skill;
	}
	
	public void getInfo() {
		super.getInfo();
		System.out.println("½ºÅ³ : "+ skill);
	}

}
