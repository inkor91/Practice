package codeup;


import java.util.Scanner;

//1256 : 별 출력하기 해
//별(*)을 개수만큼 출력한다.

public class codeup1256 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i = 0; i < a; i++) {
			System.out.printf("*");
		}
	}
}
