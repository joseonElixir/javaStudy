package day00;

public class Car {
	
	int tire;
	String brand;
	int color;
	
	public String getColor() {
		if(color ==1) {
			
		return "red";
		
		}else if(color == 2) {
			return "blue";
			
		}else {return "null";}	
		
	
	}
	public void setColor(int color) {
		this.color = color;
	}
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire = tire;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	
	
		
}
