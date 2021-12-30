package codeup;

import java.util.Scanner;

// 1210 : 칼로리 계산하기
// 메뉴의 번호가 차례대로 두개 주어진다. (정수)
// 1. 치즈버거 : 400 칼로리
// 2. 야채버거 : 340 칼로리
// 3. 우유 : 170 칼로리
// 4. 계란말이 : 100 칼로리
// 5. 샐러드 : 70 칼로리
// 그 번호의 메뉴 칼로리를 계산하여 500보다 크면 "angry", 500이하면 "no angry"를 출력

public class codeup1210 {
	public static void main(String[] args) {
		String[] food = {"치즈버거","야채버거","우유","계란말이","샐러드"};
		int[] cal = {400,340,170,100,70};
		
		Scanner sc = new Scanner(System.in);
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		
		if(cal[m1-1]+cal[m2-1]>500) {
			System.out.println("angry");
		}else {
			System.out.println("not angry");
		}
		
	}
}

