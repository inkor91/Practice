package baekjoon;

import java.util.Scanner;

// Equality
// The first and the only line of input contains a string of the form:
//a + b = c
// It is guaranteed that a, b, and c are single-digit positive integers. 
//The input line will have exactly 9 characters, 
//formatted exactly as shown, with a single space separating each number 
//and arithmetic operator.

// Print, on a single line, YES if the sum is correct; otherwise, print NO.

public class Baekjoon13985 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String result = s.replaceAll(" ", "");
		char num1 = result.charAt(0);
		char num2 = result.charAt(2);
		char num3 = result.charAt(4);
		int n1 = Character.getNumericValue(num1); 
		int n2 = Character.getNumericValue(num2); 
		int n3 = Character.getNumericValue(num3); 
		if(n1+n2 == n3) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}
}