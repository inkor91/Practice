package baekjoon;

import java.util.Scanner;

// 상수 
// 첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 
// 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
// 첫째 줄에 상수의 대답을 출력한다.

public class Baekjoon2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
	
		System.out.println(A > B ? A : B);
	}
}
