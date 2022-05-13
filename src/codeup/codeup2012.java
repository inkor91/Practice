package codeup;

import java.util.Iterator;
import java.util.Scanner;

public class codeup2012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());

		int count = 0;
		for (int i = a; i <= b; i++) {
			for (int j = 0; j < String.valueOf(i).length(); j++) {
				if (String.valueOf(i).charAt(j) == '1') {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
