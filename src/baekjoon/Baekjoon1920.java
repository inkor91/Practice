package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

// 1920 수 찾기
// 첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다.
// 다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다. 다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다. 
// 모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.
// M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.

public class Baekjoon1920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int M = sc.nextInt();
		
		for (int i = 0; i < M; i++) {

			if (binarySearch(arr, sc.nextInt()) >= 0) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}
	
	public static int binarySearch(int[]arr, int key) {
		
		int lo = 0;
		int hi = arr.length -1;
		
		while(lo <= hi) {
			int mid = (lo +hi) / 2;
			
			if(key < arr[mid]) {
				hi = mid -1;
			}
			
			else if(key>arr[mid]) {
				lo = mid + 1;
			}
			
			else {
				return mid;
			}
		}	
		return -1;
	}
}
