package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

// 세수정렬
// 동규는 세수를 하다가 정렬이 하고싶어졌다.
// 숫자 세 개를 생각한 뒤에, 이를 오름차순으로 정렬하고 싶어 졌다.
// 숫자 세 개가 주어졌을 때, 가장 작은 수, 그 다음 수, 가장 큰 수를 출력하는 프로그램을 작성하시오

public class Baekjoon2752 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int [3];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
	}
}
