package com.sinha.aniket;

import java.util.Scanner;

public class SumOfPrimeNumbers {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		if (T >= 1 && T <= 100) {
			for (int tc = 1; tc <= T; tc++) {
				int N = sc.nextInt();

				if (N >= 1 && N <= 10000) {

					boolean primeNum[] = new boolean[N + 1];
					// Lets consider All no. to be prime no. initially.
					for (int i = 1; i <= N; i++){
						primeNum[i] = true;
					}
					
					for (int p = 2; p * p <= N; p++) {
						if (primeNum[p] == true) {
							for (int i = p * p; i <= N; i += p)
								primeNum[i] = false;
						}
					}
					 int sum = 0;

					for (int i = 2; i <= N; i++) {
						if (primeNum[i]==true ){
							sum =sum + i; 
							System.out.println(sum);
						}
					}
				}
			}
		}
	}
}
