package codeup;

import java.util.Scanner;

// 1674 : 불량품 검수하기
// △△사에는 휴대폰을 엄청나게 많이 생산한다.
// 생산량이 많아지다 보니 일정한 확률로 불량품이 생산된다.
// 이러한 불량품은 제품으로 출하되기 전에 선별되어야 한다.
// 불량품을 선별하기 위해서 간단한 코드를 개발했다.
// 각 제품을 테스트한 결과 얻어지는 신호값은 모두 정수이다.
// 이 신호값의 각 자릿수들의 합을 7로 나눈 나머지가 4이면 불량품이다.
// 입력되는 제품의 신호값을 이용하여 제품이 불량품인지 판단하는 프로그램을 작성하시오.

//1) 길이가 10자리로 구성된 10진수를 입력받는다.
//2) 각 자리는 0 ~ 9까지의 숫자로 구성된다.
// 프로그램의 조건에 따라 “Good”, 또는 “Bad”을 출력한다.

public class codeup1674 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hp = sc.nextLine();
		
		int sum = 0;
		for (int i = 0; i < hp.length(); i++) {
			sum += hp.charAt(i)-48;
		}
		
		if(sum%7==4) {
			System.out.println("Bad");
		}else {
			System.out.println("Good");
		}
	}
}
