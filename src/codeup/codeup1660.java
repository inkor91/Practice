package codeup;

import java.util.Scanner;

// 1660 : 파싱(parsing) 1
// 정수와 컴마로 이루어진 문자열이 공백없이 입력된다.(최대길이 100글자)
// 컴마(,)를 분리한 결과를 출력한다.

public class codeup1660 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		st = st.replaceAll(",", " ");
		System.out.println(st);
	}
}
