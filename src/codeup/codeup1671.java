package codeup;

import java.util.Scanner;

// 1671 : 가위바위보 게임 해결
// 광현이와 컴퓨터가 가위바위보 게임을 한다. 
// 가위바위보 게임의 규칙이 다음과 같을때 결과를 출력하시오.
// (※ 바위=0, 가위=1, 보=2를 말한다.)
// 1. 바위(0)는 가위(1)를 이긴다.
// 2. 가위(1)는 보(2)를 이긴다.
// 3. 보(2)는 바위(0)를 이긴다.
// 4. 같은 것을 내면 비긴다.
// 입출력의 설명을 참고하여 가위바위보 게임의 결과를 출력하시오.
// 결과는 광현이 중심으로 출력한다.

public class codeup1671 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a==b) {
			System.out.println("tie");
		}else if((a==0 && b==2) || (a==1 && b==0) || (a==2 && b==1)) {
			System.out.println("lose");
		}else {
			System.out.println("win");
		}
	}
}
