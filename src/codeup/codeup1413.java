package codeup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

// 1413 : 말하는 앵무새
// ① 첫 번째 줄에 한 문장을 입력한다.(100글자 이내)이
// ② 문장에는 띄어쓰기도 입력할 수 있다.
// ③ 모든 문자는 알파벳 대문자, 소문자, 공백문자로만 이루어진다.

public class codeup1413 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		char[] arrLine = new char[str.length()];
//		
//		for (int i = 1; i <= arrLine.length; i++) {
//			arrLine[arrLine.length-i] = str.charAt(i-1);
//		}
//		
//		for(char i :arrLine) {
//			System.out.print(i);
//		}
		
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		List<Character>list = new ArrayList<>();
		for(char each:arr) {
			list.add(each);
		}
		Collections.reverse(list);
		ListIterator li = list.listIterator();
		while(li.hasNext()) {
			System.out.print(li.next());
		}
	}
}
