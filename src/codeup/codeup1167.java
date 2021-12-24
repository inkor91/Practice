package codeup;

import java.util.Scanner;

// 1167 : 두 번째 수
// 세 개의 정수가 공백으로 구분되어 입력된다. 
// 세 개의 정수를 작은 순서로 나열 했을 때, 두번째 수를 출력한다.

public class codeup1167 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a<=b && a<=c) { // a가 가작 작은경우
			if(b<=c) {  // b가 c보다 작으면
				System.out.println(b); // a<b<c 이므로 b가 출력
			}else {
				System.out.println(c); // a<c<b 이므로 c가 출력
			}
		}else if(b<=a && b<=c) { 	// b가 가장 작은 경우
			if(a<=c) { // a 가 c보다 작으면
				System.out.println(a); // b<a<c 이므로 a가 출력
			}else {
				System.out.println(c); // b<c<a 이므르  c가 출력
			}
		}else if(c<=a && c<=b) { // c가 가장 작은 경우
			if(b<=a) { // b가 a보다 작으면
				System.out.println(b); // c <b< c 이므로 b가 출력 
			}else { // 
				System.out.println(a);
			}
		}
	}
}
