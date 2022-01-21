package codeup;

import java.util.Iterator;
import java.util.Scanner;

//1267 : n개의 수 중 5의 배수의 합
// n은 자연수, 그 다음 줄에 n개의 정수들이 입력으로 들어온다. (n<=1,000, 각 수는 0~100)
// n개의 자연수들 중 5의 배수의 합을 출력한다.

public class codeup1267 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		int []arr = new int[select];
		
		int c = 0;
		for (int i = 0; i < select; i++) {
				arr[i] = sc.nextInt();
				if(arr[i]%5==0) {
					c = c + arr[i];					
				}
		}
		System.out.println(c);
	}
}
