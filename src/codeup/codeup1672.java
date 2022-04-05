package codeup;

// 1672 : 철근 자르기 
// 철근을 잘라 건설 재료로 납품하는 회사가 있다.
// 이 회사는 철근을 기계에 넣으면 원하는 길이로 알아서 잘라주는 자동 절단 시스템을 갖추고 있다.
// 회사의 자재 관리를 담당하고 호성이는 길이가 n인 철근을 이 기계에 넣고, 
// 원하는 길이 k만큼 잘랐을 때 각 철근에 대한 자재 번호를 생성하는 일을 해야 한다.
// 예를 들어 철근의 길이가 100이고, 3만큼 잘랐을 경우, 33개로 자를 수 있다. 
// 길이가 3이 되지 않고 남은 마지막 부분은 사용하지 못하므로 제외한다.
// 자재 번호는 F−0001부터 1씩 증가하면서 생성이 되는데, 이 경우는 F−0001, F−0002, ..., F−0033까지 생성된다. 
// 호성이가 필요한 자재 번호를 생성하는 프로그램을 작성하시오.

import java.util.Scanner;

public class codeup1672 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j = 0;
		int a = sc.nextInt();
		int b = sc.nextInt();
		j = a/b;
		if(j>=10000) {
			System.out.println("번호 초과 오류");
		}else {
			for (i = 1; i <= j; i++) {
				System.out.printf("F-%04d\n",i);
			}
		}
	}
}
