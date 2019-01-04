package com.sinha.aniket;

import java.util.Scanner;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		if (T >= 1 && T <= 100) {
			for (int tc = 1; tc <= T; tc++) {
				long N = sc.nextInt();
				if (N >= 2 && N <= Math.pow(10, 10)) {
					boolean primeNum[] = new boolean[(int) (N + 1)];
					// Lets consider All no. to be prime no. initially.
					for (int i = 1; i <= N; i++) {
						primeNum[i] = true;
					}

					for (int p = 2; p * p <= N; p++) {
						if (primeNum[p] == true) {
							for (int i = p * p; i <= N; i += p)
								primeNum[i] = false; // Eliminating No. which is divisble by Prime No.
						}
					}
					int sum = 0;
					int largestPrimeFactor = 0;
					for (int i = 2; i <= N; i++) {
						if (primeNum[i] == true) {
							sum = sum + i;
							System.out.print(" "+i); //Find Prime No.
							if (N % i == 0) { // check if the N is divisible by Prime No.
								largestPrimeFactor = i;
							}
						}
					}
					System.out.println("largestPrimeFactor " + largestPrimeFactor);
					System.out.print(sum);
				}
			}
		}

	}

}
