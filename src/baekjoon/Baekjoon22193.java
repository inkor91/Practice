package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

// MultiplyMultiply
// Write a program that computes a product of two non-negative integers A and B. 
// The integers are represented in decimal notation and have N and M digits, respectively.

public class Baekjoon22193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int al = sc.nextInt();
		int bl = sc.nextInt();
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		System.out.println(a.multiply(b));
	}
}
