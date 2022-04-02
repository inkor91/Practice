package baekjoon;

import java.util.Scanner;

// Sounds fishy! 
// he input will be four positive integers, representing the depth readings. 
// Each integer will be on its own line of input.
// The output is one of four possibilities. If the depth readings are increasing, then the output should be Fish Rising. 
// If the depth readings are decreasing, then the output should be Fish Diving. 
// If the depth readings are identical, then the output should be Fish At Constant Depth. 
// Otherwise, the output should be No Fish.

public class Baekjoon6764 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		if (a < b && b < c && c < d) {
			System.out.println("Fish Rising");
		}else if(a > b && b > c  && c > d) {
			System.out.println("Fish Diving");
		}else if(a == b && b == c && c == d) {
			System.out.println("Fish At Constant Depth");
		}else {
			System.out.println("No Fish");
		}
	}

}
