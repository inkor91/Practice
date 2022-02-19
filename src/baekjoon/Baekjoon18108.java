package baekjoon;

import java.util.Scanner;

// 1998년생인 내가 태국에서는 2541년생?! 
// 서기 연도를 알아보고 싶은 불기 연도 y가 주어진다
// 불기 연도를 서기 연도로 변환한 결과를 출력한다.

public class Baekjoon18108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n-543);
    }
}