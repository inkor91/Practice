package baekjoon;

import java.util.Scanner;

// 카드 게임
// 표준 입력에서 다음과 같은 데이터를 읽어온다.
//i 번째 줄(1 ≤ i ≤ 5)에는 정수 Ai가 적혀있다. 이것은 i번째 게임에서의 JOI군의 점수를 나타낸다.
// 표준 출력에 JOI군의 총점을 한 줄로 출력하라.

public class Baekjoon5522 {
	public static void main(String[] args) {
		int arr[] = new int [5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
