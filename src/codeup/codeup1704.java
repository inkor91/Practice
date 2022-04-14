package codeup;

import java.util.Scanner;

public class codeup1704 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int yymd = Integer.parseInt(num.substring(0,2));
		int regnum = Integer.parseInt(num.substring(7,8));
		
		int age;
		
		if (regnum==1 || regnum ==2 ) {
			age = 112-yymd+1;
		}else {
			System.out.println(yymd);
			age = 12-regnum+1;
		}
		System.out.println(age + " " + ((regnum==1||regnum==3)? "M" : "F"));
	}
}
