package fanRunner;

public class FanRunner {
	public static void main(String[] args) {
		Fan fan = new Fan("samsung1",5.5,"Red");
	
		fan.switchOn();
		fan.setSpeed((byte)5);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
	}
}
