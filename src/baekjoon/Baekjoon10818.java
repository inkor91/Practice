package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon10818 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for (int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr); // Arrays.sort()메서드 사용. 오름차순 정렬
		System.out.println(arr[0] + " " + arr[num-1]);
		// 최솟값은 배열의 첫번째 index 0 에, 최댓값은 배열의 마지막 (arr.length-1)에 위치
		
	}
	
	
	
	
}
