package codeup;

import java.util.Scanner;

// 1282 : 제곱수 만들기
// n이 입력되면 k를 빼서 제곱수를 만들 수 있는 k를 구하고,
// 그 제곱수에 루트를 씌운 수(제곱근) t를 구하여라.
// 이 때 k는 여러가지가 될 수 있는데 가장 작은 k를 출력한다.

// n이 입력된다.(0<k<n<=231)

public class codeup1282 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = 0;
		
		for (long t = n; t>0; t--) {
			if(t*t < n) {
				k = n-(t*t);
				System.out.println(k+" "+t);
				break;
			}
		}
	}
}
