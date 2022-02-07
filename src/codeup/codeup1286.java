package codeup;

import java.util.Arrays;
import java.util.Scanner;

// 1286 : 최댓값, 최솟값
// 5개의 정수가 한 줄에 하나씩 입력된다
// 첫째줄에 최댓값을 출력한다.
// 둘째줄에 최솟값을 출력한다.

public class codeup1286 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int [] arData = new int[5];
		
			for (int i = 0; i < arData.length; i++) {
				arData[i] = sc.nextInt();
			}
		
		Arrays.sort(arData);
		
		System.out.println(arData[4]);
		System.out.println(arData[0]);
		
		}
	}
	
