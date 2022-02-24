package baekjoon;

import java.util.Scanner;

// 방학 숙제
// 한 줄에 하나씩 총 다섯 줄에 걸쳐 L, A, B, C, D가 주어진다. 
// 항상 방학 숙제를 방학 기간내에 다 할 수 있는 경우만 입력으로 주어진다.
// 첫째 줄에 상근이가 놀 수 있는 날의 최댓값을 출력한다.

public class Baekjoon5532 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int max = 0;
		if(A%C==0) {
			max = (A/C);
		}else {
			max = (A/C)+1;
		}
		if(B%D==0) {
			max = Math.max(max, B/D);
		}else {
			max = Math.max(max, (B/D)+1);
		}
		System.out.println(L-max);
	}
}
