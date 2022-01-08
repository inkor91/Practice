package codeup;

import java.util.Scanner;

// 1230 : 터널 통과하기 2
// 터널 a,b,c의 높이가 공백으로 분리되어 차례대로 3개 입력된다. (정수)
// 높이가 170인 차가 잘 통과할 수 있으면 PASS를 출력, 170보다 같거나 작으면 CRASH 처음 충돌한 터널 높이를 출력하시오

public class codeup1230 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ta = sc.nextInt();
		int tb = sc.nextInt();
		int tc = sc.nextInt();
		
		int car = 170;
			
		if(car>=ta) {
			System.out.println("CRASH"+" "+ta);
		}else if(car<=ta&&car>=tb) {
			System.out.println("CRASH"+" "+tb);
		}else if(car<=ta&&car<=tb&&car>=tc) {
			System.out.println("CRASH"+" "+tc);
		}else {
			System.out.println("PASS");
		}
	
	}
}
