package baekjoon;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

// Circus 

public class Baekjoon20352 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal tentArea = new BigDecimal(sc.nextLine());
		
		double tentPerimeter = tentArea
				.multiply(BigDecimal.valueOf(Math.PI))
				.multiply(BigDecimal.valueOf(4))
				.sqrt(new MathContext(12)).doubleValue();
		
		System.out.println(tentPerimeter);
	}
}
