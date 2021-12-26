package codeup;

import java.util.Arrays;
import java.util.Scanner;

// 1172 : 세 수 정렬하기
// 세 정수가 입력된다.
// 낮은 숫자 부터 출력한다.

public class codeup1172 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		for (int i = 0; i < 3; i++) {
			arr[i]= sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
