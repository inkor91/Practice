package codeup;

import java.util.Scanner;

public class codeup1856 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		System.out.println(stair(n));
	}
	
	public static int stair(int n) {
		if (n == 1) 
			return 1;
		else if (n ==2) 
			return 2;
		else if (n == 3)
			return 4;
		else {
			return stair(n-3) + stair(n-2) + stair(n-1);
		}
	}
}
