package baekjoon;

import java.util.Scanner;

// ���� �� ���� ��..? 
// 5597��
// X���� M�������� ���α׷��� ������ �ð� �ִ�. ���ǿ� �л��� 30���� �ִµ�, �л� ��ο� �� �л����� 1������ 30������ �⼮��ȣ�� �پ� �ִ�.
// �������� ���� Ư�������� 28���� �����ߴµ�, �� �߿��� ���� �� �� �л� 2���� �⼮��ȣ�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// �Է��� �� 28�ٷ� �� ������(�л�)�� �⼮��ȣ n(1 �� n �� 30)�� �� �ٿ� �ϳ��� �־�����. �⼮��ȣ�� �ߺ��� ����.
// ����� 2���̴�. 1��° �ٿ� �������� ���� �л��� �⼮��ȣ �� ���� ���� ���� ����ϰ�, 2��° �ٿ��� �� ���� �⼮��ȣ�� ����Ѵ�.

public class Baekjoon5597 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] student = new int[31];
		
		for (int i = 1; i < 29; i++) {
			int submit = sc.nextInt();
			student[submit] = 1;
		}
		for (int i = 1; i < student.length; i++) {
			if (student[i] != 1) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
