package baekjoon;

import java.util.Scanner;

// 10807�� ���� ���� 
// �� N���� ������ �־����� ��, ���� v�� �� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// ù° �ٿ� ������ ���� N(1 �� N �� 100)�� �־�����. ��° �ٿ��� ������ �������� ���еǾ����ִ�. 
// ��° �ٿ��� ã������ �ϴ� ���� v�� �־�����. �Է����� �־����� ������ v�� -100���� ũ�ų� ������, 100���� �۰ų� ����.
// ù° �ٿ� �Է����� �־��� N���� ���� �߿� v�� �� ������ ����Ѵ�.

public class Baekjoon10807 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[N];
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
		}
		
		int v = sc.nextInt();
		
		for (int i = 0; i < array.length; i++) {
			if (v == array[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
