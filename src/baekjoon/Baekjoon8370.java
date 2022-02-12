package baekjoon;

import java.util.Scanner;

// Plane

// Byteland Airlines recently extended their aircraft fleet with a new model of a plane. 
// The new acquisition has n1 rows of seats in the business class and n2 rows in the economic class.
// In the business class each row contains k1 seats, while each row in the economic class has k2 seats.
//Write a program which:
//reads information about available seats in the plane,
//calculates the sum of all seats available in that plane,
//writes the result.

public class Baekjoon8370 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int k1 = sc.nextInt();
		int n2 = sc.nextInt();
		int k2 = sc.nextInt();
		
		System.out.println((n1*k1)+(n2*k2));
	}
}
