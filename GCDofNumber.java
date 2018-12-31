package com.sinha.aniket;

import java.util.Scanner;

public class GCDofNumber {
	static int temp;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		if (T >= 1 && T <= 100) {
			for (int i = 1; i <= T; i++) {
				int A = sc.nextInt();
				int B = sc.nextInt();
				if (A >= 1 && A <= 1000 && B >= 1 && B <= 1000) {
					int gcd = 1;
					if (A > B) {
						temp = A - B;
					} else {
						temp = B - A;
					}
					for (int j = 2; j <= temp; j++) {
						if (A % j == 0 && B % j == 0) {
							gcd = j;
						}
					}
					System.out.println(gcd);
				}
			}
		}

	}

}
