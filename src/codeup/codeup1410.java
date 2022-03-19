package codeup;

import java.util.Scanner;

//1410 : 올바른 괄호 1 (괄호 개수 세기) 
// 괄호로 이루어진 문자열이 입력된다. (길이 100,000 이하)
// 여는 괄호의 개수와 닫힌 괄호의 개수를 출력한다.

public class codeup1410 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String [] arr = str.split("");
		
		int cnt1 = 0;
		int cnt2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals("(")) {
				cnt1++;
			}
			
			else if(arr[i].equals(")")) {
				cnt2++;
			}
		}
		System.out.println(cnt1+" "+cnt2);
	}
}
