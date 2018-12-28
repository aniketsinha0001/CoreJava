package com.sinha.aniket;

import java.util.Scanner;

public class CalculateNPR {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		if (T >= 1 && T <= 100) {
			for (int k = 1; k <= T; k++) {
				int N = sc.nextInt();
				int R = sc.nextInt();
				if (N >= R && N >= 1 && N <= 20 && R >= 1 && R <= 20) {

					long factN = calculateFactN(N);
					long factNminusR = calculateFactN(N - R);
					double npr = factN / factNminusR;
					System.out.println((long)npr);
				}
			}
		}
	}

	public static long calculateFactN(long n) {
		long fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
