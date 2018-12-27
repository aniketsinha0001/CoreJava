package com.sinha.aniket;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		if (T >= 1 && T <= 19) {
			for (int i = 1; i <= T; i++) {
				int N = sc.nextInt();

				if (N >= 0 && N <= 18) {
					long fact = 1;
					for (int j = 1; j <= N; j++) {
						fact = fact * j;
					}
					System.out.println(fact);
				}
			}
		}
	}
}
