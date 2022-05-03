package codeup;

import java.util.Scanner;

public class codeup1853 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		loop(1,count,0);
	}
	
	public static void loop(int start, int end, int total) {
		if (start > end) {
			System.out.println(total);
		} else {
			loop(start+1, end, total+start);
		}
	}
}
