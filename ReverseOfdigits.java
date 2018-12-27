package com.sinha.aniket;

import java.util.Scanner;

public class ReverseOfdigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		if (T >= 1 && T <= 100) {
			for (int i = 1; i <= T; i++) {
				int reverse = 0;
				int N = sc.nextInt();
				if (N >= 1 && N <= Math.pow(10, 9)) {
					while (N > 0) {
						int rem = N % 10;
						reverse = reverse * 10 + rem;
						N = N / 10;
					}
					System.out.println(reverse);
				}
			}
		}
	}
}
