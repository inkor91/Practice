package baekjoon;

import java.util.Scanner;

// Bottle Return
// Input consists of a single line containing 6 space separated integer values representing the number of empty containers of beer, malt, wine products, carbonated soft drinks, seltzer and water. 
// Each value will be in the range [0, 100].
// The output consists of a single line that contains a single integer representing the total refund the customer should get in cents.

public class Baekjoon21300 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int beer = sc.nextInt();
		int malt = sc.nextInt();
		int wine = sc.nextInt();
		int softdrink = sc.nextInt();
		int seltzer = sc.nextInt();
		int water = sc.nextInt();
		System.out.println((beer+malt+wine+softdrink+seltzer+water)*5);
	}
}
