package codeup;

import java.util.Scanner;

// 1414 : C언어를 찾아라
// ① 첫 번째 줄에 길이가 100 이하인 문자열이 입력된다. 문자는 모두 대문자 또는 소문자로 이루어진다.
// ② 대소문자의 구분이 없으므로 “C”는 2가지 경우, “CC”는 모두 서로 다른 4가지경우가 각각 존재할 수 있다.
// 첫 번째 줄에는 문자열에서 찾은 “C”의 개수를 출력한다.
// 두 번째 줄에는 문자열에서 찾은 “CC”의 개수를 출력한다.

public class codeup1414 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int cCount = 0;
		int ccCount = 0;
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == 'c' || line.charAt(i) == 'C') {
				cCount++;
			}

			if (i <= line.length() - 2) {
				String a = line.substring(i, i + 2);
				if (a.equals("CC") || a.equals("Cc") || a.equals("cC") || a.equals("cc")) {
							ccCount++;
				}
			}
		}
		System.out.println(cCount);
		System.out.println(ccCount);
	}
}
