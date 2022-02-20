package baekjoon;

import java.util.Scanner;

// Rats 

// Douglas is asking for your help to estimate the total number of rats in his area. 
//Looking up in your statistics textbook, you propose using the Chapman estimator N, given by:
// N := ⌊(n1 + 1)(n2 + 1)/(n12 + 1) - 1⌋
// where ⌊x⌋ is the floor of a real number x, i.e., the closest integer less than or equal to x.

public class Baekjoon18301 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n12 = sc.nextInt();
		int n = (n1+1)*(n2+1)/(n12+1)-1;
		System.out.println(n);
	}
}
