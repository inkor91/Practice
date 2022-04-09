package codeup;

import java.util.Scanner;

public class codeup1675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		
		for (int i = 0; i < n.length(); i++) {
			if(n.charAt(i)==32) {
				System.out.print(' ');
			}else if(n.charAt(i)<100) {
				System.out.print((char)(122-(99-n.charAt(i))));
			}else {
				System.out.print((char)(n.charAt(i)-3));
			}
		}
	}
}
