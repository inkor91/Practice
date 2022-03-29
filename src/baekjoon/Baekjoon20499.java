package baekjoon;

import java.util.Scanner;

// Darius님 한타 안 함?
// K/D/A가 주저진다
// 진짜 이면  gosu 가짜이면 hasu를 출력한다.

public class Baekjoon20499 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[]arr = s.split("/");
		int K = Integer.parseInt(arr[0]);
		int D = Integer.parseInt(arr[1]);
		int A = Integer.parseInt(arr[2]);;
		if (K+A < D || D == 0) {
			System.out.println("hasu");
		}else {
			System.out.println("gosu");
		}
		
	}
}
