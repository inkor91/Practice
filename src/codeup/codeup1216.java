package codeup;

import java.util.Scanner;

// 1216 : 컨설팅 회사
// 입력으로 세 정수가 입력된다. 
// 첫번째 정수는 홍보를 하지 않을 경우 수입,
// 두번째 정수는 홍보를 할 경우의 수입,
// 세번째 정수는 홍보비용을 의미한다.
// 10 100 70


public class codeup1216 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int notadv = sc.nextInt();
		int adv = sc.nextInt();
		int advprice = sc.nextInt();
		
		int result = adv - advprice;
		
		if(result==notadv) {
			System.out.println("does not matter");
		}else if(result>notadv) {
			System.out.println("advertise");
		}else {
			System.out.println("do not advertise");
		}
	}
}
