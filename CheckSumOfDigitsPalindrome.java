package com.sinha.aniket;

/*Write a program to check if the sum of digits of a given number N is a palindrome number or not.

Input:
The first line of the input contains T denoting the number of testcases. T testcases follow. Then each of the T lines contains single positive integer N denoting the value of number.

Output:
For each testcase, in a new line, output "YES" if pallindrome else "NO". (without the quotes)

Constraints:
1 <= T <= 200
1 <= N <= 1000

Example:
Input:
2
56
98
Output:
YES
NO
*/
import java.util.Scanner;

public class CheckSumOfDigitsPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		if (T >= 1 && T <= 200) {
			for (int i = 1; i <= T; i++) {
				int sum = 0;
				int cal = 0;
				int N = sc.nextInt();
				int temp = N;
				if (N >= 1 && N <= 1000) {
					while (N > 0) {
						int rem = N % 10;
						sum = sum + rem;
						N = N / 10;
					}
					int reverse = sum;
					while (sum > 0) {
						int rem = sum % 10;
						cal = (cal * 10) + rem;
						sum = sum / 10;
					}
					if (reverse == cal) {
						System.out.println("YES");
					} else {
						System.out.println("NO");
					}
				}

			}
		}
	}
}
