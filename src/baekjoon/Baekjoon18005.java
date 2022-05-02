package baekjoon;

import java.util.Scanner;

// Even or Odd? 
// Your friend has secretly picked n consecutive positive integers between 1 and 1018 and
// wants you to guess if their sum is even or odd.
// If the sum must be even, write 2. If the sum must be odd, write 1. 
// If the sum could be even or could be odd, write 0.

// The single line of input contains a single integer n (1 ≤ n ≤ 109).

// Output 2 if the sum of any n consecutive integers in the range from 1 to 1018 must be even, 
// 1 if the sum must be odd, or 0 if the sum could be either even or odd.

public class Baekjoon18005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input%2==1) {
			System.out.println(0);
			return;
		}else {
			if((1+input)%2==1 && (input/2)%2==1) {
				System.out.println(1);
				return;
			}else {
				System.out.println(2);
				return;
			}
		}
	}
}
