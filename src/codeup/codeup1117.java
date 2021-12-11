package codeup;

import java.util.Scanner;

public class codeup1117 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		double result = num1*num2;
		
		result = (double)Math.round(result*100);
		result /= 100;
		
		System.out.println(result);
	}
}
