package runner;

public class AirplaneRunner {
	public static void main(String[] args) {
		Airplane asia = new Airplane();
		Airplane china = new Airplane();
		Airplane japan = new Airplane();
		asia.start();
		china.start();
		japan.start();
		
		asia.setSpeed(40);
		china.setSpeed(50);
		japan.setSpeed(60);
		System.out.println(asia.getSpeed());
		System.out.println(china.getSpeed());
		System.out.println(japan.getSpeed());
	}

}
