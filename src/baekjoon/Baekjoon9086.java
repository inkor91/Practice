package baekjoon;

import java.util.Scanner;

// 9086��
// ���ڿ�
// ���ڿ��� �Է����� �ָ� ���ڿ��� ù ���ڿ� ������ ���ڸ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
// �Է��� ù �ٿ��� �׽�Ʈ ���̽��� ���� T(1 �� T �� 10)�� �־�����. �� �׽�Ʈ ���̽��� �� �ٿ� �ϳ��� ���ڿ��� �־�����. 
// ���ڿ��� ���ĺ� A~Z �빮�ڷ� �̷������ ���ĺ� ���̿� ������ ������ ���ڿ��� ���̴� 1000���� �۴�.
// �� �׽�Ʈ ���̽��� ���ؼ� �־��� ���ڿ��� ù ���ڿ� ������ ���ڸ� �����Ͽ� ����Ѵ�.

public class Baekjoon9086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
		}
	}
}
