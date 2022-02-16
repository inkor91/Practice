package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon14928 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		long r = 0;
		for (int i = 0; i < n.length(); i++) {
			r = (r*10 + (n.charAt(i)-'0')) % 20000303;
		}
		System.out.println(r);
		
	}
}
