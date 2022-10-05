package java_primitve_data_types;

import java.math.BigDecimal;
import java.util.Scanner;


public class runner {
	public static void main(String[] args) {
		SimpleCalculator calculator = new SimpleCalculator("4500.00", "7.5");
		BigDecimal totalValue = calculator.calculateTotalValue(5);
		System.out.println(totalValue);
	}

}
