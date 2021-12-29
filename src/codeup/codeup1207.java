package codeup;

import java.util.Scanner;

public class codeup1207 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] cases = new int[4];
		int count = 0;
		for (int i = 0; i < cases.length; i++) {
			cases[i] = sc.nextInt();
			if(cases[i]==1) {
				count++;
			}
		}
		
		switch(count) {
		case 1 : System.out.println("도");
		break;
		case 2 : System.out.println("개");
		break;
		case 3 : System.out.println("걸");
		break;
		case 4: System.out.println("윷");
		break;
		default: System.out.println("모");
		}
	}
}
