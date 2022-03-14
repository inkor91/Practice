package baekjoon;

import java.util.Scanner;

// 연세대학교 
// 연세대학교의 영문명은 YONSEI, 슬로건은 Leading the Way to the Future이다.
// 이를 출력하는 프로그램을 작성해보도록 하자.
// N = 0일 경우: 연세대학교의 영문명을 출력한다.
// N = 1일 경우: 연세대학교의 슬로건을 출력한다.

public class Baekjoon15680 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N==0) {
			System.out.println("YONSEI");
		}else if(N==1) {
			System.out.println("Leading the Way to the Future");
		}
	}
}
