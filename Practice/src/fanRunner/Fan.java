package fanRunner;

public class Fan {
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed; //1 to 5
	

	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius =radius;
		this.color = color;
	}
	public String toString() {
		return String.format("make -%s, radius - %f, color - %s, isOn -%b, spped-%d",
				make,radius,color,isOn,speed);
	}

	public void isOn(boolean isOn) {
		this.isOn = isOn;
		
		
	}
	public void switchOn() {
		this.isOn =true;
	}
	public void switchOff() {
		this.isOn =false;
		setSpeed((byte)  0);
	}



	
	public void setSpeed(byte speed) {
		this.speed= speed;




	

	}
}

