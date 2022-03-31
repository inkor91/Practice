package codeup;

import java.util.Arrays;
import java.util.Scanner;

// 1618 : 줄 세우기
// 세 정수값을 입력한다.(각 사람의 몸무게 값은 200 이하의 자연수이다.)
// 몸무게가 가벼운 사람부터 무거운 사람의 순서로 출력한다.

public class codeup1618 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] weight = new int[3];
		for (int i = 0; i < 3; i++) {
			weight[i] = sc.nextInt();
		}
		
		Arrays.sort(weight);
		for(int i:weight) {
			System.out.print(i+" ");
		}
	}
}
