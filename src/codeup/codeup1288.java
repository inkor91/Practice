package codeup;

import java.util.Scanner;

// 1288 : nCr (Tiny)
// n과 r이 입력된다. (1<=r<=n<=12)
// nCr의 값을 출력한다.

public class codeup1288 {
	 public static void main(String[] args) {
		
	  Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int r = sc.nextInt();
      
      int result = factorial(n)/(factorial(r)*factorial(n-r));
      
      System.out.println(result);
      
      sc.close();
  }

  public static int factorial(int num){
      int sum=1;
      for(int i=1; i<=num; i++){
          sum *=i;
      }
      return sum;
  }

}
