package runner;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BookRunner {
	public static void main(String[] args) {
//		Book artOfComputerProgramming =new Book(100); 
//	Book effectiveJava =new Book(50); 
//	Book cleanCode =new Book(40); 
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2);
		
		System.out.println(now.getYear());
		System.out.println(now2.getDayOfMonth());
	}

}



  