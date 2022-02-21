package codeup;

import java.util.Scanner;

// 1356 : 사각형 출력하기 2
// 길이 n이 입력된다. (n >= 3)
// 사각형을 출력한다.
// 예)

//n이 5일때

//*****
//*   *
//*   *
//*   *
//*****

public class codeup1356 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <=n ; i++) { 
			if(i==1||i==n) {   
				for (int j = 1; j <= n; j++) { 
					System.out.print("*");
				}
			}else { 
				System.out.print("*");
				for (int j = 0; j < n-2; j++) {  
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
