package baekjoon;

import java.util.Scanner;

// X보다 작은 수
// X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다.
// X보다 작은 수는 적어도 하나 존재한다.

public class Baekjoon10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int arr[] = new int[N];
		
		for (int i =0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i=0; i < N; i++) {
			if (arr[i] < X) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
