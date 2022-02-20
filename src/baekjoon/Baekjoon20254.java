package baekjoon;

import java.util.Scanner;

// Site Score 
// The site score of 2020 Taipei-Hsinchu regional contest will be 56UR + 24TR + 14UO + 6TO. 
//Please write a program to compute the site score of the 2020 Taipei-Hsinchu regional contest.
// The input has only one line containing four blank-separated positive integers UR, TR, UO, and TO.
// Output the site score of the 2020 Taipei-Hsinchu regional contest.

public class Baekjoon20254 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int UR = sc.nextInt();
		int TR = sc.nextInt();
		int UO = sc.nextInt();
		int TO = sc.nextInt();
		System.out.println((UR*56)+(TR*24)+(UO*14)+(TO*6));
	}
}
