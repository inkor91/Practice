package baekjoon;

import java.util.Scanner;

//뉴비의 기준은 뭘까?	
// 뉴비를 1학년 혹은 2학년인 학생으로 정의 내렸고 뉴비를 정의하는 김에 올드비와 TLE도 정의 내리기로 하였습니다. 
// 올드비는 N학년 이하이면서 뉴비가 아닌 학생으로 정의하기로 하였고 
//TLE은 뉴비도 아니고 올드비도 아닌 학생으로 정의하였습니다.
// N과 M이 주어졌을 때, M학년이 뉴비인지 올드비인지 TLE인지 구별해 주세요.

public class Baekjoon19944 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int m = sc.nextInt();
		if (m <=2) {
			System.out.println("NEWBIE!");
		}else if (n < m) {
			System.out.println("TLE!");
		}else {
			System.out.println("OLDBIE!");
		}
	}
}
