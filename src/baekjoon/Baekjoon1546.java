package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

// 첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.

public class Baekjoon1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double arr[] = new double[sc.nextInt()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		
		double sum = 0;
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			sum += ((arr[i] / arr[arr.length-1])* 100);
		}
		System.out.println(sum/arr.length);
	}
}
