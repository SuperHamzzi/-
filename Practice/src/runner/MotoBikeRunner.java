package runner;

public class MotoBikeRunner {

	public static void main(String[] args) {
		
		MotorBike ducati = new MotorBike(100); 
 		
		MotorBike honda = new MotorBike(200);
	
		ducati.start();
		honda. start();
//	
//		ducati.setSpeed(100);
		
		ducati.increaseSpeed(100);
		
		honda.increaseSpeed(100);

//		ducati.decreaseSpeed(250);
//		
//		honda.decreaseSpeed(250);

		
		
		 
		 System.out.println(ducati.getSpeed());
		 System.out.println(honda.getSpeed());

		

	}

}
