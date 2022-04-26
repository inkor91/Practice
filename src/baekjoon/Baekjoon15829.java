package baekjoon;

import java.io.IOException;
import java.util.Scanner;

// Hashing
// 첫 줄에는 문자열의 길이 L이 들어온다. 둘째 줄에는 영문 소문자로만 이루어진 문자열이 들어온다.
// 입력으로 주어지는 문자열은 모두 알파벳 소문자로만 구성되어 있다.
// 문제에서 주어진 해시함수와 입력으로 주어진 문자열을 사용해 계산한 해시 값을 정수로 출력한다.

public class Baekjoon15829 {
	static final int M = 123456789;
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int L = Integer.parseInt(sc.nextLine());
		String S = sc.nextLine();
		long result = 0;
		long pow = 1;
		for (int i = 0; i < L; i++) {
			result += ((S.charAt(i) - 96) * pow);
			pow = (pow *31) % 1234567891;
		}
		System.out.println(result % 1234567891);
	}
}
