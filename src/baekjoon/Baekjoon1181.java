package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 단어 정렬
// 첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 
// 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 
// 주어지는 문자열의 길이는 50을 넘지 않는다.
// 조건에 따라 정렬하여 단어들을 출력한다. 
// 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.

public class Baekjoon1181 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] arr = new String[N];
		
		sc.nextLine();
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}
				else {
					return s1.length() - s2.length();
				}
			}
		});
		
		System.out.println(arr[0]);
		
		for (int i = 1; i < N; i++) {
			if (!arr[i].equals(arr[i - 1])) {
				System.out.println(arr[i]);
			}
		}
	}
}
