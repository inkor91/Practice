package baekjoon;

import java.util.Scanner;

// 1259 팰린드롬수
// 어떤 단어를 뒤에서부터 읽어도 똑같다면 그 단어를 팰린드롬이라고 한다. 'radar', 'sees'는 팰린드롬이다.
// 수도 팰린드롬으로 취급할 수 있다. 수의 숫자들을 뒤에서부터 읽어도 같다면 그 수는 팰린드롬수다. 
// 121, 12421 등은 팰린드롬수다. 123, 1231은 뒤에서부터 읽으면 다르므로 팰린드롬수가 아니다. 
// 또한 10도 팰린드롬수가 아닌데, 앞에 무의미한 0이 올 수 있다면 010이 되어 팰린드롬수로 취급할 수도 있지만, 
// 특별히 이번 문제에서는 무의미한 0이 앞에 올 수 없다고 하자.

public class Baekjoon1259 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String N = sc.next();
			if(N.equals("0")) System.exit(0);
			
			String[] arr = new String[N.length()];
			String[] arr2 = new String[N.length()];
			
			for(int i=0; i<N.length();i++) arr[i] = N.substring(i, i+1);
			
			for (int i=0; i < N.length(); i++) {
				arr2[i] = arr[N.length()-1-i];
			}
			
			int count = 0;
			for (int i=0; i<N.length(); i++) {
				if(arr[i].equals(arr2[i])) count++;
			}
			
			if(count == N.length()) System.out.println("yes");
			else System.out.println("no");
		}
	}
}
