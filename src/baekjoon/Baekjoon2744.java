package baekjoon;

import java.util.Scanner;

// 2744��
// ��ҹ��� �ٲٱ�
// ���� �ҹ��ڿ� �빮�ڷ� �̷���� �ܾ �Է¹��� ��, �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� �ٲپ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
// ù° �ٿ� ���� �ҹ��ڿ� �빮�ڷθ� �̷���� �ܾ �־�����. �ܾ��� ���̴� �ִ� 100�̴�.
// ù° �ٿ� �Է����� �־��� �ܾ�� �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� �ٲ� �ܾ ����Ѵ�.

public class Baekjoon2744 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char[] arr;
		arr = str.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			if(65 <= arr[i] && arr[i] <= 90) {
				arr[i] = (char) (arr[i] + 32);
				continue;
			}
			if(97 <= arr[i] && arr[i] <= 122) {
				arr[i] = (char) (arr[i] - 32);
				continue;
			}
		}
		System.out.println(arr);
	}
}
